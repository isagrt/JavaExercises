public class Strings {
    public static void main(String[] args) {
        String senha = "aEi";
        //identificar o tamanho da senha
        if (senha.length() > 3) {
            System.out.println("Senha válida.");
        } else {
            System.out.println("Senha inválida. Tamanho: " + senha.length());
        }
        //Transformar para caixa alto e caixa baixa
        System.out.println("LowerCase: " +senha.toLowerCase());
        System.out.println("Uppercase: " +senha.toUpperCase());
        System.out.println("NormalCase: " +senha);

        //Localizar caracteres
        String text = "Hoje eh terça feira";
        System.out.println(text.indexOf("terça"));

        //Contatenar
        String nome = "Isadora";
        String sobrenome = "Goedert";
        System.out.println(nome+" "+sobrenome); //do jeito tradicional
        System.out.println(nome.concat(" ").concat(sobrenome)); //contatenando 

        //exemplo em numeros
        String num1 = "20";
        String num2 = "25";
        System.out.println(num1+num2);

        System.out.println("Hoje ta fezendo \"calor\" e frio");
        System.out.println("Hoje ta fezendo \t\t\tcalor e frio" );


    }
}
