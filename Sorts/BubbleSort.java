package bb_projects.Sorts;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 * @see SortAlgorithm
 * @see Sort
 */
public class BubbleSort implements SortAlgorithm{
    
    /**
     * Bu method, Genel Kabarcik Siralamasini uygular
     * 
     * @param arr Siralanacak dizi
     * @return Siralanmis dizi
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] arr){
       for(int i=0 ; i<arr.length ; i++){
           boolean swapped = false;
           for(int j=arr.length-1 ; j>i ; j--){
               if(Sort.less(arr[j], arr[j-1])){
                   Sort.swap(arr, j-1, j);
                   swapped = true;
               }
           }
           //Dizide herhangi bir degistirme islemi yapilmamissa donguden cikma kontrolu
           if(!swapped){
               break;
           }
       } 
       return arr;
    }
    
    //Ornek program
    public static void main(String[] args) {
        //Nesne olusturuldu
        BubbleSort sort = new BubbleSort();
        
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
