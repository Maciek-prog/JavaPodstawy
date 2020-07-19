import java.util.Scanner;

public class Zadanie15 {
    private Scanner scanner = new Scanner(System.in);

    public Dwukrotnosc[] getDwukrotsonsc() {
        Dwukrotnosc[] dwukrotnosc2 = new Dwukrotnosc[10];


        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę: ");
            int value = scanner.nextInt();

            boolean found= false;

            for (Dwukrotnosc dwukrotnosc : dwukrotnosc2) {

                if (dwukrotnosc.getValue() == value) {
                    dwukrotnosc.setIloscWystapien(dwukrotnosc.getiloscWystapien());
                    found=true;

                }
            }
            if(!found){
                dwukrotnosc2[i] = new Dwukrotnosc(value, 1);
            }
        }
        return dwukrotnosc2;
    }
    public void printNumber(){


    }
}

