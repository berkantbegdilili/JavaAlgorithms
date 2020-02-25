package bb_projects;

import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class DershaneTanitim {
    public static void course_option(){
        StringBuilder text = new StringBuilder();
        text.append("-- BB EĞİTİM KURUMU --\n");
        text.append("Kurs Seçenekleri:\n");
        text.append("1- Özel Ders Sistemi\n");
        text.append("2- Sınıf Dersi Sistemi\n");
        System.out.println(text.toString());
    }
    
    public static void course_info(int infoSelect){
        switch(infoSelect){
            case 1: 
                StringBuilder info1 = new StringBuilder();
                info1.append("\nÖğrenci ile öğretmen bire bir etkileşim ile ");
                info1.append("konu anlatımı,soru çözümü,ödevlendirme ve takibi ");
                info1.append("yapılan kurs çeşitidir.");
                System.out.println(info1.toString());
                break;
            case 2:
                StringBuilder info2 = new StringBuilder();
                info2.append("\nÖğrencinin maksimum 15 kişilik sınıflarda ");
                info2.append("karma şekilde öğretmen ile konu anlatımı,soru çözümü ");
                info2.append("yapılan kurs çeşitidir.");
                System.out.println(info2.toString());
                break;
            default:
                System.out.println("HATA: Geçerli Bir Kurs Seçimi Yapmadınız!");
        }
    }
    
    public static void lesson_select(int lessonSelect) throws InterruptedException{
        
        if(lessonSelect<=5 && lessonSelect>=1){
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nAylık Almak İstediğiniz Ders Saatini Yazınız: ");
            int lessonTime = scanner.nextInt(); 
            Thread.sleep(1000);
        
            switch(lessonSelect){
                case 1:
                    System.out.println("Aylık Ödenecek Tutar: "+(lessonTime*70)+" TL");
                    System.out.println("\nNOT: Matematik Dersi İçin Saatlik Ücret 70 TL'dir.");
                    break;
                case 2:
                    System.out.println("Aylık Ödenecek Tutar: "+(lessonTime*70)+" TL");
                    System.out.println("\nNOT: Türkçe Dersi İçin Saatlik Ücret 70 TL'dir.");
                    break;
                case 3:
                    System.out.println("Aylık Ödenecek Tutar: "+(lessonTime*60)+" TL");
                    System.out.println("\nNOT: Fizik Dersi İçin Saatlik Ücret 60 TL'dir.");
                    break;    
                case 4:
                    System.out.println("Aylık Ödenecek Tutar: "+(lessonTime*60)+" TL");
                    System.out.println("\nNOT: Kimya Dersi İçin Saatlik Ücret 60 TL'dir.");
                    break; 
                case 5:
                    System.out.println("Aylık Ödenecek Tutar: "+(lessonTime*60)+" TL");
                    System.out.println("\nNOT: Biyoloji Dersi İçin Saatlik Ücret 60 TL'dir.");
                    break;
            }
        }
        else
            System.out.println("HATA: Geçerli Bir Ders Seçimi Yapmadınız!");
    }
    
    public static void course1() throws InterruptedException{
            Scanner scanner = new Scanner(System.in);
        
            System.out.println("Ders Listesi:");
            StringBuilder lesson = new StringBuilder();
            lesson.append("1- Matematik\n");
            lesson.append("2- Türkçe\n");
            lesson.append("3- Fizik\n");
            lesson.append("4- Kimya\n");
            lesson.append("5- Biyoloji");
            System.out.println(lesson.toString());
            System.out.print("Fiyatlandırma İçin Özel Ders Almak İstediğiniz Dersi Seçiniz: ");
            int lessonSelect = scanner.nextInt();
        
            lesson_select(lessonSelect);
            
            System.out.println("\nYeniden Fiyatlandırmak İster Misiniz? ( Y(evet) veya N(hayır) yazınız )");
            String repeat = scanner.next();
            
            switch(repeat.trim().toLowerCase()){   
                case "y":
                    course1();
                    break;
                case "n":
                    return;
                default:
                    System.out.println("Geçerli Bir Değer Girmediniz.Uygulamadan Çıkılıyor..");
                    Thread.sleep(1500);
            }
    }
    
    public static void course2(){
        System.out.println("YAKINDA!");
    }
    
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        
        course_option();
        System.out.print("Lütfen Bilgilendirilmek İstediğiniz Kursu Seçiniz: ");
        int infoSelect = scanner.nextInt();
        course_info(infoSelect);
        
        while(infoSelect<=2 && infoSelect>0){
            System.out.println("\nDilerseniz Kurumumuzu Gezelim ve Fiyatlandırmaya Geçelim..\n");
            Thread.sleep(1200);
        
            if(infoSelect == 1){
                course1();
                return;
            }
            else if(infoSelect == 2){
                course2();
                return;
            }
        }
    }
}
