/*7. Faça um programa que receba 6 numeros inteiros e mostre: 
• Os numeros pares digitados; 
• A soma dos numeros pares digitados; 
• Os numeros ımpares digitados; 
• A quantidade de numeros ımpares digitados;
*/
import java.util.Scanner;

public class Exercicio7Vetor{
    public static void main (String[] args){
        int[] number = new int[6];
        Scanner scanner = new Scanner(System.in);
        int somaPar = 0;
        int qtdImpar = 0;

        for (int i = 0; i<6; i++){
            System.out.println("Digite o "+(i + 1)+" numero: ");
            number[i] = scanner.nextInt();

            if(number[i] % 2 == 0){
            somaPar += number[i];  
            }else{
             qtdImpar++;
            }
        }      
        
        System.out.print("\nNumeros pares: ");
        for (int i = 0; i < 6; i++) {
            if (number[i] % 2 == 0) {
                System.out.print(number[i] + " ");
            }
        }

        System.out.print("\nNumeros impares: ");
        for (int i = 0; i < 6; i++) {
            if (number[i] % 2 != 0) {
                System.out.print(number[i] + " ");
            }
        }

        System.out.println("\n\nSoma dos numeros pares: " + somaPar);
        System.out.println("Quantidade de numeros impares: " + qtdImpar);
}}