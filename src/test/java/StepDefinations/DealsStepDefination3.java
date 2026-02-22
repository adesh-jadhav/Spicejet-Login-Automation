package StepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import SpicejetPageObject.SpicejetNextPage;
import SpicejetPageObject.SpicejetPageObjectManager;
import UtilActions.TestSetupContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DealsStepDefination3 
{
	public String Dname2;
	TestSetupContext TestContextSetup;
	SpicejetPageObjectManager SpicejetPageObjectManager1;
	TestSetupContext TestSetupContext1;
	
	
	public DealsStepDefination3(TestSetupContext TestContextSetup)
	{
		this.TestContextSetup=TestContextSetup;
	}
	
	
	@Then("User Click For Deals_{int} in Next Page if Deal Exist")
	public void user_click_for_deals_in_next_page_if_deal_exist(Integer int1)
	{
		
		
		SwitchToNextPage();
		//SpicejetNextPage NextPage1 = new  SpicejetNextPage(TestContextSetup.obj1);
		SpicejetNextPage NextPage1 = TestContextSetup.SpicejetPageObjectManager2.getSpicejetNextPage();
		
		
		  //TestContextSetup.obj1.findElement(By.xpath("//a[text()='DEALS']")).click();
		NextPage1.NextPageDeal1();
		
		
		  //String Dname2 = TestContextSetup.obj1.findElement(By.xpath("//a[text()='DEALS']")).getText();
		
		String Dname2 = NextPage1.NextPageDName1();
        System.out.println(Dname2);
        
	}
	
	public void SwitchToNextPage()
	{
		
		TestSetupContext1.SpicejetTestBase1.WebDriverManager();
		//Set<String> A1=TestContextSetup.obj1.getWindowHandles();
		//Iterator<String> B1 = A1.iterator();
		//String ParentC1 = B1.next();
		//String ChildC1 = B1.next();
		//TestContextSetup.obj1.switchTo().window(ChildC1);
		
		
	} 

	@Then("Validate Deals name in next page matches with landing page")
	public void validate_deals_name_in_next_page_matches_with_landing_page()
		{
		   Assert.assertEquals(TestContextSetup.Dname1, Dname2);
		}
	
}
