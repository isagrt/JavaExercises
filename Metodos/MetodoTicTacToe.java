/* Jogo da Velha*/
import java.util.Scanner;

public class MetodoTicTacToe{
    public static char[][] jogoDaVelha(char[][] matriz){
        
            for (int x = 0; x<3; x++){
                for(int o = 0; o<3; o++ ){
                    System.out.print(" "+matriz[x][o]+" ");
                    if(o<2){
                        System.out.print("|");
                    }
                }
                System.out.println();
                if(x<2){
                    System.out.print("");
                }
            } 
            return matriz;
    }

    public static char alternarJogador(){
        Scanner scanner = new Scanner(System.in);
        boolean jogoAtivo = true;
        String jogadorAtual = "X";
        char[][] matriz = new char[3][3];

        for(int x = 0; x < 3; x++){
                for(int o = 0; o < 3; o++){
                    matriz[x][o] = ' ';
                }

        while (jogoAtivo) {
    imprimirTabuleiro(matriz);
    System.out.println("Vez do jogador " + jogadorAtual);

    System.out.print("Linha (0-2): ");
    int linha = scanner.nextInt();
    System.out.print("Coluna (0-2): ");
    int coluna = scanner.nextInt();

    if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
        System.out.println("Posição inválida! Tente novamente.");
        continue;
    }

    if (matriz[linha][coluna] != ' ') {
        System.out.println("Essa casa já está ocupada!");
        continue;
    }

    matriz[linha][coluna] = jogadorAtual;
    
    if (jogadorAtual == 'X') {
        jogadorAtual = 'O';
    } else {
        jogadorAtual = 'X';
    }
}
        
    }
        

    

    public static void main(String[] args){
        jogoDaVelha();
        alternarJogador();

    }

}}