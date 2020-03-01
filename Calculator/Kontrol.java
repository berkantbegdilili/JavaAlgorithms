package bb_projects.Calculator;

/**
 * Islemlerin Yapilabilmesi Icın Gerekli Soyut Sinif
 * 
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public abstract class Kontrol{
    String[] arr;
    
    abstract double result(String[] arr);
    
    /**
     * Bu method, gerekli kontrolleri ve islemleri yapar
     * 
     * @param arr Kontrol yapilacak dizi
     */
    void control(String[] arr){
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i].contains("cos")){
                double value = Double.parseDouble(arr[i].substring(3));
                this.arr[i] = String.valueOf(Math.cos(value));
            }else if(arr[i].contains("sin")){
                double value = Double.parseDouble(arr[i].substring(3));
                this.arr[i] = String.valueOf(Math.sin(value));
            }else if(arr[i].contains("tan")){
                double value = Double.parseDouble(arr[i].substring(3));
                this.arr[i] = String.valueOf(Math.tan(value));
            }else if(arr[i].contains("cot")){
                double value = Double.parseDouble(arr[i].substring(3));
                this.arr[i] = String.valueOf(1/Math.tan(value));
            }else if(arr[i].contains("arccos")){
                double value = Double.parseDouble(arr[i].substring(6));
                this.arr[i] = String.valueOf(Math.acos(value));
            }else if(arr[i].contains("arcsin")){
                double value = Double.parseDouble(arr[i].substring(6));
                this.arr[i] = String.valueOf(Math.asin(value));
            }else if(arr[i].contains("arctan")){
                double value = Double.parseDouble(arr[i].substring(6));
                this.arr[i] = String.valueOf(Math.atan(value));
            }else if(arr[i].contains("arccot")){
                double value = Double.parseDouble(arr[i].substring(6));
                this.arr[i] = String.valueOf(1/Math.atan(value));   
            }else if(arr[i].contains("log")){
                double value = Double.parseDouble(arr[i].substring(3));
                this.arr[i] = String.valueOf(Math.log10(value));
            }
        }
    }
}
