package SpicejetPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpicejetLandingPage
	{
	    public WebDriver obj1;
	    public SpicejetLandingPage(WebDriver obj1)
	    {
	    	this.obj1=obj1;
	    }
	
		By SpicejetDeals = 	By.xpath("//div[text()='Deals']");
		By SpicejetDName1 = By.xpath("//div[text()='Deals']");	
		
		public void SpiceDeals1()
	{
		obj1.findElement(SpicejetDeals).click();
        
	}
		public String SpiceDName1()
		{
			return obj1.findElement(SpicejetDName1).getText();
			
		}
		
	}
		