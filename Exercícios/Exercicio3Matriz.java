/*3. Crie em Java uma matriz 4x4 de decimais, preencha a matriz e depois: 
a) Exiba os valores da sua diagonal principal; 
b) Exiba os valores da sua diagonal secundária; 
c) A sua matriz transposta. */
import java.util.Scanner;
public class Exercicio3Matriz {

    public static void main(String[] args) {
        double[][] matriz = new double[4][4];

            for (int i = 0; i <4; i++){
            for (int y = 0; y < 4; y++) {
            matriz[i][y] = (int) (Math.random() * 20);
            System.out.print(matriz[i][y]+ "  ");
            
            }
            System.out.println(" ");
            }


    }}
