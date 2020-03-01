package bb_projects.Calculator;

import java.util.HashSet;
import java.util.Scanner;


/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class HesapMakinesi{
    static Scanner scanner = new Scanner(System.in);
    
    // Hesap Makinesi Menusu
    public static void menu(){
        StringBuilder menu = new StringBuilder();
        menu.append("\n1- Toplama\n");
        menu.append("2- Cikarma\n");
        menu.append("3- Carpma\n");
        menu.append("4- Bolme\n");
        menu.append("\nYapmak Istediginiz Islemi Giriniz");
        System.out.println(menu.toString());
    }
    
    /**
     * Bu method, girilen ifadeyi oparatorlerden ayirip diziye donusturur.
     * 
     * @param s Girilen islem
     * @param op Girilen oparator
     * @return Olusan dizi
     */
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
        
        System.out.println("------------- BB Hesap Makinesi -------------");
        
        double temp = 0;
        
        while(true){ // Sonsuz dongu
            menu();
            byte selection = scanner.nextByte();
            Secim secim = new Secim(selection);
            
            System.out.println("Baska bir oparatorle islem yapmaya "
                                + "devam etmek ister misiniz?"
                                + "(Evet icin 'e' karakterini giriniz)");
            String e1 = scanner.next();
            
            if(e1.equalsIgnoreCase("e")){
                temp += secim.getResult();
            }else{
                if(temp == 0){
                    System.out.println();
                    System.out.println("SONUC: "+secim);
                    break;
                }else {
                    System.out.println();
                    System.out.println("SONUC: "+(temp+secim.getResult()));
                    break;
                }
            }
        }
    }
}
