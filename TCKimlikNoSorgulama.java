package bb_projects;

import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class TCKimlikNoSorgulama {
    public static void main(String[] args) throws InterruptedException {
        
        Scanner scanner = new Scanner(System.in);
        while (true) {            
            System.out.print("Sorgulanacak T.C. Numarasini Giriniz: ");
            String num = scanner.next();
        
            if (num.length()!= 11)
                System.out.println("!!! Hata Kodu 400: T.C. Numarasi 11 Haneli Olmalı !!!");
            if(num.startsWith("0"))
                System.out.println("!!! Hata Kodu 403: T.C. Numarasi 0 ile Baslayamaz !!!"); 

            char arrChar[] = num.toCharArray();
            int [] arr = new int[arrChar.length];
            for(int i=0 ; i<arrChar.length ; i++)
              arr[i] = Integer.parseInt(String.valueOf(arrChar[i]));
           
            int odds = arr[0]+arr[2]+arr[4]+arr[6]+arr[8];
            int evens = arr[1]+arr[3]+arr[5]+arr[7];
            int result10 = ((7*odds)-evens)%10;
            int result11 = (odds+evens+arr[9])%10;
  
            if(arr[10]%2 != 0)
                System.out.println("!!! Hata Kodu 401: T.C. Numarasi Tek Rakam ile Bitemez !!!");
            if(arr[9] != result10)
                System.out.println("!!! Hata Kodu 410: T.C. Numarasi HATALI !!!");
            else if(arr[10] != result11)
                System.out.println("!!! Hata Kodu 411: T.C. Numarasi HATALI !!!");
            else{
               System.out.println("BU NUMARAYA SAHIP VATANDAS, TURK VATANDASIDIR");
               Thread.sleep(1200);
               System.out.print("Cikmak Icin 'q' Yaziniz: ");
               String exit = scanner.next();
               
               if(exit.equals("q"))
                   System.exit(0);    
            }
        }
    }
}
