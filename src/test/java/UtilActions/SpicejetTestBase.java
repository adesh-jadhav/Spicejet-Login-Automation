package UtilActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpicejetTestBase


{
	public  WebDriver obj1;

	public WebDriver WebDriverManager()
	 
	 
	{
		if(obj1==null)
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Automation_Devolopment\\Selenium_Tool\\Selenium_Download\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			obj1 = new ChromeDriver();
			obj1.manage().window().maximize();
			obj1.get("https://www.spicejet.com/");
		}
		return obj1;
		
	}
}
