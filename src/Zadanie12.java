import java.util.Scanner;
//Napisz program, który pobierze od użytkownika tekst (zmienną typu String) i policzy jakim procentem wszystkich znaków tekstu był znak spacji,
//liczba spacji/liczba wszystkich znaków wszystko razy 100%
public class Zadanie12 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        char znakSpcaji=' ';
        int sumSpacji=0;
        for(int i =0;i < text.length();i++){
            if(text.charAt(i) == znakSpcaji){
                sumSpacji++;
            }

        }
        int procent = (int) ((double)sumSpacji/text.length()*100);
        System.out.println(procent);
        System.out.println(sumSpacji + " Procent: " + procent);
    }
}
