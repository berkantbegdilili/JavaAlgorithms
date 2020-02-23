package bb_projects;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class RastgeleOlusanDiziler {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Olusturmak Istediginiz Dizinin Uzunlugunu Giriniz: ");
        byte length = scanner.nextByte();
        
        int[] arr = new int[length];
        
        for(int i=0 ; i<length ; i++){
            arr[i] = random.nextInt(15); // 0-14 Arasi Rastgele Sayi Atanir.
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
}
