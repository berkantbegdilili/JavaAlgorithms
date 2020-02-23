package bb_projects;

import java.util.Scanner;

/**
 * @author berkant.begdilili@ogr.dpu.edu.tr 
 */

// 20 Faktoriyele Kadar Hesaplama Yapilabilmektedir.

public class ForDongusuIleFaktoriyel {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Faktoriyeli Alinicak Sayiyi Giriniz: ");
            byte n = scanner.nextByte();
     
            if(n<0){
                 System.out.println("Girdiginiz Sayi NEGATIF Olamaz!\n");  
            }else{
                long faktoriyel = 1;

                for(int i=1 ; i<=n ; i++)
                    faktoriyel *= i;

                System.out.println(n+"! = "+faktoriyel); 
                return;
            }
        }
    }  
}
