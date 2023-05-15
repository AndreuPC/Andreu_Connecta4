import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int jugador = 1;

        //tauler del joc
        int[][] tablero = new int[8][7];
        Scanner scanner = new Scanner(System.in);

        for (int columnas = 0; columnas < 7; columnas++) {
            for (int filas = 0; filas < 8; filas++) {
                System.out.print(tablero[filas][columnas] + " ");
            }
            System.out.println();
        }

        // Introduir posicions
        System.out.println("Introdueix les posicions (fila, columna) : ");
        int filas, columnas;
        while (true) {
            filas = scanner.nextInt();
            columnas = scanner.nextInt();

            // Validar posicions
            if (filas < 0 || filas >= 8 || columnas < 0 || columnas >= 7) {
                System.out.println("Posició inválida. Intenta de nou amb una posició valida.");
                continue;
            }

            // Asignar valor en la posición introducida
            if (jugador == 1) {
                tablero[filas][columnas] = 1; // Jugador 1
                jugador = 2; // Canvi al Jugador 2
            } else {
                tablero[filas][columnas] = 2; // Jugador 2
                jugador = 1; // Canvi al Jugador 1
            }

            // Mostrar tauler actualizat
            for (int a = 0; a < 7; a++) {
                for (int b = 0; b < 8; b++) {
                    System.out.print(tablero[b][a] + " ");
                }
                System.out.println();
            }

            System.out.println("Introdueix les posicions (fila, columna) : ");

        }

    }

}