package bb_projects;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
 
class Musteri {
    int musteriNo;
    int sifre;
    double bakiye;
 }

class ATM {
    Musteri m;
    boolean onay = false;
    
    public ATM(Musteri m){
        this.m = m;
    }
    
    boolean giris(int musteriNo,int sifre){
        if(m.musteriNo == musteriNo && m.sifre == sifre)
            return true;
        else
            return false;
    }
    
    void paraYatirma(double miktar){
        if(onay)
            m.bakiye += miktar;
    }
    
    void paraCekme(double miktar){
        if(onay){
            if(m.bakiye >= miktar)
                m.bakiye -= miktar;    
        }
    }
    
    void cikis(){
        onay = false;
    }
    
}

public class BBank_v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        StringBuilder bank = new StringBuilder();
        bank.append("-- HOSGELDINIZ --\n");
        bank.append("Musteri Numaranizi Giriniz: ");
        System.out.print(bank.toString());
        int musteriNo = scanner.nextInt();
        System.out.print("Sifrenizi Giriniz: ");
        int sifre = scanner.nextInt();
        
        Musteri bb = new Musteri();
        bb.musteriNo = musteriNo;
        bb.sifre = sifre;
        
        ATM atm = new ATM(bb);
        atm.onay = atm.giris(musteriNo, sifre);
        if(atm.onay == true){
            while(true){
                StringBuilder islemler = new StringBuilder();
                islemler.append("\n---------- BBank ----------\n");
                islemler.append("KULLANILABILIR BAKIYE: ").append(bb.bakiye).append("\n\n");
                islemler.append("1- Para Çekme\n");
                islemler.append("2- Para Yatirma\n");
                islemler.append("3- Cikis");
                System.out.println(islemler.toString());
                
                System.out.print("Yapmak Istediginiz Islemi Yaziniz: ");
                int islem = scanner.nextInt();
            
                switch(islem){
                    case 1: 
                            System.out.print("Cekmek Istediginiz Tutari Giriniz: ");
                            double cekme = scanner.nextDouble();
                            atm.paraCekme(cekme);
                            break;
                    case 2:
                            System.out.print("Yatirmak Istediginiz Tutari Giriniz: ");
                            try{
                                double yatirma = scanner.nextDouble();
                                if(yatirma>0)
                                    atm.paraYatirma(yatirma);
                                else
                                    System.out.println("GIRILEN TUTAR TANIMLANAMIYOR!\n");
                                break;
                            }
                            catch(InputMismatchException e){
                                System.out.println("GIRILEN TUTAR TANIMLANAMIYOR!\n");
                                break;
                            }
                    case 3:
                            atm.cikis();
                            System.out.println("HOSCAKALIN! ");
                            return;
                }
            }
        }
        else{
            System.out.println("MUSTERI NUMARANIZ veya SIFRENIZ HATALI!");
        }
    }
}
