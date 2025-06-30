import java.util.Scanner;

public class Exercicio6Vetor {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um valor para o vetor A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um valor para o vetor B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            C[i] = A[i] - B[i];
        }

        System.out.println("\nVetor C (A - B):");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }

        scanner.close();
    }
}
