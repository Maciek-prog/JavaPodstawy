import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double delta = (b*b) - 4*a*c;
        if(delta>0){
            double x1 = -b - Math.sqrt(delta)/2*a;
            System.out.println(x1);
            double x2 = -b + Math.sqrt(delta)/2*a;
            System.out.println(x2);
        } else if(delta<0){
            System.out.println("Delta ujemna");
        }
    }
}
