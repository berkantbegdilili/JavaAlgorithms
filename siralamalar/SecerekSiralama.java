package bb_projects.siralamalar;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 * @see SiralamaAlgoritmasi
 */
public class SecerekSiralama implements SiralamaAlgoritmasi{
    
    /**
     * Bu method, Genel Secerek Siralamayi uygular
     * 
     * @param arr Siralanacak dizi
     * @return Siralanmis dizi
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] arr) {
       int n = arr.length;
       for(int i=0 ; i<n-1 ; i++){
           int min = i;
           
           for(int j=i+1 ; j<n ; j++){
               if(Siralama.less(arr[j], arr[min])){
                   min = j;
               }
           }
           
           if(min != i){
               Siralama.swap(arr, i, min);
           }
       }
       return arr;
    }
   
    public static void main(String[] args) {
        //Nesne olusturuldu
        SecerekSiralama secerekSiralama = new SecerekSiralama();
        
        //Bir dizi olusturuldu ve rastgele sayilar atandi
        Integer[] intArr = new Integer[10];  
        for(int i=0 ; i<intArr.length ; i++){
            intArr[i] = (int) (Math.random()*15+1); // 1-15 arasinda rastgele sayilar atar
        }
        
        //Dizi siralandi
        Integer[] sortedIntArr = secerekSiralama.sort(intArr);
        
        //Dizi yazdirildi
        Siralama.print(sortedIntArr);
        
        //Bir dizi olusturuldu ve yazilanlar atandi
        String[] stringArr = {"b", "d", "a", "y", "z", "c"};
        
        //Dizi siralandi
        String[] sortedStringArr = secerekSiralama.sort(stringArr);
        
        //Dizi yazdirildi
        Siralama.print(sortedStringArr);
        
    }
}
