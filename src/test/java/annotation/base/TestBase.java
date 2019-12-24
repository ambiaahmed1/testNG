package annotation.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    @BeforeSuite
    public void myBeforeSuite() {
        System.out.println("Starting Selenium drivers");
    }

    @AfterSuite
    public void myAfterSuite() {
        System.out.println("Stopping Selenium drivers");
    }
}
