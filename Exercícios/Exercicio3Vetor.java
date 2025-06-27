/* 3. Faça um programa que receba do usuário um vetor com 10 posições. Em seguida 
deverá ser impresso o maior e o menor elemento do vetor. */

import java.util.Scanner;

public class Exercicio3Vetor{
    public static void main(String[] args){
        int[] number = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1° numero: ");
        number[0] = scanner.nextInt();
         int maior = number[0];
        int menor = number[0];      

        for( int i = 1; i < 10; i++){

            System.out.println("Digite o "+(i + 1)+"° numero: ");
            number[i] = scanner.nextInt();

            if( number[i]>maior){
                maior = number[i];
            }
            if( number[i]<menor){
                menor = number[i];
            }       
        }
         System.out.println("O maior numero da lista é: " +maior);
            System.out.println("O menor numero da lista é: " +menor);
    }
}