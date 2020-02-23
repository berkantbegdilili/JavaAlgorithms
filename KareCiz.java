package bb_projects;

import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class KareCiz {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bastırmak İstediğiniz Karenin Bir Kenar Uzunluğunu Giriniz: ");
        int length = scanner.nextInt();
        
        for(int i=0 ; i<length ; i++){
            for(int j=0 ; j<length ; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
