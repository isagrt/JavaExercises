import java.util.Scanner;

public class ArraysEx3copia {
    public static void main(String[] args) {
        String[] alunos = new String[5];
        double[] media = new double[5];
        double [][] notas = new double[5][4]; //matriz 5x
        double soma=0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do aluno"+(i+1)+": ");
            alunos[i] = scanner.nextLine();

            for(int y = 0; y<4; y++){
                System.out.println("Digite a nota "+(y+1)+" de "+alunos[i]+": ");
                notas [i][y] = scanner.nextDouble();
                soma = soma + notas[i][y];
            }
            
            scanner.nextLine(); // Limpa o buffer

            media[i] = soma / 4;
        }

        System.out.println("Resultados:");
        System.out.println("************");

        for (int i = 0; i < 5; i++) {
            System.out.println("Nome: " + alunos[i] +"> Notas: "+notas[i+1]+ " > Media: " + media[i]);
        }
    }
}
