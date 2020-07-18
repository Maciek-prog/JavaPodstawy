import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();
        for (int a = 1; a <= liczba; a++) {

            if ((a % 3 == 0) && (liczba % 7 == 0)) {

                System.out.println("Pif Paf");
            } else if (a % 3 == 0) {

                System.out.println("Pif");

            } else if (a % 7 == 0) {

                System.out.println("Paf");

            } else {

                System.out.println(a);
            }
        }


    }
}
