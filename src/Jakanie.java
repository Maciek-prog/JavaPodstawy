import java.util.Scanner;

public class Jakanie {
    public String pobierz(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
    public String[] split(String text){

        return text.split(" ");

    }
    public void wypisz(String[] text){
        StringBuilder sb = new StringBuilder();

        for (String word : text) {
            sb.append(word)
                    .append(" ")
                    .append(word)
                    .append(" ");

        }

        }
    }
}
