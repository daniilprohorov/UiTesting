package com.example.UiTesting;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class CategoryTest {
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
    public void businessEvents() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Business events')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("business-events") >= 0);

    }

    @org.junit.Test
    public void cinema() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Movies')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("cinema") >= 0);
    }

    @org.junit.Test
    public void concert() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Concerts')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("concert") >= 0);
    }

    @org.junit.Test
    public void education() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Education')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("education") >= 0);
    }

    @org.junit.Test
    public void entertainment() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Entertainment')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("entertainment") >= 0);
    }

    @org.junit.Test
    public void exhibition() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Exhibitions')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("exhibition") >= 0);
    }

    @org.junit.Test
    public void fashion() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Fashion')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("fashion") >= 0);
    }

    @org.junit.Test
    public void festival() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Festivals')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("festival") >= 0);
    }

    @org.junit.Test
    public void holiday() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Holidays')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("holiday") >= 0);
    }

    @org.junit.Test
    public void kids() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Kids')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("kids") >= 0);
    }

    @org.junit.Test
    public void other() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Other')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("other") >= 0);
    }

    @org.junit.Test
    public void party() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Parties')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("party") >= 0);
    }
    @org.junit.Test
    public void photo() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Photoevents')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("photo") >= 0);
    }

    @org.junit.Test
    public void quest() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Quests')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("quest") >= 0);
    }

    @org.junit.Test
    public void shopping() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Shopping')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("shopping") >= 0);
    }

    @org.junit.Test
    public void tour() throws InterruptedException {
        Thread.sleep(500);
        WebElement category = driver.findElement(By.name("category"));
        category.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Tours')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("tour") >= 0);
    }

}