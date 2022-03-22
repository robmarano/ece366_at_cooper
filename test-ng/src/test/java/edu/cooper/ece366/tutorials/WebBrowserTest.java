package edu.cooper.ece366.tutorials;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebBrowserTest
{
    private WebDriver driver;
    String appURL = "http://google.com";

    @BeforeClass
    public void testSetUp() {
        System.out.println("Setting up WebBrowserTest");
//        driver = new FirefoxDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200",
                "--ignore-certificate-errors","--disable-extensions","--no-sandbox",
                "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        // Deleting all the cookies
        driver.manage().deleteAllCookies();

        // Specifiying pageLoadTimeout and Implicit wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("WebBrowserTest setup complete.");
    }

    @Test
    public void verifyGooglePageTitle() {
        System.out.println("Running WebBrowserTest.verifyGooglePageTitle()");
        driver.navigate().to(appURL);
        String getTitle = driver.getTitle();
        Assert.assertEquals(getTitle, "Google");
        System.out.println("Finished WebBrowserTest.verifyGooglePageTitle()");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Completing WebBrowserTest");
        driver.quit();
        System.out.println("Exiting WebBrowserTest");
    }
}
