package SpicejetPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpicejetNextPage
	{
		 public WebDriver obj1;
		    public SpicejetNextPage(WebDriver obj1)
		    {
		    	this.obj1=obj1;
		    }
		    By NextPageDeal =   By.xpath("//a[text()='DEALS']");
		    By NextPageDName = By.xpath("//a[text()='DEALS']");
		    
		    public void NextPageDeal1()
		    {
		    	obj1.findElement(By.xpath("//a[text()='DEALS']")).click();
		    }
		    
		    public String NextPageDName1()
		    {
		    	return obj1.findElement(NextPageDName).getText();
		    }
		    
	}
