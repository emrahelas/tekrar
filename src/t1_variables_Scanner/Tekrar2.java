package t1_variables_Scanner;

import java.util.Scanner;

public class Tekrar2 {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ondalikli bir sayi girin :");
        double ondalikli = scan.nextDouble();

        System.out.println("Lutfen pozitif bir tamsayi girin :");
        int sayi = scan.nextInt();

        System.out.println("Sayilarin toplami :"+(ondalikli+sayi)+
                "\nSayilarin carpimi :"+(ondalikli*sayi) );


    }
}
