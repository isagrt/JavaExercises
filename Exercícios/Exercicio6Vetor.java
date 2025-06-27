/*6. Faça um programa que receba do usuário dois vetores, A e B, com 10 números 
inteiros cada. Crie um novo vetor denominado C calculando C = A - B. Mostre na 
tela os dados do vetor C*/

import java.util.Scanner;

public class Exercicio6Vetor{
    public static void main(String[]args){
        String[] A = new String[10];
        String[] B = new String[10];
        String[] C = new String[10];
        String[] soma = new String[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++ ){
            Sistem.out.println("Digite um valor para o primeiro vetor: ");
            A[i] = scanner.nextString();
        }
        
        for(int i = 0; i < 10; i++ ){
            Sistem.out.println("Digite um valor para o segundo vetor: ");
            B[i] = scanner.nextString();
        }

        C[i] = A[i] + B[i]; //erro, alterar!!

        System.out.println("Vetor A + Vetor B = "+C+" | ");

        
    }

}