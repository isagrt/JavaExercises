import java.util.Scanner;

public class Exercicio4Matriz {
    public static void main(String[] args) {
        char[][] matriz = new char [4][4]; 
        
         for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 4; y++) {
                matriz[i][y]= '*';
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 4; y++) {
                System.out.print(matriz[i][y]+ "  |  ");
            }
            System.out.println(" "); 

}
    for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 4; y++) {
               if(i==0 || i == 3 || y == 0 || y == 3) {
                System.out.print(matriz[i][y]+ "  |  ");
               }
               else{
                System.out.println("\t ");
               }
             }
              System.out.println(" ");
    
}  System.out.println(" ");

    for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 4; y++) {
}}