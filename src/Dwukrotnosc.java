import java.util.Scanner;

public class Dwukrotnosc {
    //    Napisz  program,  który  pobierze  od  użytkownika  10  dowolnie  dużych  liczb (zmiennych typu int) i wypisze te
//    ,które wystąpiły minimum dwukrotnie.
    Scanner scanner = new Scanner(System.in);
    private int value = scanner.nextInt();
    private int iloscWystapien;


    public int getValue() {
        return value;
    }

    public int getiloscWystapien() {
        return iloscWystapien;
    }

    public void setIloscWystapien(int iloscWystapien) {
        this.iloscWystapien = iloscWystapien;
    }
}