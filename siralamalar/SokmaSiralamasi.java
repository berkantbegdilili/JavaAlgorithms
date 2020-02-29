package bb_projects.siralamalar;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 * @see SiralamaAlgoritmasi
 */
public class SokmaSiralamasi implements SiralamaAlgoritmasi{
    
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
            while (j >= 0 && Sirala.less(card, arr[j])) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = card;
        }
        return arr;
    }
    
    //Ornek program
    public static void main(String[] args) {
        SokmaSiralamasi sokmaSiralamasi = new SokmaSiralamasi();
        
        //Bir dizi olusturuldu ve rastgele sayilar atandi
        Integer[] intArr = new Integer[10];  
        for(int i=0 ; i<intArr.length ; i++){
            intArr[i] = (int) (Math.random()*15+1); // 1-15 arasinda rastgele sayilar atar
        }
        
        //Dizi siralandi
        Integer[] sortedIntArr = sokmaSiralamasi.sort(intArr);
        
        //Dizi yazdirildi
        Sirala.print(sortedIntArr);
        
        //Bir dizi olusturuldu ve yazilanlar atandi
        String[] stringArr = {"b", "e", "r", "k", "a", "n", "t"};
        
        //Dizi siralandi
        String[] sortedStringArr = sokmaSiralamasi.sort(stringArr);
        
        //Dizi yazdirildi
        Sirala.print(sortedStringArr);
    }
    
}
