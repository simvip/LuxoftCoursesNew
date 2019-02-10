import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BubbleSortTest {

    @Test
    public void sort() {
        int[] testArray = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        BubbleSort bubbleSort = new BubbleSort();
        int[] resultArray = bubbleSort.sort(testArray);
        int[] expectArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(resultArray, is(expectArray));
    }
}