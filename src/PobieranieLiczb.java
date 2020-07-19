import java.util.Scanner;

public class PobieranieLiczb {
    /*Napisz program, który pobierze od użytkownika dwie małe litery alfabetu łacińskiego (typ char)  i  wyliczy,
    ile  znaków  stoi  w  alfabecie  pomiędzy  podanymi  literami.
    Podpowiedź – skorzystaj z tablicy kodów ASCII i traktuj znaki jak liczby int.*/
    //Zadanie 14
    public static class Chars{

        public char getSign1() {
            return sign1;
        }

        public char getSign2() {
            return sign2;
        }

        public Chars(char sign1, char sign2) {
            this.sign1 = sign1;
            this.sign2 = sign2;
        }


        char sign1;
        char sign2;
    }



    Scanner scanner = new Scanner(System.in);

    public Chars getChar() {
        System.out.println("Podaj pierwszą z małych liter: ");
        char sign1 = scanner.next().charAt(0);
        System.out.println("Podaj drugą z małych liter: ");
        char sign2 = scanner.next().charAt(0);
        Chars chars = new Chars(sign1, sign2);
        return chars;
    }
    public int getResult(Chars chars){
        return chars.getSign2() - chars.getSign1();
    }
}
