import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BinarySearchTest {

    @Test
    public void findValue() {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.findValue(7,testArray,0,testArray.length-1);

        assertThat(result, is(6));
    }


}