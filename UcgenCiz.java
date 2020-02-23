package bb_projects;

import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class UcgenCiz {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      
        while(true){
            System.out.print("Olusturmak Istediginiz Ucgenin Yuksekligini Giriniz: ");
            int h = scanner.nextInt();
            int space = h;
            int star = 1;
            if(h>0){   
                for(int i=0 ; i<h ; i++){
                    for(int j=0 ; j<space ; j++)
                        System.out.print(" ");
           
                    for(int k=0 ; k<star*2-1 ; k++)
                        System.out.print("*");
                    
                    System.out.println("");
                    star += 1;  
                    space -= 1;         
                }
              break;
            }
            else
                System.out.println("Lutfen Gecerli Bir Yukseklik Degeri Giriniz.");
        }
    }
}
