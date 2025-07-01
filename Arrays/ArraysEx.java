import java.util.Scanner;

public class ArraysEx {
    public static void main(String[] args) {
        String[] alunos = new String[5];
        double[] media = new double[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do aluno: ");
            alunos[i] = scanner.nextLine();

            double notas = 0;

            System.out.println("Digite a nota 1: ");
            notas += scanner.nextDouble();

            System.out.println("Digite a nota 2: ");
            notas += scanner.nextDouble();

            System.out.println("Digite a nota 3: ");
            notas += scanner.nextDouble();

            System.out.println("Digite a nota 4: ");
            notas += scanner.nextDouble();

            scanner.nextLine(); // Limpa o buffer

            media[i] = notas / 4;
        }

        System.out.println("Resultados:");
        System.out.println("************");

        for (int i = 0; i < 5; i++) {
            System.out.println("Nome: " + alunos[i] + " | Media: " + media[i]);
        }
    }
}
