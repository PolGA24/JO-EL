import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombreCasos = scanner.nextLine();

        int numCasos = scanner.nextInt();

        for (int caso = 1; caso <= numCasos; caso++) {
            int filas = scanner.nextInt();
            int columnas = scanner.nextInt();

            int maximo = Integer.MIN_VALUE;
            int filaMax = 0;
            int columnaMax = 0;

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    int valor = scanner.nextInt();
                    if (valor > maximo) {
                        maximo = valor;
                        filaMax = i;
                        columnaMax = j;
                    }
                }
            }

            System.out.println("Caso #" + caso + ": " + (filaMax + 1) + " - " + (columnaMax + 1));
        }

        scanner.close();
    }
}
