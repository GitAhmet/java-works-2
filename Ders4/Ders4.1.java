package Ders4;
/**
 * @author Eier
 */
import java.util.Locale;
import java.util.Scanner;

public class Ders4 {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    scan.useLocale(Locale.US);

    System.out.println("Bir sayi giriniz: ");

    double a = scan.nextDouble();

    System.out.println("a degiskeninin degeri: " + a);

    }

}