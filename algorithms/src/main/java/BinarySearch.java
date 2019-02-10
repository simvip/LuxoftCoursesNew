public class BinarySearch {
    public int findValue(int value, int[] array,int startIndex, int endIndex ){
        while (true){
            int middleIndex = (startIndex + endIndex)/2;
            if (value<array[middleIndex])
                endIndex = middleIndex - 1;
            else if (value>array[middleIndex])
                startIndex = middleIndex + 1;
            else
                return middleIndex;
            if (startIndex > endIndex)
                return -1;
        }
    }
}
