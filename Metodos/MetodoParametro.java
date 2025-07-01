public class MetodoParametro{ //miniminiza todo codigo
   
    //Chamada de metodo com passagem de parâmetro
    static void mostrarNome(String nome ){ //define o tipo da variavel e o nome da variavel 
        System.out.println("Ola "+nome+ ", bem vinda!");

    }

    public static void soma(double number1, double number2){
        //chamada de método para somar dois numeros
        double soma = number1 + number2;
        System.out.println("Soma: " +soma);
    }

    public static void main(String[] args){

        System.out.println("Chamda de metodo simples:");
        mostrarNome("Isadora");
        mostrarNome("Rita");

        soma(5,8);
        soma(10,20);
    }
}

