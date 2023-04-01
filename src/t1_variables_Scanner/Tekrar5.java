package t1_variables_Scanner;

import java.util.Scanner;

public class Tekrar5 {
    public static void main(String[] args) {
        // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi, soyadinizi ve yasinizi girin:");

        char isim = scan.next().charAt(0);
        String soyisim = scan.next();
        int yas = scan.nextInt();

        System.out.print("Girilen bilgiler: "+isim+" "+soyisim+", "+yas);
    }
}
