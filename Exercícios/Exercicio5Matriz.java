import java.util.Scanner;
public class Exercicio5Matriz{
 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
 
        int n = 3;
        int[][] matriz = new int[n][n];
 
        // Matriz 3x3
        System.out.println("Digite os valores da matriz 3x3:");
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
 
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = ler.nextInt();
            }
        }
 
        // Ver se é quadrado mágico
        boolean ehMagico = verificarQuadradoMagico(matriz);
 
        System.out.println("\nMatriz informada:");
        imprimirMatriz(matriz);
 
        if (ehMagico) {
            System.out.println("\nA matriz é um quadrado magico!");
        } else {
            System.out.println("\nA matriz NAO é um quadrado magico.");
        }
    }
 
    public static boolean verificarQuadradoMagico(int[][] m) {
        int n = m.length;
        int somaReferencia = 0;
 
        // Soma da primeira linha
        for (int j = 0; j < n; j++) {
            somaReferencia += m[0][j];
        }
 
        // Verifica linhas
        for (int i = 1; i < n; i++) {
            int somaLinha = 0;
            for (int j = 0; j < n; j++) {
                somaLinha += m[i][j];
            }
            if (somaLinha != somaReferencia) {
                return false;
            }
        }
 
        // Verifica colunas
        for (int j = 0; j < n; j++) {
            int somaColuna = 0;
            for (int i = 0; i < n; i++) {
                somaColuna += m[i][j];
            }
            if (somaColuna != somaReferencia) {
                return false;
            }
        }
 
        // Verifica diagonal principal
        int somaDiagPrincipal = 0;
        for (int i = 0; i < n; i++) {
            somaDiagPrincipal += m[i][i];
        }
        if (somaDiagPrincipal != somaReferencia) {
            return false;
        }
 
        // Verifica diagonal secundária
        int somaDiagSecundaria = 0;
        for (int i = 0; i < n; i++) {
            somaDiagSecundaria += m[i][n - 1 - i];
        }
        if (somaDiagSecundaria != somaReferencia) {
            return false;
        }
 
        return true;
    }
 
    public static void imprimirMatriz(int[][] m) {
        int n = m.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}