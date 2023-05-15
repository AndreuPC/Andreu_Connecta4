public class Main {
    public static void main(String[] args) {
        //tauler del joc

        int[][] tablero = new int[8][7];

        for (int columna = 0; columna < 7; columna++) {
            for (int fila = 0; fila < 8; fila++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }



    }





}