package demo;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SystemTest {

    protected WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager manager = WebDriverManager.firefoxdriver();
        if (driver == null)
            driver = manager.create();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
