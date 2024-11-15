import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int cas = 0; cas < casos; cas++) {
        int n = sc.nextInt();
        int [] numeros = new int[n]; //Array per enmagatzemar els números

        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        //Ordenar Array
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
            if (numeros[j] > numeros [j+1]) {
            int temp = numeros[j];
            numeros[j] = numeros[j+1];
            numeros[j+1] = temp;
            }
        }
        }
        //Sumar elements emparellats
        for (int i = 0; i < n/2; i++) {
            int suma = numeros[i] + numeros[n-1-i];
            System.out.println(suma + " ");
        }
        System.out.println();
    }
    sc.close();
    }
}
