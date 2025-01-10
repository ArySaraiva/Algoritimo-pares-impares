
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Digite a quantidade de numeros que irár digitar: ");
        int numeroDigitado = sc.nextInt();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();



        for (int i = 0; i < numeroDigitado; i++) {
            //System.out.println("Digite um numero: ");
            int num = sc.nextInt();
            if (num % 2==0){
                par.add(num);
            }else {
                impar.add(num);
            }
        }

        Collections.sort(par);
        impar.sort(Collections.reverseOrder());

        for (int num : par) {
            System.out.println(num);
        }

        for (int num : impar) {
            System.out.println(num);
        }

        sc.close();
        }



    }


