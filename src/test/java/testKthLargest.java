import org.testng.Assert;
import org.testng.annotations.Test;

public class testKthLargest {

    @Test
    public void toTestHappyPath() {
        int[] a = {4, 3, 7, 13, 5, 2, 9, 4, 12}; //→ 9
        int k = 3;
        String expectedResult = "9";
        String actualResult = new KthLargest().kthLargest(a,k);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
