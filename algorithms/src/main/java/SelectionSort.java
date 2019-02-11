public class SelectionSort {

    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentIndex = i;
            for (int j = currentIndex + 1; j < array.length; j++) {
                if (array[j] < array[currentIndex]) {
                    currentIndex = j;
                }
            }
            int tempValue = array[currentIndex];
            array[currentIndex] = array[i];
            array[i] = tempValue;
        }
        return array;
    }
}
