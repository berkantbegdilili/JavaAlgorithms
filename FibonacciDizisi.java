package bb_projects;

import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class FibonacciDizisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kacinci Diziye Kadar Yazilsin: ");
        byte n = scanner.nextByte();
        int f1,f2,temp;
        f1 = 0;
        f2 = 1;
        
        System.out.println("F[1] = "+f1);
        System.out.println("F[2] = "+f2);
        
        for(int i=3 ; i<=n ; i++){
            System.out.println("F["+i+"] = "+(f1+f2));
            
            temp = f1;
            f1 = f2;
            f2 += temp;
        }
    }
}
