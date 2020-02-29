package bb_projects.sorts;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 * @see SortAlgorithm
 * @see Sort
 */
public class SelectionSort implements SortAlgorithm{
    
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
               if(Sort.less(arr[j], arr[min])){
                   min = j;
               }
           }
           
           if(min != i){
               Sort.swap(arr, i, min);
           }
       }
       return arr;
    }
   
    //Ornek program
    public static void main(String[] args) {
        //Nesne olusturuldu
        SelectionSort sort = new SelectionSort();
        
        //Bir dizi olusturuldu ve rastgele sayilar atandi
        Integer[] intArr = new Integer[10];  
        for(int i=0 ; i<intArr.length ; i++){
            intArr[i] = (int) (Math.random()*15+1); // 1-15 arasinda rastgele sayilar atar
        }
        
        //Dizi siralandi
        Integer[] sortedIntArr = sort.sort(intArr);
        
        //Dizi yazdirildi
        Sort.print(sortedIntArr);
        
        //Bir dizi olusturuldu ve yazilanlar atandi
        String[] stringArr = {"b", "e", "r", "k", "a", "n", "t"};
        
        //Dizi siralandi
        String[] sortedStringArr = sort.sort(stringArr);
        
        //Dizi yazdirildi
        Sort.print(sortedStringArr);
        
    }
}
