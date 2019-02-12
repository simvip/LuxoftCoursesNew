import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BinarySearchTest {

    @Test
    public void findValue() {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.find(7, testArray);

        assertThat(result, is(6));

        result = binarySearch.find(-1, testArray);
        assertThat(result, is(-1));
    }


}