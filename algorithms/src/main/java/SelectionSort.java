import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

     public int[] sort(int[] array) {
        int arrayResult[] = new int[array.length];
        List processedIndex = new ArrayList<Integer>();
        boolean firstOperation;
        int indexMaxValue = 0;
        int maxValue = 0;
        while (processedIndex.size()!=arrayResult.length){
            firstOperation = true;
           for (int i = 0; i < array.length; i++) {
               if (processedIndex.contains(i)){
                   continue;
               }
               if (firstOperation){
                   indexMaxValue = i;
                   maxValue = array[i];
                   firstOperation = false;
               } else {
                   if (array[i]>= maxValue){
                       maxValue = array[i];
                       indexMaxValue = i;
                   }
               }
           }
            processedIndex.add(indexMaxValue);
            arrayResult[processedIndex.size()-1] = array[indexMaxValue];
        }
        return arrayResult;
    }
}
