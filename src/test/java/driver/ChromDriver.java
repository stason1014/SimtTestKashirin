package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromDriver {
    public WebDriver main() {
        System.setProperty("webdriver.chrome.driver","C://Driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();


//        passp-page
        return driver;

    }
//    public static ChromDriver getChromeDriver() {
////        String path = System.getProperty("user.dir");
////        String chromeDriverPath = path + "\\webdrivers\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver","C://Driver//chromedriver.exe");
//
////        return new ChromeDriver();
//    }

}
