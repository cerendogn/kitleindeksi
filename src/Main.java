import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double kilo,boy,kütleİndeksi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz:");
        kilo= girdi.nextDouble();
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz:");
        boy = girdi.nextDouble();
        kütleİndeksi = kilo /boy * boy;
        System.out.println("Vücut kütle indeksiniz:" +kütleİndeksi);
    }
}