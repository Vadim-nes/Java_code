import org.testng.Assert;
import org.testng.annotations.Test;

public class testOddIndexes {
//    Test Data:
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}
    @Test
    public void toFindOddIndexes (){
        int[] a = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};
        int[] actualResult = new OddIndexes().oddIndexes(a);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
