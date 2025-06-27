/*5. Faça um programa para ler a nota da prova de 15 alunos e armazene num vetor, 
calcule e imprima a média geral.*/

import java.util.Scanner;

public class Exercicio5Vetor {

    public static void main(String[] args){

        double[] notas = new double[15];//são 15 notas de cada aluno 
        double soma = 0;
        double media; //media para calculo geral
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i<15 ; i++){
        System.out.println("Digite a nota do "+(i+1)+" aluno:");
        notas[i] = scanner.nextDouble();
        soma = soma + notas[i];
    }
        media = soma / 15;
        System.out.println("A media geral da sala foi de: "+media);
    }
}