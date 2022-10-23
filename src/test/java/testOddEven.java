import org.testng.Assert;
import org.testng.annotations.Test;

public class testOddEven {
    @Test
//            -345 →  “Odd”
//            0 →  “Even”
//            222222 →  “Even”
//  1. if (a % 2 != 0)
    public void toEvenNumberZero() {
        int a = 0;
        String actualResult = new OddEven().oddEven(a);
        String expectedResult = "Even";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void toEvenNumber() {
        int a = 222222;
        String actualResult = new OddEven().oddEven(a);
        String expectedResult = "Even";
        Assert.assertEquals(actualResult,expectedResult);
    }

//  2.   else if (a % 2 == 0)
    @Test
    public void toOddNumber() {
    int a = 345;
    String actualResult = new OddEven().oddEven(a);
    String expectedResult = "Odd";
    Assert.assertEquals(actualResult,expectedResult);
}

}
