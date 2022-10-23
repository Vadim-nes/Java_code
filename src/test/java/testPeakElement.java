import org.testng.Assert;
import org.testng.annotations.Test;

public class testPeakElement {
    @Test
    public void peakElementTestHappyPath() {
        int[] a = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};
        int[] actualResult = new PeakElement().peakElement(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void peakElementTwoElements() {
        int[] a = {3, 7};
        int[] expectedResult = {7};
        int[] actualResult = new PeakElement().peakElement(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void peakElementOneElements() {
        int[] a = {3};
        int[] expectedResult = {3};
        int[] actualResult = new PeakElement().peakElement(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

}
