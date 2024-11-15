import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mida_matriu = input.nextInt();
        int[][] Matriu1 = new int[mida_matriu][mida_matriu];
        int[][] Matriu2 = new int[mida_matriu][mida_matriu];
        int[][] MatriuTotal = new int[mida_matriu][mida_matriu];

        for (int i = 0; i < Matriu1.length; i++) {
            for (int j = 0; j < Matriu1.length; j++){
            Matriu1[i][j] = input.nextInt();}
        }

        for (int i=0; i<Matriu2.length; i++){
            for (int j=0; j<Matriu2.length; j++){
                Matriu2[i][j] = input.nextInt();
            }
        }

        for (int i=0; i<MatriuTotal.length; i++){
            for (int j=0; j<MatriuTotal.length; j++){
                MatriuTotal[i][j] = Matriu1[i][j] + Matriu2[i][j];
            }
        }
    }
}

