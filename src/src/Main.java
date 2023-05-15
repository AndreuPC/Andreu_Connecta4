import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
            tablero[filas][columnas] = 1;

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