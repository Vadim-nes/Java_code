import org.testng.Assert;
import org.testng.annotations.Test;

public class testSortArray {

    @Test
    public void sortArrayTestHappyPath() {
        int[] a = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};
        int[] actualResult = new SortArray().sortArray(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void sortArrayTestAllIntMin() {
        int[] a = {Integer.MIN_VALUE};
        int[] expectedResult = {Integer.MIN_VALUE};
        int[] actualResult = new SortArray().sortArray(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void sortArrayTestEmptyMassive() {
        int[] a = {};
        int[] expectedResult = {};
        int[] actualResult = new SortArray().sortArray(a);
        Assert.assertEquals(actualResult,expectedResult);
    }


}
