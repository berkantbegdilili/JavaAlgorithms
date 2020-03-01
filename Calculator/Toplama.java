package bb_projects.Calculator;

/**
 * Toplama Islemini Yapan Sinif
 * 
 * @author berkant.begdilili@ogr.dpu.edu.tr
 * @see Kontrol
 */
public class Toplama extends Kontrol{

    public Toplama(String[] arr) {
        this.arr = arr;
        control(this.arr);
    }

    @Override
     double result(String[] arr){
        double result = 0;
        
        for(int i=0 ; i<arr.length ; i++){
            result += Double.parseDouble(arr[i]);
        }
        
        return result;
    }
     
    @Override
    public String toString() {
        return String.valueOf(result(this.arr));
    }
}
