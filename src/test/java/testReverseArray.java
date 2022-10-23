import org.testng.Assert;
import org.testng.annotations.Test;

public class testReverseArray {
    @Test
    public void reverseArrayHappyPath() {
        int[] a = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};
        int[] actualResult = new ReverseArray().reverseArray(a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void reverseArrayOneElement() {
        int[] a = {5};
        int[] expectedResult = {5};
        int[] actualResult = new ReverseArray().reverseArray(a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void reverseArrayEmpty() {
        int[] a = {};
        int[] expectedResult = {};
        int[] actualResult = new ReverseArray().reverseArray(a);
        Assert.assertEquals(actualResult, expectedResult);
    }
}

