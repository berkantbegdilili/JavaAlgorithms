package bb_projects;

import java.util.Random;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class RastgeleOlusanMatrislerveIslemleri {
    public static void main(String[] args) {
        
        int [][] A= new int[3][3]; // A Matrisi
        int [][] B= new int[3][3]; // B Matrisi
        int [][] T= new int[3][3]; // A+B Matrisi
        int [][] C= new int[3][3]; // A*B Matrisi
        
        Random random = new Random(); // Random Sinifi
        
        // Matrisleri Rastgele Sekilde Atama  
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
               Integer randA = random.nextInt(21); // 0-20 Arasi Rastgele Sayi Atanacak.
               Integer randB = random.nextInt(21); // 0-20 Arasi Rastgele Sayi Atanacak.
               A[i][j]=randA;
               B[i][j]=randB;
            }
        }
        // A Matrisini Yazma
        System.out.println("-- A Matrisi --");
        for(int i=0; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(A[i][j]+"  ");
            }
            System.out.println("");
        }
        // B Matrisini Yazma
        System.out.println("");
        System.out.println("-- B Matrisi --");
        for(int i=0; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(B[i][j]+"  ");
            }
            System.out.println("");
        }
        // Matrisleri Toplama ve Yazma
        System.out.println("");
        System.out.println("-- A+B Matrisi --");
        for(int i=0; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                T[i][j]=A[i][j]+B[i][j];
                System.out.print(T[i][j]+"  ");
            }
            System.out.println("");
        }
        // Matrisleri Carpma
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                C[i][j]=0;
                for(int k=0 ; k<3 ; k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        // Carpilan Matrisleri Yazma
        System.out.println("");
        System.out.println("-- A*B Matrisi --");
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(C[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}
