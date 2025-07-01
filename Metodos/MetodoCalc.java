/* criar uma calculadora de 2 numeros com metodos
-metodos:
    -somar
    -dividir
    -multiplicar
    -subtrair
    -restoDaDivição
    -menuCalculadora
*/
import java.util.Scanner;
public class MetodoCalc{

    static void menu(){ 
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("1 - Adicao +:");
            System.out.println("2 - Subtracao - : ");
            System.out.println("3 - Multiplicao * : ");
            System.out.println("4 - Divisao / : ");
            System.out.println("5 - Resto % : ");
            System.out.println("0 - Encerrar programa");
            opcao = scanner.nextInt();
        
            switch(opcao){
                case 1:
                    System.out.println("oi");
                break;
                case 2:
                    System.out.println("oi");
                break;
                case 3:
                    System.out.println("oi");
                break;
                case 4:
                    System.out.println("oi");
                break;
                case 5:
                    System.out.println("oi");
                break;
                case 0:
                    System.out.println("oi");
                break;
                default:
                    System.out.println("Operador invalido");
            }
        }while(opcao != 0);
        }

        public static void operacaoMatematica(String operacao){
            int number1;
            int number2;
            String result=0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insira o primeiro valor:");
            number1 = scanner.nextInt();
            System.out.println("Insira o segundo valor");
            number2 = scanner.nextInt();

            switch(operacao){
        case "somar":
            result = somar(number1 + number2);
        break;
        case "subtrair":
            result = subtrair(number1 - number2);
        break;
        case "multiplicar":
            result = multiplicar(number1 * number2);
        break;
        case "dividir":
            result = dividir(number1 / number2);
        break; 
        case "resto":
            result = resto(number1 % number2);
        break;
    
    
        default:
        console.log('Operador invalida');
        }

   /* public static void somar(double number1, double number2){
        double soma = number1 + number2;
        System.out.println("Soma: " +soma);
    }
    public static void subtrair(double number1, double number2){
        double subtracao = number1 - number2;
        System.out.println("Subtracao: " +subtracao);
    }
     public static double multiplicar (double number1, double number2){
        double multiplica = number1 * number2;
        return multiplica;
    }
     public static double dividir (double number1, double number2){
        double divide = number1 * number2;
        return divide;
    }*/ 
    public static void main(String[] args){
        System.out.println("Bem vindo! Selecione a operacao desejada: ");
        menu();
        
    }
}
}
