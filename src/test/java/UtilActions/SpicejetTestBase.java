package UtilActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SpicejetTestBase {

    public WebDriver obj1;

    public WebDriver WebDriverManager() {

        if (obj1 == null) {

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");

            obj1 = new ChromeDriver(options);
            obj1.manage().window().maximize();
            obj1.get("https://www.spicejet.com/");
        }

        return obj1;
    }
}