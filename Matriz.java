public class Matriz {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(matriz[i][y]+ "  |  ");
            }
            System.out.println(" "); 
        }
    }
}
