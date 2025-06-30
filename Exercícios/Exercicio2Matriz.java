/* 2. Crie em Java uma matriz 3x5 de inteiros, preencha a matriz e depois: 
a) Informe se a matriz possui elementos repetidos; 
b) A quantidade de numeros pares; 
c) A quantidade de numeros ímpares */

import java.util.Scanner;

public class Exercicio2Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        int impares = 0;
        int pares = 0; 
        
        for (int i = 0; i <3; i++){
            for (int y = 0; y < 5; y++) {
            matriz[i][y] = (int) (Math.random() * 100);
            System.out.print(matriz[i][y]+ "  ");

            if (matriz[i][y] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
        }
            System.out.println(" "); 
        }

        for (int i = 0; i <3; i++){
            for (int y = 0; y < 5; y++) {
                int matrizCopia = matriz[i][y];
                int cont = 0;
            
            for (int a = 0; a <3; a++){
            for (int b = 0; b < 5; b++){
                if(matriz[a][b] == matrizCopia){
                    cont++;
                }
            }
            }
            
            if (cont > 1) {
            System.out.println("Numero " +matrizCopia+ " esta repetido.");    
            }          
        }
    }}}