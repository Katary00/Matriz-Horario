import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // Scanner leer = new Scanner(System.in);
        String[][] tablero = new String[6][7];
        tablero[0][0] = "HORA\t ";
        tablero[0][1] = "LUNES ";
        tablero[0][2] = "MARTES ";
        tablero[0][3] = "MIERCOLES ";
        tablero[0][4] = "JUEVES ";
        tablero[0][5] = "VIERNES ";
        tablero[0][6] = "SABADO\t";

        tablero[1][0] = "11:00-13:00 ";
        tablero[2][0] = "13:00-14:00 ";
        tablero[3][0] = "14:00-16:00 ";
        tablero[4][0] = "16:00-18:00 ";
        tablero[5][0] = "18:00-20:00 ";

        for (int x = 0; x < tablero.length; x++) {
            System.out.print("|");
            for (int y = 0; y < tablero[x].length; y++) {
                System.out.print(tablero[x][y]);
                if (y != tablero[x].length - 1)
                    System.out.print("\t");
            }
            System.out.println("|");
        }

    }

}
