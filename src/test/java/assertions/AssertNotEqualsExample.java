package assertions;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

public class AssertNotEqualsExample {

    @Test
    public void myTest() {
        assertNotEquals(checkBigger(5, 9), true);
    }

    @Test
    public void myTestWithInteger() {
        assertNotEquals(multiply(5, 9), 5);
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public String message(String message) {
        return message;
    }

    @Test
    public void myTestWithStringMessage() {
        assertNotEquals(message("Test"), "Test123", "String matches");
    }

    @Test
    public void myTestWithStringNoMessage() {
        assertNotEquals(message("Test"), "Test123");
    }

    @Test
    public void myTestWithMessage() {
        assertNotEquals(checkBigger(5, 9), true, "First number is smaller than second number");
    }

    @Test
    public void myTestWithIntegerWithMessage() {
        assertNotEquals(multiply(5, 1), 9, "Incorrectly multiplied");
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
