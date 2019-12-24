package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertTrue;

public class SoftAssertExample {

    @Test
    public void myTest() {
        SoftAssert softAssert = new SoftAssert();
        //assertTrue(checkBigger(5, 10));
        softAssert.assertTrue(checkBigger(5,10));
        System.out.println("End of my Test"); // fails during hard asserts
        softAssert.assertAll();
    }

    @Test
    public void myTestThree() {
        try {
            assertTrue(checkBigger(5, 10));
        } catch (Throwable t) {
            System.out.println("End of my Test"); // fails during hard asserts
        }
    }


    @Test
    public void myTestTwo() {
        assertTrue(checkBigger(10, 5));
    }

    public boolean checkBigger(int x, int y) {

        boolean result;
        if (x > y) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

