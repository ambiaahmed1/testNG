package assertions;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertNull;

public class AssertNotNullExample {

    String str1 = null;
    String str2 = "abc";

    @Test
    public void myTestNull() {
        assertNull(str1);
    }

    @Test
    public void myTestNullWithMessage() {
        assertNull(str1, "The string is null");
    }

    @Test
    public void myTestNullFailed() {
        assertNotNull(str2);
    }

    @Test
    public void myTestNullWithFailedMessage() {
        assertNotNull(str2, "The string is not null");
    }
}
