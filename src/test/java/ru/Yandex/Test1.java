package ru.Yandex;

import driver.ChromDriver;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test1 {

    private Thread time;
//ChromDriver driver = ChromDriver.getChromeDriver();
    @Test
    public void Test1() {
        String path = System.getProperty("user.dir");
        String chromeDriverPath = path + "\\webdrivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

//        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://passport.yandex.ru/auth/add");
        driver.findElement(By.id("passp-field-login")).sendKeys("Proverca1014@yandex.ru");
        driver.findElement(By.id("passp:sign-in")).click();
  //      driver.findElement(By.id("passp-field-passwd")).sendKeys("Proverca789963");

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"passp-field-passwd\"]")).sendKeys("Proverca789963");
        driver.findElement(By.id("passp:sign-in")).click();


        String title = driver.getTitle();
        /*Assert.assertTrue(title.equals("Входящие — Яндекс.Почта"));*/




        driver.quit();

    }

}
