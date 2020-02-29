package bb_projects.siralamalar;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
final public class Sirala {
    
    /**
     * Bu method, dizideki yerleri degistirmek icin kullanilir
     * 
     * @param <T> Listenin Tipi
     * @param arr Degistirmek istedigimiz dizi
     * @param firstElement Ilk elemanin indeksi
     * @param secondElement Ikinci elamanin indeksi
     */
    static <T> boolean swap(T[] arr,int firstElement,int secondElement){
        T temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;
        return true;
    }
    
    /**
     * Bu method, ilk elemanin diger elemandan daha az olup olmadigini kontrol eder
     * 
     * @param firstElement Ilk eleman
     * @param secondElement Ikinci eleman
     * @return Birinci eleman,ikinci elemandan kucukse dogru dondurur
     */
    static <T extends Comparable<T>> boolean less(T firstElement,T secondElement){
        return firstElement.compareTo(secondElement) < 0;
    }
    
    /**
     * Listeyi yazdirir
     * DIKKAT: Bu methodta Lambda Expressions kullanilmistir
     * 
     * @param toPrint Yazdirilmasi gereken liste
     */
    static void print(List<?> toPrint){
        toPrint.stream()
                .map(Object::toString)
                .map(str -> str +" ")
                .forEach(System.out::print);
        
        System.out.println();
    }
    
    /**
     * Diziyi yazdirir
     * 
     * @param toPrint Yazdirilmasi gereken dizi 
     */
    static void print(Object[] toPrint){
        System.out.println(Arrays.toString(toPrint));
    }
    
    /**
     * Dizi icin tum konumlari soldan saga degistirir
     * 
     * @param arr Dizi
     * @param left Dizinin sola tasinacak siniri
     * @param right Dizinin saga tasinacak siniri
     */
    static <T extends Comparable<T>> void flip(T[] arr, int left, int right){
        while(left <= right){
            swap(arr, left++, right--);
        }
    }
}
