public class BubbleSort {
     public int[] sort(int[] array) {
        boolean doAgain = true;
        int aLenght = array.length - 1;
        int temp;
        while (doAgain) {
            doAgain = false;
            for (int i = 0; i < aLenght; i++) {
                temp = array[i];
                if (temp > array[i + 1]) {
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    doAgain = true;
                    if (aLenght == i + 1) {
                        aLenght--;
                    }
                }
            }
        }
        return array;
    }
}
