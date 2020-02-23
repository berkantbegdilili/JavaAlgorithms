package bb_projects;

import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class MatrisiDiziyeDonusturme {
    public static void main(String[] args) throws InterruptedException {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Olusturmak Istediginiz Matrisin Satir Sayisini Giriniz: ");
        int numofRow = scanner.nextInt();
        System.out.print("Olusturmak Istediginiz Matrisin Sütun Sayisini Giriniz: ");
        int numofColumn = scanner.nextInt();
        System.out.print("Olusturulacak Matrise Rastgele Atanacak Degerleri Hangi Sayi ile Baslatmak Istediginizi Giriniz: ");
        int start = scanner.nextInt();
        System.out.print("Olusturulacak Matrise Rastgele Atanacak Degerleri Hangi Sayi ile Bitirmek Istediginizi Giriniz: ");
        int stop = scanner.nextInt();
        
        double [][] mArr = new double [numofRow][numofColumn];
        System.out.println("Lutfen Bekleyiniz, Matrisiniz Olusturuluyor..");
        Thread.sleep(750);
        
        System.out.println("\n --- Rastgele Olusan Matris --- ");
        for(int i=0 ; i<mArr.length ; i++){
            for(int j=0 ; j<mArr[0].length ; j++){
                mArr[i][j] = start+(int)(Math.random()* (stop-start));
                System.out.print(mArr[i][j]+"\t");
            }
            System.out.println();
        }
        
        double [] oldArr = new double [mArr.length*mArr[0].length];
        double [] evenArr = new double [mArr.length*mArr[0].length];
        int k = 0,l = 0;
        
        for(int i=0 ; i<mArr.length ; i++){
            for(int j=0 ; j<mArr[0].length ; j++){
                   try{
                        if(mArr[i][j]%2 != 0){    
                            oldArr[k] = mArr[i][j];
                            k++;
                        }
                    }
                    catch(ArrayIndexOutOfBoundsException error){
                        System.out.println("HATA: Dizi sinirlarindan cikilma hatasi!");
                    }
            }
        }
        
        for(int i=0 ; i<mArr.length ; i++){
            for(int j=0 ; j<mArr[0].length ; j++){
                   try{
                        if(mArr[i][j]%2 == 0){    
                            evenArr[l] = mArr[i][j];
                            l++;
                        }
                    }
                    catch(ArrayIndexOutOfBoundsException error){
                        System.out.println("HATA: Dizi sinirlarindan cikilma hatasi!");
                    }
            }
        }
        
        System.out.println("\n\n-- Tek Sayilar Dizisi --");
        for(int i=0 ; i<k ; i++){
            System.out.println("arr["+i+"]= "+oldArr[i]+"\t");
        }
        
        System.out.println("\n\n-- Cift Sayilar Dizisi --");
        for(int i=0 ; i<l ; i++){
            System.out.println("arr["+i+"]= "+evenArr[i]+"\t");
        }
    }
}
