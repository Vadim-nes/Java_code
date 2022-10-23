import org.testng.Assert;
import org.testng.annotations.Test;

public class testIntersection {
    @Test
    public void intersectionTest(){
        int[] a = {1, 2, 4, 5, 89};
        int[] b = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};
        int[] actualResult = new Intersection().intersection(a,b);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void intersectionTestWithNegativeElements(){
        int[] a = {1, 2, 4, 5, 8, 9};
        int[] b = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};
        int[] actualResult = new Intersection().intersection(a,b);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void intersectionTestNoIntersections(){
        int[] a = {1, 2, 4, 5, 89};
        int[] b = {8, 9, 45};
        int[] expectedResult = {};
        int[] actualResult = new Intersection().intersection(a,b);
        Assert.assertEquals(actualResult,expectedResult);
    }

}

