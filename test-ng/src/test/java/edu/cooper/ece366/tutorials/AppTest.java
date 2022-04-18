package edu.cooper.ece366.tutorials;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static final int APP_FIELD_TEST = 6;
    public static final int APP_FIELD_TEST_SET = 2;
    private App app;

    @BeforeClass
    public void testSetUp() {
        System.out.println("Setting up AppTest");
        this.app = new App(APP_FIELD_TEST);
        System.out.println("AppTest setup complete.");
    }

    @Test
    public void verifyAppConstructor() {
        System.out.println("Running AppTest.verifyAppConstructor()");
        Assert.assertEquals(app.getAppField(),APP_FIELD_TEST);
        System.out.println("Finished AppTest.verifyAppConstructor()");
    }

    @Test
    public void verifySetAppField() {
        System.out.println("Running AppTest.verifySetAppField()");
        app.setAppField(APP_FIELD_TEST_SET);
        Assert.assertEquals(app.getAppField(),APP_FIELD_TEST_SET);
        System.out.println("Finished AppTest.verifySetAppField()");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Completing AppTest");
        this.app = (App) null;
        System.out.println("Exiting AppTest");
    }
}
