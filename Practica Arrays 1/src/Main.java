import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        String [] Equipo1 = {"Manchester United","Nantes","Midtjylland","Rennes","Union Berlín","Mónaco","PSV Eindhoven","Roma"};
        String [] Equipo2 = {"Barcelona", "Juventus", "Sporting Lisboa", "Shakhtar Donetsk", "Ajax", "Bayer Leverkusen", "Sevilla", "Salzburgo"};

        boolean [] elegidos = new boolean[8];
        elegidos[0] = true;
        System.out.println(Equipo1[0] + " vs " + Equipo2[0]);
        int repetir = 0;
        while (repetir < 8) {
        int Aleatorio = (int) (Math.random() * 8);
        if (!elegidos[Aleatorio]) {
            elegidos[Aleatorio] = true;
            System.out.println(Equipo1[Aleatorio] + " vs " + Equipo2[Aleatorio]);
            repetir ++;
        }
        }
    }
}