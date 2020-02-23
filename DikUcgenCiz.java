package bb_projects;

import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class DikUcgenCiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.print("Dik Ucgenin Yuksekligini Giriniz: ");
        int h = scanner.nextInt();
            if(h>0){
                for(int i=0 ; i<h ; i++){
                    for(int j=0 ; j<i+1 ; j++){
                         System.out.print("* ");   
                    }  
                   System.out.println("");
                }
                System.out.println("Cikmak icin q yazin,Devam etmek icin baska herhangi bir tusa basin.");
                String b = scanner.next();
                if(b.equals("q")){
                    break;
                }
                else {
                }
            }
            else
            System.out.println("Lutfen Pozitif Tam Sayi Giriniz.");
        }
    }
}
