import java.util.Scanner;

public class MetodoCalc {

    // Métodos de operações matemáticas
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN;
        }
        return a / b;
    }

    public static double resto(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN;
        }
        return a % b;
    }

    // Método principal de menu e lógica
    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão", "Resto da divisão"};
        int opcao;

        do {
            System.out.println("\n==== Calculadora ====");
            for (int i = 0; i < operacoes.length; i++) {
                System.out.println((i + 1) + " - " + operacoes[i]);
            }
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 5) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;
                boolean valido = true;

                switch (opcao) {
                    case 1:
                        resultado = somar(num1, num2);
                        break;
                    case 2:
                        resultado = subtrair(num1, num2);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        break;
                    case 4:
                        resultado = dividir(num1, num2);
                        break;
                    case 5:
                        resultado = resto(num1, num2);
                        break;
                    default:
                        valido = false;
                }

                if (valido && !Double.isNaN(resultado)) {
                    System.out.println("Resultado: " + resultado);
                }

            } else if (opcao != 0) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    public static void main(String[] args) {
        menu();
    }
}
