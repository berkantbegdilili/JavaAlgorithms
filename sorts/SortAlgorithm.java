package bb_projects.sorts;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public interface SortAlgorithm {

    /**
     * Dizileri siralama algoritmasinin ana methodu
     * 
     * @param unsorted Siralanmamis bir dizi
     * @return Siralanmis bir dizi
     */
    <T extends Comparable<T>> T[] sort(T[] unsorted);

    
    /**
     * JCF listelerini siralama algoritmasinin methodu
     * 
     * @param unsorted Siralanmamis bir liste
     * @return Siralanmis bir liste
     */
    @SuppressWarnings("unchecked")
    default <T extends Comparable<T>> List<T> sort(List<T> unsorted) {
        return Arrays.asList(sort(unsorted.toArray((T[]) new Comparable[unsorted.size()])));
    }

}
