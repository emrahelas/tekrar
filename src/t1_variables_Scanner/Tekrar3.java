package t1_variables_Scanner;

import java.util.Scanner;

public class Tekrar3 {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //Isminiz : John
        //Soyisminiz : Doe
        //Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi girin :");
        String isim = scan.nextLine();
        String soyisim = scan.nextLine();
        int yas = scan.nextInt();

        System.out.println("Isminiz : "+isim+
        "\nSoyisminiz : "+soyisim+
                "\nYasiniz : "+yas+
                "\nKaydiniz basariyla tamamlanmistir.");


    }
}
