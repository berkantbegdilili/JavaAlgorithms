package bb_projects;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class SifreUret {
    
    private String sifre;
    private final Random random;
    
    private final String CHAR = "abcdefghijklmnopqrstuvwxyz";
    private final String CHAR_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String NUMBER = "0123456789";
    private final String SIGN = "!@#$%^&()+.";
    
    private String sifreSec(int u, String s){
        String result = "";
        for(int i=0 ; i<u ; i++){
            int index = random.nextInt(s.length());
            result += s.charAt(index);
        }
        return result;
    }
    
    private String karistir(String sifre){
        char c;
        StringBuilder result = new StringBuilder(sifre);
        int uzunluk = sifre.length();
        
        while(uzunluk > 1){
            int temp1 = random.nextInt(uzunluk);
            int temp2 = random.nextInt(uzunluk);
            c = result.charAt(temp1);
            result.setCharAt(temp1, result.charAt(temp2));
            result.setCharAt(temp2, c);
            uzunluk--;
        }
        return result.toString();
    }
    
    public String getSifre(){
        return sifre;
    }
    
    public SifreUret(int uzunluk){
        random = new Random();
        
        sifre = "";
        sifre += sifreSec(random.nextInt(uzunluk / 4) + 1, CHAR);
        sifre += sifreSec(random.nextInt(uzunluk / 4) + 1, CHAR_CAPS);
        sifre += sifreSec(random.nextInt(uzunluk / 4) + 1, NUMBER);
        sifre += sifreSec(uzunluk - sifre.length(), SIGN);
        sifre = karistir(sifre);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------- BB Sifre Olusturucusuna Hosgeldiniz ---------\n");

        while(true){
            System.out.print("Olusturmak Istediginiz Sifrenin Uzunlugunu Yaziniz: ");
            int uzunluk = scanner.nextInt();
            if(uzunluk > 0){
                String sifre = new SifreUret(uzunluk).getSifre();
                System.out.println("Olusturulan Sifre: "+sifre);
                break;
            } else
                System.out.println("\nUZUNLUK, NEGATIF BIR DEGER OLAMAZ!\n");
        }
    }
}
