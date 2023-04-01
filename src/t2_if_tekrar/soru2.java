package t2_if_tekrar;

import java.util.Scanner;

public class soru2 {

    public static void main(String[] args) {

        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen kilonuzu girin: ");
        double kilo = scan.nextDouble();

        System.out.println("Lütfen boyunuzu girin");
        double boy = scan.nextDouble();

        double kitle = ((kilo*10000)/(boy*boy));

        if (kitle<20){
            System.out.println("zayıf");
        }else if (kitle<25){
            System.out.println("normal");
        }else if (kitle<30){
            System.out.println("kilolu");
        }else {
            System.out.println("obez");
        }
    }
}
