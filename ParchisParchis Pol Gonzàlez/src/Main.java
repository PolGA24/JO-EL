import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int posicio = sc.nextInt();
            int[] tirades = new int[3];
            for (int j = 0; j < 3; j++) {
                tirades[j] = sc.nextInt();
            }

            for (int j = 0; j < 3; j++) {
                posicio += tirades[j];

                if (posicio == 8) {
                    break;
                } else if (posicio > 8) {
                    posicio = 8 - (posicio - 8);
                }
            }

            System.out.println(posicio);
        }
        sc.close();
        }
    }
