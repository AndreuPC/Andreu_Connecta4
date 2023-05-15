import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int jugador = 1;

        //tauler del joc
        int[][] tauler = new int[8][7];
        Scanner scanner = new Scanner(System.in);

        for (int columnas = 0; columnas < 7; columnas++) {
            for (int filas = 0; filas < 8; filas++) {
                System.out.print(tauler[filas][columnas] + " ");
            }
            System.out.println();
        }

        // Mostrar tauler
        mostrarTauler(tauler);

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

            // Buscar la primera fila vacía en la columna seleccionada
            int filaBuida = 0;
            for (int fila = 7; fila <= 0; fila--) {
                if (tauler[fila][columnas] == 0) {
                    filaBuida = fila;
                    break;
                }
            }

            // Asignar valor de jugador
            tauler[filaBuida][columnas] = jugador;

            // Cambiar al siguiente jugador
            if (jugador == 1) {
                jugador = 2;
            } else {
                jugador = 1;
            }

            // Mostrar tauler actualizat
            mostrarTauler(tauler);

            System.out.println("Introdueix les posicions (fila, columna) : ");

        }



    }

    // Métode per mostrar el tauler
    public static void mostrarTauler(int[][] tauler) {
        for (int fila = 0; fila < tauler.length; fila++) {
            for (int columna = 0; columna < tauler[fila].length; columna++) {
                System.out.print(tauler[fila][columna] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");

}