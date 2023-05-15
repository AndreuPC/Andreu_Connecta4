public class Main {
    public static void main(String[] args) {

        int columna = 1;
        int fila = 5;

        //tauler del joc
        int[][] tablero = new int[8][7];

         tablero[fila][columna] = 4;

        for (int columnas = 0; columnas < 7; columnas++) {
            for (int filas = 0; filas < 8; filas++) {
                System.out.print(tablero[filas][columnas] + " ");
            }
            System.out.println();
        }





    }





}