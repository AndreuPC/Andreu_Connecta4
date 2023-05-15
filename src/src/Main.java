import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] tauler = new int[6][7];
        Scanner scanner = new Scanner(System.in);
        int jugador = 1;

        // Mostrar tauler
        mostrarTauler(tauler);

        // Introduir posicions
        System.out.println("¡Comença el juego!");
        System.out.println("Introdueix la columna on vols colocar la teva ficha (0-6): ");
        int columna;
        while (true) {
            columna = scanner.nextInt();

            // Validar columna introduida
            if (columna < 0 || columna >= 7) {
                System.out.println("Columna inválida");
                continue;
            }


            // Cercar la primera fila Buida a la columna seleccionada
            int filaBuida = 0;
            for (int fila = 7; fila <= 0; fila--) {
                if (tauler[fila][columna] == 0) {
                    filaBuida = fila;
                    break;
                }
            }

            // Asignar valor a la posició
            tauler[filaBuida][columna] = jugador;

            // Mostrar tauler seguent torn
            mostrarTauler(tauler);

            //Canvi de de jugador
            jugador = jugador == 1 ? 2 : 1;

            System.out.println("Introdueix la columna on vols colocar la ficha (0-6): ");

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
}