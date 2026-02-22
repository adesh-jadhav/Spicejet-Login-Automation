package UtilActions;

import org.openqa.selenium.WebDriver;

import SpicejetPageObject.SpicejetPageObjectManager;

public class TestSetupContext
	
	{
		public  WebDriver obj1;
		public String Dname1;
		public SpicejetPageObjectManager  SpicejetPageObjectManager2;
		public SpicejetTestBase SpicejetTestBase1;
		public SpicejetReuseUtil SpicejetReuseUtil1;
		
		public TestSetupContext()
		{
			SpicejetTestBase1 = new SpicejetTestBase();
			 //SpicejetPageObjectManager SpicejetPageObjectManager2 = new SpicejetPageObjectManager(obj1);
			 //SpicejetPageObjectManager2 = new SpicejetPageObjectManager(obj1);
			 SpicejetPageObjectManager2 = new SpicejetPageObjectManager(SpicejetTestBase1.WebDriverManager());
			// SpicejetReuseUtil1 = new SpicejetReuseUtil(SpicejetTestBase1.WebDriverManager());
			// SpicejetReuseUtil1 = new SpicejetReuseUtil(SpicejetTestBase1.WebDriverManager());

			// SpicejetReuseUtil1 = new SpicejetReuseUtil(obj1);

			 SpicejetReuseUtil1 = new SpicejetReuseUtil(SpicejetTestBase1.WebDriverManager());

		}
	}
   