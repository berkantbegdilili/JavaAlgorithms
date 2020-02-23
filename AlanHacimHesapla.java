package bb_projects;

import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class AlanHacimHesapla {
    public static void main(String[] args) throws InterruptedException{
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
        System.out.println("1- Ucgen Prizma");
        System.out.println("2- Kare Prizma");
        System.out.println("3- Dikdörtgen Prizma");
        System.out.println("4- Silindir");
        System.out.println("5- Koni");
        System.out.println("6- Kure");
        System.out.print("\nHacmini Hesaplamak Istediginiz Cisimi Seciniz: ");
        int input = scanner.nextInt();
        
        
        if(input>0 && input<6){
        switch(input){
            case 1 : 
                    System.out.print("Ucgen Prizmanin 1.Kenar Uzunlugunu Giriniz:");
                    float t11 = scanner.nextFloat();
                    System.out.print("Ucgen Prizmanin 2.Kenar Uzunlugunu Giriniz: ");
                    float t12 = scanner.nextFloat();
                    System.out.print("Ucgen Prizmanin Yuksekligini Giriniz: ");
                    float h1 = scanner.nextFloat();
                    System.out.println("Hesaplaniyor..");
                    Thread.sleep(2000);
                    float result1 = t11*t12/2;
                    System.out.println("\nUcgen Prizmanın Taban Alani: "+result1);
                    System.out.println("Ucgen Prizmanın Hacmi: "+(result1*h1));
                    System.out.println("\nUnutmayalim ki, \"Hacim = Taban Alani * Yukseklik 'tir.\"");
                    break;
            case 2 :
                    System.out.print("Kare Prizmanin Bir Kenarının Uzunluğunu Giriniz: ");
                    float t2 = scanner.nextFloat();
                    System.out.print("Kare Prizmanin Yüksekliğini Giriniz: ");
                    float h2 = scanner.nextFloat();
                    System.out.println("Hesaplanıyor..");
                    Thread.sleep(2000);
                    float result2 = t2*t2;
                    System.out.println("\nKare Prizmanin Taban Alani: "+result2);
                    System.out.println("Kare Prizmanin Hacmi: "+(result2*h2));
                    System.out.println("\nUnutmayalim ki, \"Hacim = Taban Alani * Yükseklik 'tir.\"");
                    break;
            case 3 :
                    System.out.print("Dikdortgen Prizmanin Uzun Kenarinin Uzunlugunu Giriniz: ");
                    float t31 = scanner.nextFloat();
                    System.out.print("Dikdortgen Prizmanin Kısa Kenarinin Uzunlugunu Giriniz: ");
                    float t32 = scanner.nextFloat();
                    System.out.print("Dikdortgen Prizmanin Yuksekligini Giriniz: ");
                    float h3 = scanner.nextFloat();
                    System.out.println("Hesaplaniyor..");
                    Thread.sleep(2000);
                    float result3 = t31*t32;
                    System.out.println("Dikdortgen Prizmanin Taban Alani: "+result3);
                    System.out.println("Dikdortgen Prizmanin Hacmi: "+(result3*h3));
                    System.out.println("\nUnutmayalim ki, \"Hacim = Taban Alani * Yükseklik 'tir.\"");
                    break;
            case 4 :
                    System.out.print("Silindirin Yaricapini Giriniz: ");
                    float r4 = scanner.nextFloat();
                    System.out.print("Silindirin Yuksekligini Giriniz");
                    float h4 = scanner.nextFloat();
                    System.out.print("Pi Degerini Giriniz: ");
                    float pi4 = scanner.nextFloat();
                    System.out.println("Hesaplaniyor..");
                    Thread.sleep(2000);
                    float result4 = pi4*(float)Math.pow(r4, 2);
                    System.out.println("Silindirin Taban Alani: "+result4);
                    System.out.println("Silindirin Hacmi: "+(result4*h4));
                    System.out.println("\nUnutmayalim ki, \"Hacim = Taban Alani * Yükseklik 'tir.\"");
                    break;
            case 5 :
                    System.out.print("Koninin Yaricapini Giriniz: ");
                    float r5 = scanner.nextFloat();
                    System.out.print("Koninin Yuksekligini Giriniz: ");
                    float h5 = scanner.nextFloat();
                    System.out.print("Pi Değerini Giriniz: ");
                    float pi5 = scanner.nextFloat();
                    System.out.println("Hesaplaniyor..");
                    Thread.sleep(2000);
                    float result5 = pi5*(float)Math.pow(r5, 2);
                    System.out.println("Koninin Taban Alani: "+result5);
                    System.out.println("Koninin Hacmi: "+(result5*h5/3));
                    System.out.println("\nUnutmayalim ki, Koni Silindirin 3'te 1'ine Esittir.");
                    break;
            case 6 :
                    System.out.print("Kurenin Yaricapini Giriniz: ");
                    float r6 = scanner.nextFloat();
                    System.out.print("Pi Degerini Giriniz: ");
                    float pi6 = scanner.nextFloat();
                    System.out.println("Hesaplaniyor..");
                    Thread.sleep(2000);
                    float result6 = 4*pi6*(float)Math.pow(r6, 2);
                    System.out.println("Kurenin Alani: "+result6);
                    System.out.println("Kurenin Hacmi: "+(result6*r6/3));
                    break;
        }
        break;
        }
        else{
                System.out.println("Girdiginiz Veriyi Kontrol Ediniz..\n");
                Thread.sleep(2000);
        }
        }
    }
}
