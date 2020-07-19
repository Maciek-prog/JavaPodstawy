import java.util.Scanner;
//  Napisz program, który będzie od użytkownika pobierał kolejne teksty (zmienne typu String) tak długo,
//  aż użytkownik poda tekst „Starczy”, a następnie wypisze najdłuższy z podanych tekstów (nie biorąc pod uwagę tekstu „Starczy”).
//  Jeśli użytkownik nie poda żadnego tekstu, to wypisz „Nie podano żadnego tekstu”.

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
