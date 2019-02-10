import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void sort() {
        int[] testArray = {1, 4, 5, 4};
        SelectionSort selectionSort = new SelectionSort();
        int[] resultArray = selectionSort.sort(testArray);
        int[] expectArray = {5, 4, 4, 1};
        assertThat(resultArray, is(expectArray));
    }
}