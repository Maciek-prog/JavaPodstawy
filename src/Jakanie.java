import java.util.Scanner;

// Napisz program, który „się jąka”, to znaczy pobiera użytkownika tekst (zmienną typu String),
// a następnie wypisuje podany tekst,
// w którym każde słowo wypisane jest po dwa razy.
// Przykładowo, dla wejścia: „To jest mój test” program powinien wypisać „To To jest jest mój mój test test”

public class Jakanie {
    private String pobierz(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
    private String[] split(String text){

        return text.split(" ");

    }
    private void wypisz(String[] text){
        StringBuilder sb = new StringBuilder();

        for (String word : text) {
            sb.append(word)
                    .append(" ")
                    .append(word)
                    .append(" ");

        }
        System.out.println(sb.toString());
        }
        public void run(){
            wypisz(split(pobierz()));
        }
    }

