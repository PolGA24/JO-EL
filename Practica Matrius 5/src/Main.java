import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        float[][] matriunotes = new float[20][6];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Inserta la nota " + (i + 1) + " de l'alumne " + (j + 1) + ":");
                matriunotes[i][j] = nota.nextFloat();
            }
        }

        float millon_nota= Float.MIN_VALUE;
        float pitxor_nota= Float.MAX_VALUE;

        for (int i = 0; i < 20; i++) {
            float suma = 0;
            float notaAlta = Float.MIN_VALUE;
            float notaBaixa = Float.MAX_VALUE;
            for (int j = 0; j < 3; j++) {
                float nota_actual = matriunotes[i][j];
                suma += nota_actual;

                if (nota_actual < notaAlta) notaAlta = nota_actual;
                if (nota_actual > notaBaixa) notaBaixa = nota_actual;
            }

            float promig = suma / 3;
            matriunotes[i][3] = promig;
            matriunotes[i][4] = notaAlta;
            matriunotes[i][5] = notaBaixa;

            if (notaAlta > millon_nota) millon_nota = notaAlta;
            if (notaBaixa < pitxor_nota) pitxor_nota = notaBaixa;
        }
        System.out.println("\nMatriz de notas:");
        System.out.println("Nota1\tNota2\tNota3\tPromedio\tNota Alta\tNota Baja");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriunotes[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nLa mejor nota del curso es: " + millon_nota);
        System.out.println("\nLa pitxor nota del curso es: " + pitxor_nota);

        nota.close();
    }
}