package t1_variables_Scanner;

import java.util.Scanner;

public class Tekrar4 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Diktortgenin 2 kenar uzunlugunu girin:");
        int kenar1 = scan.nextInt();
        double kenar2 = scan.nextDouble();

        System.out.println("Diktortgenin alani :"+kenar1*kenar2);
    }
}
