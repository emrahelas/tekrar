package t1_variables_Scanner;

import java.util.Scanner;

public class Tekrar1 {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan uc farkli data turunde deger alip,
        // girilen degerleri aciklamalariyla yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi girin: ");
        int tamsayi = scan.nextInt();

        System.out.println("Lutfen ondalikli bir sayi girin: ");
        double ondalikli = scan.nextDouble();

        System.out.println("Lutfen bir metin girin");
        String metin = scan.next();


        System.out.println("Pozitif tam sayi: "+tamsayi+
        "\n Ondalikli sayi :"+ondalikli+
                "\n Metin :"+metin);

    }
}
