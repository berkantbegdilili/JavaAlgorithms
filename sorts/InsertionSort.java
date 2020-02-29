package bb_projects.sorts;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 * @see SortAlgorithm
 * @see Sort
 */
public class InsertionSort implements SortAlgorithm{
    
    /**
     * Bu method, Genel Sokma Siralamasini uygular
     * 
     * @param arr Siralanacak dizi
     * @return Siralanmis dizi
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] arr) {
        for (int i=1 ; i<arr.length ; i++) {

            T card = arr[i];
            int j = i - 1;
            
            //Kucuk degeri sola kaydirma
            while (j >= 0 && Sort.less(card, arr[j])) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = card;
        }
        return arr;
    }
    
    //Ornek program
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        
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
