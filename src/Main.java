import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        float number = scanner.nextFloat();
        System.out.println("Wybierz znak: ");
        String sign = scanner.next();
        System.out.println("Podaj drugą liczbę: ");
        float number1 = scanner.nextFloat();
        switch (sign){
            case "+": {
                System.out.println(number + number1);
                break;
            }
            case "-":{
                System.out.println(number - number1);
                break;
            }
            case "*":{
                System.out.println(number * number1);
                break;
            }
            case "/":{
                System.out.println(number1 != 0 ? (number / number1) : "ERROR");
                break;
            }
            default:{
                System.out.println("Unknown Command");
                break;
            }
        }

    }
}
