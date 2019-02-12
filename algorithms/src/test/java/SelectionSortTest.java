import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SelectionSortTest {

    @Test
    public void sort() {
        SelectionSort selectionSort = new SelectionSort();
        int[] testArray = {1, 5, 4, 4};
        int[] resultArray = selectionSort.sort(testArray);
        int[] expectArray = {1, 4, 4, 5};
        assertThat(resultArray, is(expectArray));

        int[] testArray2 = {1, 4, -5, 4};
        int[] resultArray2 = selectionSort.sort(testArray2);
        int[] expectArray2 = {-5, 1, 4, 4};
        assertThat(resultArray2, is(expectArray2));
    }
}