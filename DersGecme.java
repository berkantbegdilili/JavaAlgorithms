package bb_projects;

import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class DersGecme {
    public static void butunleme(float passing,float note1,float effectnote1,float effectnote2){
                
                Scanner scanner = new Scanner(System.in);
                
                System.out.println("Butunleme Sınavlarına Kaldiniz..");
                System.out.println("");
                System.out.print("Butunleme Notunuzu Giriniz: ");
                float note3 = scanner.nextFloat();
                
                float result2;
                result2 = (note1*effectnote1/100) + (note3*effectnote2/100);
                
                if(result2>passing){
                    System.out.println("Dersi Gectiniz. Ortalamanız Hesaplaniyor..");
                    System.out.println("Ortalamaniz :"+result2);
                }
                else{
                    System.out.println("Dersten Kaldınız. Ortalamanız Hesaplaniyor..");
                    System.out.println("Ortalamaniz :"+result2);
                }
    }
    
    public static void main(String[] args) {
   
            Scanner scanner = new Scanner(System.in);
        
            System.out.print("Ders Gecme Notunuzu Giriniz: ");
            float passing = scanner.nextFloat();
            
            System.out.print("Vize Notunuzu Giriniz: ");
            float note1 = scanner.nextFloat();
            System.out.print("Vize Notunuzun Ortalamaya Etkisini(Yuzde) Giriniz: ");
            float effectnote1 = scanner.nextFloat();
            
            System.out.println("");
            
            System.out.print("Final Notunuzu Giriniz: ");
            float note2 = scanner.nextFloat();
            System.out.print("Final Notunuzun Ortalamaya Etkisini(Yuzde) Giriniz: ");
            float effectnote2 = scanner.nextFloat();
            
            if(note2>=passing){
                float result1;
                result1 = (note1*effectnote1/100) + (note2*effectnote2/100);
                
                if(result1>passing){
                System.out.println("Dersi Gectiniz. Ortalamaniz Hesaplaniyor..");
                System.out.println("Ortalamaniz :"+result1);
                }
                else
                    butunleme(passing,note1,effectnote1,effectnote2);
            }
            else
                butunleme(passing,note1,effectnote1,effectnote2);          
    }
}
