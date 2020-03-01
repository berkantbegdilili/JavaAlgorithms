package bb_projects.Calculator;

import static bb_projects.Calculator.HesapMakinesi.convert;
import static bb_projects.Calculator.HesapMakinesi.scanner;

/**
 * Secimi Gerceklestiren Sinif
 * 
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class Secim {
    
    private byte selection;
    private double result;

    public Secim(byte selection){
        this.selection = selection;
        this.result = selection(this.selection);
    }
    
    /**
     * Bu method, secilen islemi yapar ve dondurur
     * 
     * @param selection Kullanicinin sectigi islem
     * @return Islem sonucu
     */  
    public static double selection(byte selection){
        
        switch(selection){
            case 1:
                final String OP1 = "+";
                System.out.print("ISLEMI GIRINIZ: ");
                String in1 = scanner.next();
                StringBuilder sb1 = new StringBuilder(in1);
                Toplama toplama = new Toplama(convert(sb1, OP1));
                return Double.parseDouble(toplama.toString());
                
            case 2:
                final String OP2 = "-";
                System.out.print("ISLEMI GIRINIZ: ");
                String in2 = scanner.next();
                StringBuilder sb2 = new StringBuilder(in2);
                Cikarma cikarma = new Cikarma(convert(sb2, OP2));
                return Double.parseDouble(cikarma.toString());
            case 3:
                final String OP3 = "*";
                System.out.print("ISLEMI GIRINIZ: ");
                String in3 = scanner.next();
                StringBuilder sb3 = new StringBuilder(in3);
                Carpma carpma = new Carpma(convert(sb3, OP3));
                return Double.parseDouble(carpma.toString());
            case 4:
                final String OP4 = "/";
                System.out.print("ISLEMI GIRINIZ: ");
                String in4 = scanner.next();
                StringBuilder sb4 = new StringBuilder(in4);
                Bolme bolme = new Bolme(convert(sb4, OP4));
                return Double.parseDouble(bolme.toString());
        }
        return 0;
    }
    
    /**
     * Bu method, sonucu dondurur
     * 
     * @return Sonuc
     */
    public double getResult() {
        return result;
    }
    
    /**
     * Bu method, nesne cagrildiginde sonucu yazdirir
     * 
     * @return Sonuc
     */
    @Override
    public String toString() {
        return String.valueOf(result);
    } 
    
}
