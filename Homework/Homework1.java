package bb_projects.Homework;
import java.util.Arrays;

/**
 *
 * @author berkantbegdilili
 */
public class Homework1 {
    public static void main(String[] args) {
        String[][] car = new String[3][3];
        
        System.out.println("---------- BB Car Showroom ----------");
        for(int i=0 ; i<3 ; i++){
            car[0][i] = "A Model, ";
            car[1][i] = "B Model, ";
            car[2][i] = "C Model, ";
        }
        
        for(int j=0 ; j<3 ; j++){
            car[j][0] += "Sedan Type,    ";
            car[j][1] += "Hatcback Type, ";
            car[j][2] += "Station Type,  ";
            
            car[j][0] += "Blue Color,    ";
            car[j][1] += "Red Color,     ";
            car[j][2] += "White Color,   ";
        }
        
        for(int a=0 ; a<3 ; a++){
            for(int b=0 ; b<3 ; b++){
                car[a][b] += (int)(Math.random()*10); 
                System.out.println(car[a][b]);
            }
        }
        
        System.out.println("--- CARS WITH THE HIGHEST NUMBER ---");
        sort(car);
        
    }
    
    public static void sort (String[][] s){
        String[] temp = new String[s.length*s[0].length];
        String temp1 = "";
        
        for(int i=0 ; i<s.length ; i++){
            for(int j=0 ; j<s[i].length ; j++){
                temp1 += s[i][j].substring(38) + "";
                temp = temp1.split(" ");
                Arrays.sort(temp);
                
                
            }
        }
        for(int i=0 ; i<s.length ; i++){
            for(int j=0 ; j<s[0].length ; j++){
                if(s[i][j].substring(38).trim().equals(temp[temp.length-1]))
                    System.out.println(s[i][j]);
            }
        }
        
    }
}
