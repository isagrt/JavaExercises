/*4. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os 
valores lidos na ordem inversa.*/

import java.util.Scanner;

public class Exercicio4Vetor{

    public static void main(String[] args){
        int[] number = new int[6];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<6; i++){

            System.out.println("Digite o "+(i+1)+"° valor: ");
            number[i] = scanner.nextInt();
        }

        for(int i = 5; i>=0; i-- ){
            System.out.print(number[i]+ " | ");
        }
        

    }
}