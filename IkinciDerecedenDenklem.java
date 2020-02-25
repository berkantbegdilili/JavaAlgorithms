package bb_projects;

import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class IkinciDerecedenDenklem {
    
    public static void root(float coefficient1,float coefficient2,float delta){
        
        float root1,root2;
        root1 = (-coefficient2-(float)(Math.sqrt(delta)))/(2*coefficient1);
        root2 = (-coefficient2+(float)(Math.sqrt(delta)))/(2*coefficient1);
        
        if(delta>0){
            System.out.println("\nDenklemin 2 Adet Reel Koku Vardir.\n");
            System.out.println("1.Kok= "+root1+"\n2.Kok= "+root2);
        }
        else if(delta<0){
            System.out.println("\nDenklemin Reel Koku Yoktur.\n");
            System.out.println("Cozum Kümesi Bos Kumedir.");
        }
        else{
            System.out.println("\nDenklemin 2 Adet Reel Koku Vardır.");
            System.out.println("Fakat Bu 2 Kok Birbirine Çakisiktir.Yani 2 Kok Birbirine Esittir.\n");
            System.out.println("1.Kok = 2.Kok = "+root1);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(" x^2 nin katsayisini giriniz: ");
        float coefficient1 = scanner.nextFloat();
        
        System.out.println("");
        
        System.out.print(" x nin katsayisini giriniz: ");
        float coefficient2 = scanner.nextFloat();
        
        System.out.println("");
        
        System.out.print(" sabit sayi giriniz: ");
        float coefficient3 = scanner.nextFloat();
        
        float delta;
        delta = (float)(Math.pow(coefficient2,2)-(4*coefficient1*coefficient3)) ;
        
        root(coefficient1,coefficient2, delta);
        
    }
}
