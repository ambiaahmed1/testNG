package assertions;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AssertTrueExample {

    @Test
    public void myTest() {
        assertEquals(checkBigger(5, 1), true);
    }

    @Test
    public void myTestWithInteger() {
        assertEquals(multiply(5, 1), 5);
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public String message(String message) {
        return message;
    }

    @Test
    public void myTestWithStringMessage() {
        assertEquals(message("Test"), "Test", "String matches");
    }

    @Test
    public void myTestWithStringNoMessage() {
        assertEquals(message("Test"), "Test");
    }

    @Test
    public void myTestWithMessage() {
        assertEquals(checkBigger(5, 1), true, "First number is smaller than second number");
    }

    @Test
    public void myTestWithIntegerWithMessage() {
        assertEquals(multiply(5, 1), 5, "Incorrectly multiplied");
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

