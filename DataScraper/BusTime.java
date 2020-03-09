package bb_projects.DataScraper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class BusTime {
    static Scanner scanner = new Scanner(System.in);
   
    // Menu
    public static void menu(){
        StringBuilder menu = new StringBuilder();
        menu.append("1. A-1 Nolu HAT\n");
        menu.append("2. 7A Nolu HAT\n");
        menu.append("3. 7B Nolu HAT\n");
        menu.append("4. 16 Nolu HAT\n");
        menu.append("5. 5 Nolu HAT\n\n");
        menu.append("SAAT BILGISI ALMAK ISTEDIGINIZ HATTI YAZINIZ: ");
        System.out.print(menu.toString());
    }
    
    public static void main(String[] args) {
              
             Date date = new Date();
             DateFormat df = new SimpleDateFormat("EEEE");
             String today = df.format(date).toLowerCase();
             DateFormat df2 = new SimpleDateFormat("dd MMMM yyyy EEEE");
             System.out.println(df2.format(date)+"\n");

             
             menu();
             byte select = scanner.nextByte();
             if(select>0 && select<6){
                Selection selection = new Selection(select,today);

                Data data = new Data(selection.getSelect(),selection.getToday());
                data.getData();
                data.print(select);
             } else{
                 System.out.println("YANLIS HAT SECIMI YAPTINIZ!");
             }
             
             
    }
}
