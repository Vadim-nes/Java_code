import org.testng.Assert;
import org.testng.annotations.Test;

public class testIntegerM {


//    } else if (m % 11 == 0) {
//        return "Poor number";
//    }
//        return "-1";
//}
//}

//    if (m % 7 == 0 && m % 9 == 0)
    @Test
    public void testNumberMultiple7and9 () {
        int m = 63;
        String expectedResult = "Good Number";
        String actualResult = new IntegerM().integerM(m);
        Assert.assertEquals(actualResult,expectedResult);
    }

//    else if (m % 9 == 0 && m % 7 != 0)
    @Test
    public void testNumberMultiple9not7 () {
        int m = 9;
        String expectedResult = "Bad Number";
        String actualResult = new IntegerM().integerM(m);
        Assert.assertEquals(actualResult,expectedResult);
    }

//    else if (m % 11 == 0)
    @Test
    public void testNumberMultiple11only () {
        int m = 121;
        String expectedResult = "Poor number";
        String actualResult = new IntegerM().integerM(m);
        Assert.assertEquals(actualResult,expectedResult);
}

    //    else if (m % 11 == 0)
    @Test
    public void testNumberOtherRes () {
        int m = 23;
        String expectedResult = "-1";
        String actualResult = new IntegerM().integerM(m);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
