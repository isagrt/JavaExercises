import java.util.Scanner;
public class Exercicio4Matriz{
 
    public static void main(String[] args) {
 
        Scanner ler = new Scanner(System.in);
 
        char [][] matriz = new char[4][4];
 
       // Preencher matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = '*';
            }
        }
 
        // Matriz
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println("");
        }
 
        System.out.println("");
        // Bordas
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if (i == 0 || i == 3 || j == 0 || j == 3)
                    System.out.print("\t"+matriz[i][j]);
                else
                    System.out.print("\t");
            }
             System.out.println("");
        }
             System.out.println("");
            // Triangulo inferior
             for(int i = 0; i < 4; i++){
                for(int j = 0; j <= i; j++){
                    System.out.print("\t"+matriz[i][j]);
                }
                System.out.println("");
             }
        }
    }