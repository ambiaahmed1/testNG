package annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AfterClassExample {

    @Test
    public void testMethodThree() {
        System.out.println("I am inside a test method three");
    }

    @AfterClass //Runs once after the current class starts
    public void myAfterClassMethod() {
        System.out.println("I am inside my after class method");
    }

    @BeforeClass //Runs once before the current class starts
    public void myBeforeClass() {
        System.out.println("I am inside my before class method");
    }

    @BeforeMethod //Runs once before every method
    public void myBeforeMethod() {
        System.out.println("I am inside my before method");
    }

    @Test
    public void testMethod() {
        System.out.println("I am inside a test method");
    }

    @Test
    public void testMethodTwo() {
        System.out.println("I am inside a test method two");
    }
}
