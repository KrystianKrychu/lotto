package pl.akademia108;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int[] calkowite = new int[6];

        for (short i = 0; i < 6 ; ++i) {
            int min = 1;
            int max = 49;
            Random r = new Random();
            calkowite[i] = r.nextInt((max-min) + 1) + min;
        }

        for (int liczba : calkowite) {
            System.out.println(liczba);
        }

    }
}
