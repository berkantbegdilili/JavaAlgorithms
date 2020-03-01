package bb_projects.Calculator;

/**
 * Carpma Islemini Yapan Sinif
 * 
 * @author berkant.begdilili@ogr.dpu.edu.tr
 * @see Kontrol
 */
public class Carpma extends Kontrol{
    
    public Carpma(String[] arr){
        this.arr = arr;
        control(this.arr);
    }

    @Override
    public String toString() {
        return String.valueOf(result(this.arr));
    }

    @Override
    double result(String[] arr) {
        double result = 1;
        
        for(int i=0 ; i<arr.length ; i++){
            result *= Double.parseDouble(arr[i]);
        }      
        return result;
    }
}
