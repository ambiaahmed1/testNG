package otherFeatures;

import org.testng.annotations.Test;

public class TimeoutTestExample {
    @Test(timeOut = 10000)
    public void myTestOne() {
        System.out.println("My Test One");
        int counter = 0;
        for(;;){ // infinite loop
            System.out.println(counter++);
        }
    }

    @Test(timeOut = 10000)
    public void timeOutTwo() throws InterruptedException {
        System.out.println("Running test 1");
        Thread.sleep(40000);
        System.out.println("Ending test 1");
    }

    @Test
    public void myTestTwo() {
        System.out.println("My Test Two");
    }
}
