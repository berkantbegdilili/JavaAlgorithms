package bb_projects;

import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */

// 20 Faktoriyele Kadar Hesaplama Yapilabilmektedir.

public class OzyinelemeIleFaktoriyel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Faktoriyeli Alinicak Sayiyi Giriniz: ");
            byte n = scanner.nextByte();

            if (n < 0) {
                System.out.println("Girdiginiz Sayi NEGATIF Olamaz!\n");
            } else {
                System.out.println(n + "! = "+faktoriyel(n));
                return;
            }
        }
    }
    public static long faktoriyel(byte n){
        if(n==1 || n==0)
            return 1;
        else
            return (n*faktoriyel((byte)(n-1)));
    }
}
