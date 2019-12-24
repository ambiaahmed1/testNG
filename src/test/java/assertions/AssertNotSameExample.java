package assertions;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertNotSame;

public class AssertNotSameExample {


    String str1 = "abc123";
    String str2 = "abc";

    @Test
    public void myTestAssertSame() {
        assertNotSame(str1, str2);
    }

    @Test
    public void myTestAssertSameWithMessage() {
        assertNotSame("The string references are the same", str1, str2);
    }
}
