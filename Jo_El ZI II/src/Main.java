import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        int n = nota.nextInt();
        int m = nota.nextInt();
        float mitjes = 0;
        float [][] notas = new float[n][m];
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; i++) {
                notas[i][j] = nota.nextFloat();
            }
        }

        mitjes = +notas[n][m]/notas[0][m];
    }
}