import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu casos de prova");
        int casosdeProva = sc.nextInt(); //Llegir els casos de prova
        System.out.println("Indica les cartes");

        //Procesar cada cas
        for (int caso = 0; caso < casosdeProva; caso++) {
            int[] cartas = new int[7];
        for (int i = 0; i < 7; i++) {
            cartas[i] = sc.nextInt();
        }
        for (int i = 0; i < 7 - 1; i++) {
            for (int j = 0; j < 7 - i - 1; j++) {
                //Intercanvi cartes [i] i cartes [j + 1]
                int temp = cartas[j];
                cartas[j] = cartas[j + 1];
                cartas[j + 1] = temp;
            }
        }

    // Verificar Escala Real
    boolean teEscalaReial = false;
    boolean teDeu = false, teOnze = false, teDotze = false, teTretze = false, teAs = false;

    for (int i = 0; i < 7; i++) {
        if (cartas [i] == 10) teDeu = true;
        if (cartas [i] == 11) teOnze = true;
        if (cartas [i] == 12) teDotze = true;
        if (cartas [i] == 13) teTretze = true;
        if (cartas [i] == 1) teAs = true;
    }
    if (teDeu && teOnze && teDotze && teTretze && teAs) {
        teEscalaReial = true;
    }
    //Verificar Escalar
    boolean teEscala = false;
    int consecutius = 1;
    for (int i = 0; i < 6; i++) {
        if (cartas [i + 1] == cartas[i]+1) {
            consecutius++;
        } else if (cartas [i + 1] == cartas[i]) {
            consecutius = 1;
        }
        if (consecutius == 5) {
            teEscala = true;
            break;
        }
    }
    if (teEscalaReial) {
        System.out.println("ESCALA REIAL");
    } else if (teEscala) {
        System.out.println("ESCALA");
    } else {
        System.out.println("NO");
    }
    }
        sc.close();
    }
}
