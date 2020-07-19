import java.util.Scanner;

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

