package com.example.UiTesting;

import org.junit.After;
import org.junit.Before;
        import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.html5.LocalStorage;
        import org.openqa.selenium.html5.WebStorage;

        import java.util.concurrent.TimeUnit;

        import static org.junit.Assert.assertTrue;

public class CityTest {
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
    public void msk() throws InterruptedException {
//        WebElement city = driver.findElement(By.xpath("//div[@id='tab-city-days']/div/div/div/div/div/div/div/input"));
        Thread.sleep(500);
        WebElement city = driver.findElement(By.name("city"));
        city.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Moscow')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("msk") >= 0);

    }

    @org.junit.Test
    public void spb() throws InterruptedException {
        Thread.sleep(500);
        WebElement city = driver.findElement(By.name("city"));
        city.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'St. Petersburg')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("spb") >= 0);
    }
    @org.junit.Test
    public void ekb() throws InterruptedException {
        Thread.sleep(500);
        WebElement city = driver.findElement(By.name("city"));
        city.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Yekaterinburg')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("ekb") >= 0);
    }

    @org.junit.Test
    public void krsnoyarsk() throws InterruptedException {
        Thread.sleep(500);
        WebElement city = driver.findElement(By.name("city"));
        city.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Krasnoyarsk')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("krasnoyarsk") >= 0);
    }
    @org.junit.Test
    public void krd() throws InterruptedException {
        Thread.sleep(500);
        WebElement city = driver.findElement(By.name("city"));
        city.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Krasnodar')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("krd") >= 0);
    }
    @org.junit.Test
    public void kzn() throws InterruptedException {
        Thread.sleep(500);
        WebElement city = driver.findElement(By.name("city"));
        city.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Kazan')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("kzn") >= 0);
    }
    @org.junit.Test
    public void sochi() throws InterruptedException {
        Thread.sleep(500);
        WebElement city = driver.findElement(By.name("city"));
        city.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Sochi')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("sochi") >= 0);
    }
    @org.junit.Test
    public void nsk() throws InterruptedException {
        Thread.sleep(500);
        WebElement city = driver.findElement(By.name("city"));
        city.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Novosibirsk')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("nsk") >= 0);
    }
    @org.junit.Test
    public void nnv() throws InterruptedException {
        Thread.sleep(500);
        WebElement city = driver.findElement(By.name("city"));
        city.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Nizhny Novgorod')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("nnv") >= 0);
    }
    @org.junit.Test
    public void online() throws InterruptedException {
        Thread.sleep(500);
        WebElement city = driver.findElement(By.name("city"));
        city.click();
        WebElement chosenCity = driver.findElement(By.xpath("//span[contains(.,'Online')]"));
        chosenCity.click();
        String config = local.getItem("config").toString();
        assertTrue(config.indexOf("online") >= 0);
    }
}



