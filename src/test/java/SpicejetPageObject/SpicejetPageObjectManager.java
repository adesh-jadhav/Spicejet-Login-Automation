package SpicejetPageObject;

import org.openqa.selenium.WebDriver;

public class SpicejetPageObjectManager 
	{
		 public WebDriver obj1;
		 public SpicejetLandingPage SpicejetLandingPage1;
		 public SpicejetNextPage SpicejetNextPage1;
		    public SpicejetPageObjectManager(WebDriver obj1)
		    
		    {
		    	this.obj1=obj1;
		    }
		    
		    public SpicejetLandingPage GetSpicejetLandingPage()
		    {
		    	//SpicejetLandingPage SpicejetLandingPage1 = new SpicejetLandingPage(obj1);
		    	SpicejetLandingPage1 = new SpicejetLandingPage(obj1);
		    	return SpicejetLandingPage1;
		    }
		    public SpicejetNextPage getSpicejetNextPage()
		    {
		    	//SpicejetNextPage SpicejetNextPage1 = new SpicejetNextPage(obj1);
		    	SpicejetNextPage1 = new SpicejetNextPage(obj1);
		    	return SpicejetNextPage1;
		    }
		    
		    
	}


