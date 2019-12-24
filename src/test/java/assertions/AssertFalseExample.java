package assertions;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class AssertFalseExample {

    @Test
    public void myTest() {
        assertFalse(checkBigger(1, 5));
    }

    @Test
    public void myTestWithMessage() {
        assertFalse(checkBigger(1, 5), "First number is smaller than second number");
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
