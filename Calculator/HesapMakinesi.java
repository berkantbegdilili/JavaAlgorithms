package bb_projects.Calculator;

import java.util.HashSet;
import java.util.Scanner;


/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class HesapMakinesi{
    
    public static void menu(){
        StringBuilder menu = new StringBuilder();
        menu.append("\n1- Toplama\n");
        menu.append("2- Cikarma\n");
        menu.append("3- Carpma\n");
        menu.append("4- Bolme\n");
        menu.append("\nYapmak Istediginiz Islemi Giriniz");
        System.out.println(menu.toString());
    }
    

    public static String[] convert(StringBuilder s, String op){
        HashSet<Integer> e = new HashSet<>();
        int i=0;

        while(s.indexOf(op,i) != -1){
            e.add(s.indexOf(op,i)); 
            i++;
        } 
        
        Object[] temp = e.toArray();
        e.clear();
        
        for(int t=0; t<temp.length ; t++){
            int temp2 = Integer.parseInt(temp[t].toString());
            s.setCharAt(temp2,' ');
        }
 
        String[] arr = s.toString().split(" ");
        
        return arr;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("------------- BB Hesap Makinesi -------------");
        menu();
        byte selection = scanner.nextByte();
        
        switch(selection){
            case 1:
                final String OP1 = "+";
                System.out.print("ISLEMI GIRINIZ: ");
                String in1 = scanner.next();
                StringBuilder sb1 = new StringBuilder(in1);
                Toplama toplama = new Toplama(convert(sb1, OP1));
                System.out.println(toplama);
                break;
            case 2:
                final String OP2 = "-";
                System.out.print("ISLEMI GIRINIZ: ");
                String in2 = scanner.next();
                StringBuilder sb2 = new StringBuilder(in2);
                Cikarma cikarma = new Cikarma(convert(sb2, OP2));
                System.out.println(cikarma);
                break;
            case 3:
                final String OP3 = "*";
                System.out.print("ISLEMI GIRINIZ: ");
                String in3 = scanner.next();
                StringBuilder sb3 = new StringBuilder(in3);
                Carpma carpma = new Carpma(convert(sb3, OP3));
                System.out.println(carpma);
                break;
            case 4:
                final String OP4 = "/";
                System.out.print("ISLEMI GIRINIZ: ");
                String in4 = scanner.next();
                StringBuilder sb4 = new StringBuilder(in4);
                Bolme bolme = new Bolme(convert(sb4, OP4));
                System.out.println(bolme);
                break;
            default:
                System.out.println("HATA: GECERLI BIR SECIM YAPMADINIZ!");
        }
    }
    
}
