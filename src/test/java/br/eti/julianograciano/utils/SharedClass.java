package br.eti.julianograciano.utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedClass {

    private static boolean startBrowser = false;

    private WebDriver driver;
    public String title = "";

    @Before()
    public void init() throws Exception {
        if (!startBrowser) {
            // Optional, if not specified, WebDriver will search your path for chromedriver.
            System.setProperty("webdriver.chrome.driver", "F:\\selenium\\drivers\\chromedriver.exe");

            driver = new ChromeDriver();
            driver.get("about:blank");

            //To stop launching browser after every scenario, assign below variable with true value
            startBrowser = false;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    @After()
    public void cleanUp() {
        driver.close();
        driver.quit();
    }
}