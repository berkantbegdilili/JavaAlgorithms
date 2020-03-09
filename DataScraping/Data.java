package bb_projects.DataScraping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Veri Kazima Isleminin Oldugu Sinif
 * 
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class Data {
    private String URL;
    private String today;
    private List<String> arr = new ArrayList<>();
    private List<String> list1 = new ArrayList<>();
    private List<String> list2 = new ArrayList<>();
    
    public Data(String URL,String today){
        this.URL = URL;
        this.today = today;
    }

    public void getData(){
        try{
            Document document = Jsoup.connect(URL).get();
            Elements bus = document.select("#main tr");
            
            for(Element element : bus){
                arr.add(element.getElementsContainingText(":").text());            
            }
            
            for(int i=1 ; i<arr.size() ; i++){
                if(arr.get(i).equals(""))
                    arr.remove(i-1);
                else{
                    String[] s = arr.get(i).split(" ",20);
                    if(today.equalsIgnoreCase("saturday")){
                        list1.add(s[6]);
                        list2.add(s[16]);
                        list1.remove("——");
                        list2.remove("——");
                    } else if(today.equalsIgnoreCase("sunday")){
                        list1.add(s[8]);
                        list2.add(s[18]);
                        list1.remove("——");
                        list2.remove("——");
                    } else{
                        list1.add(s[0]);
                        list2.add(s[10]);
                        list1.remove("——");
                        list2.remove("——");
                    }  
                }      
            }

        } catch(IOException e) { }
    }

    public void print(Byte select){
        
        switch(select){
            case 1:
                System.out.println("\n          T.C.\n" +
                                "    KUTAHYA BELEDIYESI\n" +
                                "ULASIM HIZMETLERI MUDURLUGU");
                
                System.out.println("\n    ZAFERTEPE KALKISI");
                for(int i=0 ; i<list1.size() ; i++){
                    System.out.println("        "+list1.get(i));
                }
                
                System.out.println("\n    M.KAMPUS KALKISI");
                for(int j=0 ; j<list2.size() ; j++){
                    System.out.println("        "+list2.get(j));
                }
            break;
            case 2:
                System.out.println("\n          T.C.\n" +
                                "    KUTAHYA BELEDIYESI\n" +
                                "ULASIM HIZMETLERI MUDURLUGU");
                
                System.out.println("\n    OTOGAR KALKISI");
                for(int i=0 ; i<list1.size() ; i++){
                    System.out.println("        "+list1.get(i));
                }
                
                System.out.println("\n    M.KAMPUS KALKISI");
                for(int j=0 ; j<list2.size() ; j++){
                    System.out.println("        "+list2.get(j));
                }
            break;
            case 3:
                System.out.println("\n          T.C.\n" +
                                "    KUTAHYA BELEDIYESI\n" +
                                "ULASIM HIZMETLERI MUDURLUGU");
                
                System.out.println("\n CAN CINI KAFE KALKISI");
                for(int i=0 ; i<list1.size() ; i++){
                    System.out.println("        "+list1.get(i));
                }
                
                System.out.println("\n    M.KAMPUS KALKISI");
                for(int j=0 ; j<list2.size() ; j++){
                    System.out.println("        "+list2.get(j));
                }
            break;
            case 4:
                System.out.println("\n          T.C.\n" +
                                "    KUTAHYA BELEDIYESI\n" +
                                "ULASIM HIZMETLERI MUDURLUGU");
                
                System.out.println("\n TIP FAKULTESI KALKISI");
                for(int i=0 ; i<list1.size() ; i++){
                    System.out.println("        "+list1.get(i));
                }
                
                System.out.println("\n    DOKUZLAR KALKISI");
                for(int j=0 ; j<list2.size() ; j++){
                    System.out.println("        "+list2.get(j));
                }
            break;
            case 5:
                System.out.println("\n          T.C.\n" +
                                "    KUTAHYA BELEDIYESI\n" +
                                "ULASIM HIZMETLERI MUDURLUGU");
                
                System.out.println("\n    ZAFERTEPE KALKISI");
                for(int i=0 ; i<list1.size() ; i++){
                    System.out.println("        "+list1.get(i));
                }
                
                System.out.println("\n   B.EVLER KALKISI");
                for(int j=0 ; j<list2.size() ; j++){
                    System.out.println("        "+list2.get(j));
                }
            break;  
        }
    }
}
