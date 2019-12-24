package otherFeatures;

import org.testng.annotations.Test;

public class DisableTestExample {

    @Test(enabled = false)
    public void myTestOne() {
        System.out.println("My Test One");
    }

    @Test
    public void myTestTwo() {
        System.out.println("My Test Two");
    }
}
