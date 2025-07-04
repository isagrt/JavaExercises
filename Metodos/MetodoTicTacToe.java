import java.util.Scanner;

public class MetodoTicTacToe {

    public static char[][] jogoDaVelha(char[][] matriz) {
        limparTela();
        for (int x = 0; x < 3; x++) {
            for (int o = 0; o < 3; o++) {
                System.out.print(" " + matriz[x][o] + " ");
                if (o < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (x < 2) {
                System.out.println("---+---+---");
            }
        }
        return matriz;
    }
        public static void limparTela(){
        try{ 
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }catch(Exception e){
            System.out.println("Erro ao tentar limpar tela");
        }
    }

    
    public static void alternarJogador() {
        Scanner scanner = new Scanner(System.in);
        boolean jogoAtivo = true;
        char jogadorAtual = 'X';
        char[][] matriz = new char[3][3];

        for (int x = 0; x < 3; x++) {
            for (int o = 0; o < 3; o++) {
                matriz[x][o] = ' ';
            }
        }

        
        while (jogoAtivo) {
            jogoDaVelha(matriz);
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

            if (haVencedor(matriz, jogadorAtual)){
                jogoDaVelha(matriz);
                System.out.println("Parabens " +jogadorAtual+ ", voce eh o(a) campea(o)!!");
                jogoAtivo = false;
                continue;
            }
            if(jogoCheio(matriz)){
                jogoCheio(matriz);
                System.out.printf("Uma pena :( %s e %s , deu velha!!", jogadorAtual, jogadorAtual );
                jogoAtivo = false;
                continue;
            };
            if (jogadorAtual  jogadorAtual== 'X') {
                jogadorAtual = 'O';
            } else {
                jogadorAtual = 'X';
            }
        }
    }

    public static boolean jogoCheio(char[][] matriz){
        for (int i = 0; i < 3; i++){
            for(int j = 0; j<3; j++){
                if(matriz[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean haVencedor(char[][] jogoDaVelha, char jogador){
        for (int i = 0; i<3; i++){
            if (jogoDaVelha[i][0] == jogador && jogoDaVelha[i][1] == jogador && jogoDaVelha[i][2] == jogador){
                return true;
            }
        }
        for (int j = 0; j<3; j++){
            if (jogoDaVelha[0][j] == jogador && jogoDaVelha[1][j] == jogador && jogoDaVelha[2][j] == jogador){
                return true;
            }
        }
        if (jogoDaVelha[0][0] == jogador && jogoDaVelha[1][1] == jogador && jogoDaVelha[2][2] == jogador){
                return true;
            }
        if (jogoDaVelha[0][2] == jogador && jogoDaVelha[1][1] == jogador && jogoDaVelha[2][0] == jogador){
                return true;
            }
        return false;
        }

    public static void main(String[] args) {
        alternarJogador();
    }
}
