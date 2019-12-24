package annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AfterMethodExample {

    @BeforeClass //Runs once before the current class starts
    public void myBeforeClassMethod() {
        System.out.println("I am inside my before class method");
    }

    @BeforeMethod //Runs once before every method
    public void myBeforeMethod() {
        System.out.println("I am inside my before method");
    }

    @AfterMethod //Runs once after every method
    public void myAfterMethod() {
        System.out.println("I am inside my after method");
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
