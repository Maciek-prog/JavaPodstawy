import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String napis = scanner.next();
        int dlugosc = 0;
        String napis2 = "Nie podano tekstu :D";

        while (!napis.equals("Starczy")) {

            if (dlugosc < napis.length()) {
                dlugosc = napis.length();
                napis2 = napis;

            }
            napis= scanner.next();
        }
        System.out.println(napis2);
    }
}
