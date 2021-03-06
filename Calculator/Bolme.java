package bb_projects.Calculator;

/**
 * Bolme Islemini Yapan Sinif
 * 
 * @author berkant.begdilili@ogr.dpu.edu.tr
 * @see Kontrol
 */
public class Bolme extends Kontrol{
    
    public Bolme(String[] arr){
        this.arr = arr;
        control(this.arr);
    }

    @Override
    public String toString() {
        for(int i=0 ; i<arr.length ; i++){
            if(Double.parseDouble(arr[i]) == 0){
                return "Bir sayiyi 0'a bolemezsin!";
            }
        }
        return String.valueOf(result(this.arr));
        }

    @Override
    double result(String[] arr) {
        double result = Double.parseDouble(arr[0]);
        
        for(int i=1 ; i<arr.length ; i++){
                result /= Double.parseDouble(arr[i]);
            }
        return result;
    } 
}
