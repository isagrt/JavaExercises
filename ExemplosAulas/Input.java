import java.util.Scanner;

public class Input{
    
    public static void main (String[] args){
    
        //entrada de dados
        Scanner scanner = new Scanner(System.in); //Instancia de uma classe (Classe >> objeto), transformar o input em objeto
        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt();
        System.out.println("Seu nome eh "+nome+ " e voce tem "+idade+" anos. ");
    
        //saída de informação
        System.out.println("Oii gente!!"); //imprime o proximo texto em uma proxima linha
        System.out.print("Tudo bem?");
        System.out.print(" Saudades"); //print imprime na mesma linha 

    }
    
}