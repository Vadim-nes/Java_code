import org.testng.Assert;
import org.testng.annotations.Test;

public class testMinMaxAve {
    @Test
    public void toFindMaxMinAveTwoGreaterThanOne() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int one = 2;
        int two = 6;
        int[] expectedResult = {3, 7, 5};
        int[] actualResult = new MinMaxAve().minMaxAve(a, one, two);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void toFindMaxMinAveOneGreaterThanTwo() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int one = 8;
        int two = 3;
        int[] expectedResult = {4, 9, 6};
        int[] actualResult = new MinMaxAve().minMaxAve(a, one, two);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void toFindMaxMinAveOneEqualsTwo() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int one = 4;
        int two = 4;
        int[] expectedResult = {5, 5, 5};
        int[] actualResult = new MinMaxAve().minMaxAve(a, one, two);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void toFindMaxMinAveOneNegative() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int one = -1;
        int two = 4;
        int[] expectedResult = {};
        int[] actualResult = new MinMaxAve().minMaxAve(a, one, two);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void toFindMaxMinAveTwoNegative() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int one = 4;
        int two = -1;
        int[] expectedResult = {};
        int[] actualResult = new MinMaxAve().minMaxAve(a, one, two);
        Assert.assertEquals(actualResult, expectedResult);
    }
}


