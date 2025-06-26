/*1. Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os 
valores lidos.
*/

import java.util.Scanner;

public class Exercicio1Vetor {
    public static void main(String[] args){
        String[] number = new String[6];
        Scanner scanner = new Scanner(System.in);
        int i; 

        for( i = 0; i < 6; i++){
            System.out.println("Digite o " +(i + 1)+"° numero:");
            number[i] = scanner.nextLine();
        }
        for( i = 0; i < 6; i++){
            System.out.print(number[i]+ " | ");
        }
        

    }

    
}