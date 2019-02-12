public class BinarySearch {

    public int find(int value, int[] array) {
        return findValue(value, array, 0, array.length);
    }

    private int findValue(int value, int[] array, int startIndex, int endIndex) {
        while (true) {
            int middleIndex = (startIndex + endIndex) / 2;
            if (value < array[middleIndex])
                endIndex = middleIndex - 1;
            else if (value > array[middleIndex])
                startIndex = middleIndex + 1;
            else
                return middleIndex;
            if (startIndex > endIndex)
                return -1;
        }
    }
}
