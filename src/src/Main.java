import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] tauler = new int[6][7];
        Scanner scanner = new Scanner(System.in);
        int jugador = 1;
        int movimientos = 0;

        // Mostrar tauler
        mostrarTauler(tauler);

        // Introduir posicions
        System.out.println("Comença el joc");
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
            int filaBuida = -1;
            for (int fila = 5; fila >= 0; fila--) {
                if (tauler[fila][columna] == 0) {
                    filaBuida = fila;
                    break;
                }
            }

            // Si no hi ha fila buida la columna esta plena
            if (filaBuida == -1) {
                System.out.println("Columna plena");
                continue;
            }

            // Asignar valor a la posició
            tauler[filaBuida][columna] = jugador;

            // Incrementar el contador de movimientos
            movimientos++;

            // Mostrar tauler seguent torn
            mostrarTauler(tauler);

            // Verificar si hay un ganador
            if (hayGanador(tauler, filaBuida, columna, jugador)) {
                System.out.println("¡El Jugador " + jugador + " ha ganado!");
                boolean fiJoc = true;
                break;
            }

            // Verificar empate
            if (movimientos == tauler.length * tauler[0].length) {
                System.out.println("¡Empate!");
                break;
            }

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

    // Método para verificar si hay un ganador
    public static boolean hayGanador(int[][] tablero, int fila, int columna, int jugador) {
        // Verificar en sentido vertical
        if (fila >= 3 && tablero[fila - 1][columna] == jugador && tablero[fila - 2][columna] == jugador && tablero[fila - 3][columna] == jugador) {
            return true;
        }

        // Verificar en sentido horizontal
        int contador = 0;
        for (int c = 0; c < tablero[fila].length; c++) {
            if (tablero[fila][c] == jugador) {
                contador++;
                if (contador >= 4) {
                    return true;
                }
            } else {
                contador = 0;
            }
        }

        // Verificar en sentido diagonal ascendente
        contador = 0;
        int i = 1;
        while (fila - i >= 0 && columna - i >= 0 && tablero[fila - i][columna - i] == jugador) {
            contador++;
            if (contador >= 4) {
                return true;
            }
            i++;
        }

        i = 1;
        while (fila + i < tablero.length && columna + i < tablero[fila].length && tablero[fila + i][columna + i] == jugador) {
            contador++;
            if (contador >= 4) {
                return true;
            }
            i++;
        }

        // Verificar en sentido diagonal descendente
        contador = 0;
        i = 1;
        while (fila - i >= 0 && columna + i < tablero[fila].length && tablero[fila - i][columna + i] == jugador) {
            contador++;
            if (contador >= 4) {
                return true;
            }
            i++;
        }

        i = 1;
        while (fila + i < tablero.length && columna - i >= 0 && tablero[fila + i][columna - i] == jugador) {
            contador++;
            if (contador >= 4) {
                return true;
            }
            i++;
        }

        return false;
    }

}