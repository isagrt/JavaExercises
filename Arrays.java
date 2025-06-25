public class Arrays {
    public static void main(String[] args) {

        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println(carros.length);
        
        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i]);
        }

        carros[0] = "Fusca"; // alterar conteúdo de um array 
        for (String carro : carros) {
            System.out.println(carro);
        }

        System.out.println(carros[2]); // exibir um elemento específico

        // Adicionar um novo carro ao array
        String[] novoCarros = new String[carros.length + 1]; //fazer uma cópia do elemento original
        for (int i = 0; i < carros.length; i++) {
            novoCarros[i] = carros[i];
        }
        novoCarros[carros.length] = "Toyota"; //adiciona o novo carro ao novo array com base no ultimo elemento do array carros
        //mostra os valores do novo array
        for (String carro : novoCarros) {
            System.out.println(carro);
        }
    }
}

