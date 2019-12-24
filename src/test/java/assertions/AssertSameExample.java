package assertions;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertSame;

public class AssertSameExample {


    String str1 = "abc123";
    String str2 = "abc";

    @Test
    public void myTestAssertSame() {
        assertSame(str1, str1);
    }

    @Test
    public void myTestAssertSameWithMessage() {
        assertSame("The string references are the same", str1, str1);
    }

}
