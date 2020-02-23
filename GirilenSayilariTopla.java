package bb_projects;

import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class GirilenSayilariTopla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.print("Toplamak Istediginiz Sayi Adedini Giriniz: ");
        byte input = scanner.nextByte();
        
        for(int i=0 ; i<input ; i++){
            System.out.print((i+1)+". Sayiyi Giriniz: ");
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println("\nGirdiginiz Sayilarin Toplami -->  "+sum);
    }
}
