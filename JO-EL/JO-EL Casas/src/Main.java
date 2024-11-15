import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        String casa = var.next();
        switch (casa) {
        case "Coratge": System.out.println("Gryffindor"); break;
        case "Coneixement": System.out.println("Ravenclaw"); break;
        case "Ambicio": System.out.println("Slytherin"); break;
        default: System.out.println("Hufflepuff"); break;
        }
    }
}