package com.example.UiTesting;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class TimeTest {
    public static WebDriver driver;
    public static LocalStorage local;

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Before
    public void loadConfig() {
        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();
        this.driver = driver;

        this.local = ((WebStorage) driver).getLocalStorage();

        // An implicit wait is to tell WebDriver to poll the DOM for a certain amount of time
        // when trying to find an element or elements if they are not immediately available.
        // The default setting is 0. Once set, the implicit wait is set for the life of the WebDriver object instance.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Maximize the browser window to fit into screen
        driver.manage().window().maximize();

        // Visit Google
        driver.get("http://localhost:8080/#/");


        // Find the text input element by its name
        WebElement configTab = driver.findElement(By.xpath("//*[text() = 'Config']"));
        configTab.click();

    }

    @org.junit.Test
    public void timeCheckHoursStart() throws InterruptedException {
        Thread.sleep(500);
        WebElement monday = driver.findElement(By.xpath("//div[2]/div/div/div/div/a[2]/div/div"));
        monday.click();
        Thread.sleep(500);
        WebElement hoursStart = driver.findElement(By.name("hoursStart"));
        hoursStart.click();
        hoursStart.sendKeys("25");
        String[] errors = new String[4];
        errors[0] = (driver.findElement(By.name("hoursStartError")).getText());
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys("-1");
        errors[1] = (driver.findElement(By.name("hoursStartError")).getText());
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys("aasdf");
        errors[2] = (driver.findElement(By.name("hoursStartError")).getText());
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys("12");
        String[] errorsShouldBe = new String[4];
        for(int i = 0; i < 3; i++) {
            errorsShouldBe[i] = "Please input hours from 0 to 23";
        }
        assertArrayEquals(errorsShouldBe, errors);
    }

    @org.junit.Test
    public void timeCheckHoursEnd() throws InterruptedException {
        Thread.sleep(500);
        WebElement monday = driver.findElement(By.xpath("//div[2]/div/div/div/div/a[2]/div/div"));
        monday.click();
        Thread.sleep(500);
        WebElement hoursStart = driver.findElement(By.name("hoursEnd"));
        hoursStart.click();
        hoursStart.sendKeys("25");
        String[] errors = new String[4];
        errors[0] = (driver.findElement(By.name("hoursEndError")).getText());
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys("-1");
        errors[1] = (driver.findElement(By.name("hoursEndError")).getText());
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys("aasdf");
        errors[2] = (driver.findElement(By.name("hoursEndError")).getText());
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys("12");
        String[] errorsShouldBe = new String[4];
        for(int i = 0; i < 3; i++) {
            errorsShouldBe[i] = "Please input hours from 0 to 23";
        }
        assertArrayEquals(errorsShouldBe, errors);
    }
    @org.junit.Test
    public void timeCheckMinutesStart() throws InterruptedException {
        Thread.sleep(500);
        WebElement monday = driver.findElement(By.xpath("//div[2]/div/div/div/div/a[2]/div/div"));
        monday.click();
        Thread.sleep(500);
        WebElement hoursStart = driver.findElement(By.name("minutesStart"));
        hoursStart.click();
        hoursStart.sendKeys("99");
        String[] errors = new String[4];
        errors[0] = (driver.findElement(By.name("minutesStartError")).getText());
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys("-1");
        errors[1] = (driver.findElement(By.name("minutesStartError")).getText());
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys("aasdf");
        errors[2] = (driver.findElement(By.name("minutesStartError")).getText());
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys("12");
        String[] errorsShouldBe = new String[4];
        for(int i = 0; i < 3; i++) {
            errorsShouldBe[i] = "Please input minutes from 0 to 59";
        }
        assertArrayEquals(errorsShouldBe, errors);
    }

    @org.junit.Test
    public void timeCheckMinutesEnd() throws InterruptedException {
        Thread.sleep(500);
        WebElement monday = driver.findElement(By.xpath("//div[2]/div/div/div/div/a[2]/div/div"));
        monday.click();
        Thread.sleep(500);
        WebElement hoursStart = driver.findElement(By.name("minutesEnd"));
        hoursStart.click();
        hoursStart.sendKeys("99");
        String[] errors = new String[4];
        errors[0] = (driver.findElement(By.name("minutesEndError")).getText());
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys("-1");
        errors[1] = (driver.findElement(By.name("minutesEndError")).getText());
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys("aasdf");
        errors[2] = (driver.findElement(By.name("minutesEndError")).getText());
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys(Keys.BACK_SPACE);
        hoursStart.sendKeys("12");
        String[] errorsShouldBe = new String[4];
        for(int i = 0; i < 3; i++) {
            errorsShouldBe[i] = "Please input minutes from 0 to 59";
        }
        assertArrayEquals(errorsShouldBe, errors);
    }

    @org.junit.Test
    public void timeMonInLocalStorage() throws InterruptedException {
        Thread.sleep(500);
        WebElement monday = driver.findElement(By.xpath("//div[2]/div/div/div/div/a[2]/div/div"));
        monday.click();
        Thread.sleep(500);
        WebElement hoursStart = driver.findElement(By.name("hoursStart"));
        hoursStart.click();
        hoursStart.sendKeys("12");
        WebElement minutesStart = driver.findElement(By.name("minutesStart"));
        minutesStart.click();
        minutesStart.sendKeys("13");
        WebElement hoursEnd = driver.findElement(By.name("hoursEnd"));
        hoursEnd.click();
        hoursEnd.sendKeys("14");
        WebElement minutesEnd = driver.findElement(By.name("minutesEnd"));
        minutesEnd.click();
        minutesEnd.sendKeys("15");
        WebElement sendButton = driver.findElement(By.name("sendButton"));
        sendButton.click();
        String config = local.getItem("config").toString();
        System.out.println(config);
        assertTrue(config.indexOf("\"mon\":[[\"12:13\",\"14:15\"]]") >= 0 );
    }

}
