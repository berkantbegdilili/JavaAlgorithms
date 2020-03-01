package bb_projects.Calculator;

/**
 * Cikarma Islemini Yapan Sinif
 * 
 * @author berkant.begdilili@ogr.dpu.edu.tr
 * @see Kontrol
 */
public class Cikarma extends Kontrol{
    
    public Cikarma(String[] arr){
        this.arr = arr;
        control(this.arr);
    }

    @Override
    public String toString() {
        return String.valueOf(result(this.arr));
    }

    @Override
    double result(String[] arr) {
        double result = Double.parseDouble(arr[0]);
        
        for(int i=1 ; i<arr.length ; i++){
            result -= Double.parseDouble(arr[i]);
        }  
        return result;
    } 
}
