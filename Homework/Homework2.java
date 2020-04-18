package bb_projects.Homework;

import java.util.Scanner;

/**
 *
 * @author berkantbegdilili
 */
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input1;
        int input2;
        int input3;
        int input4;
        
        do {
            System.out.print("Olusturmak Istediginiz 1. Matrisin Satir Uzunlugunu Giriniz: ");
            input1 = scanner.nextInt(); 
        } while (input1<=0);
        
        
        do {
            System.out.print("Olusturmak Istediginiz 1. Matrisin Sutun Uzunlugunu Giriniz: ");
            input2 = scanner.nextInt();
        } while (input2<=0);
        
        int[][] mArr1 = new int[input1][input2];
        
        for(int i=0 ; i<input1 ; i++){
            for(int j=0 ; j<input2 ; j++){
                System.out.print((i+1)+".Satir "+(j+1)+".Sutun Elemanini Giriniz: ");
                mArr1[i][j] = scanner.nextInt();
            }
        }
        
        do {
            System.out.print("Olusturmak Istediginiz 2. Matrisin Satir Uzunlugunu Giriniz: ");
            input3 = scanner.nextInt(); 
        } while (input3<=0);
        
        
        do {
            System.out.print("Olusturmak Istediginiz 2. Matrisin Sutun Uzunlugunu Giriniz: ");
            input4 = scanner.nextInt();
        } while (input4<=0);
        
        int[][] mArr2 = new int[input3][input4];
        
        for(int i=0 ; i<input3 ; i++){
            for(int j=0 ; j<input4 ; j++){
                System.out.print((i+1)+".Satir "+(j+1)+".Sutun Elemanini Giriniz: ");
                mArr2[i][j] = scanner.nextInt();
            }
        }
        
        boolean equal = false;
        
        if(input1==input3 && input2==input4){
            
            for(int i=0 ; i<input1 ; i++){
                for(int j=0 ; j<input2 ; j++){
                    equal = mArr1[i][j] == mArr2[i][j] ? true : false;
                }
            }
                
            if(equal){
                System.out.println("IKI MATRIS BIRBIRINE ESITTIR!");
            }else{
                System.out.println("IKI MATRIS BIRBIRINE ESIT DEGILDIR!");
            }
            
        }else{
            System.out.println("IKI MATRIS BIRBIRINE ESIT DEGILDIR!");
        }  
    }
}
