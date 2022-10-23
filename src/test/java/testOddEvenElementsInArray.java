import org.testng.Assert;
import org.testng.annotations.Test;

public class testOddEvenElementsInArray {

    @Test
    public void toEvenNumber() {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[][] expectedResult = {{1,3,5,7,9},{2,4,6,8}};
        int[][] actualResult = new OddEvenElementsInArray().createOddEvenArray(a);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
