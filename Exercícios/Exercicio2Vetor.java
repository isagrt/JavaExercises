/*Crie um programa que leia um vetor de 10 posições. Contar e escrever quantos 
valores pares e quantos valores ímpares ele possui.*/
import java.util.Scanner;

public class Exercicio2Vetor{

    public static void main(String[] args){
        int[] number = new int[10];
        Scanner scanner = new Scanner(System.in);
        int par = 0;
        int impar = 0;

        for (int i = 0; i<10; i++){
            System.out.println("Digite o "+(i + 1)+"° numero: ");
            number[i] = scanner.nextInt();

            if(number[i] % 2 == 0){
                par++  ;  
            }else{
                impar++;
            }
        }      
        System.out.print("Dos 10 digitados, "+par+" sao pares e "+impar+" sao impares");
    }
}