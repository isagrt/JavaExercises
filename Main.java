//todo código é necessário estar dentro de uma classe, apenas antes quando há importação de bibliota

public class Main { //classe sempre começa com letra maiúscula

    public static void main (String [] args){
        System.out.println("Hello World");
        System.out.println("Olá galerinha, rs!!"); //um printf em java
        String nome; //variável string/texto
        String sobrenome;
        nome = args[0];
        sobrenome = args[1]; //trabalha como uma lista
        System.out.println("Nome: "+nome+" "+sobrenome); //para executar = java Main Isadora>>(primeiro argumento)
    } //definindo como principal 
}
