package t2_if_tekrar;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen ürün adedi ve liste fiyatını girin:");
        int urunAdedi = scan.nextInt();
        double listeFiyati = scan.nextDouble();

        System.out.println("Müsteri kartınız var mı?" +
                "\n E yada H girin.");
        char kart = scan.next().charAt(0);

        if (kart=='E' ||kart== 'e'){
            if (urunAdedi>10){
                System.out.println(urunAdedi*0.8*listeFiyati);
            }else if (urunAdedi<=10){
                System.out.println(urunAdedi*listeFiyati*0.85);
            }else {
                System.out.println("Yanlış ürün adedi giriş!");
            }
        }else if (kart == 'H' || kart == 'h') {
            if (urunAdedi > 10) {
                System.out.println(urunAdedi * 0.85 * listeFiyati);
            } else if (urunAdedi <= 10) {
                System.out.println(urunAdedi * listeFiyati * 0.90);
            } else {
                System.out.println("Yanlış ürün adedi giriş!");
            }


        } else {
            System.out.println("Yanlış kart girişi");
        }
    }
}
