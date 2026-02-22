package StepDefinations;

import org.openqa.selenium.WebDriver;
import SpicejetPageObject.SpicejetLandingPage;
import UtilActions.TestSetupContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DealsStepDefination2 
{
    public WebDriver obj1;
    public String Dname1;
    public String Dname2;
    TestSetupContext TestContextSetup;

    public DealsStepDefination2(TestSetupContext TestContextSetup)
    {
        this.TestContextSetup = TestContextSetup;
    }
    
    @Given("User is on Spicejet Landing Page")
    public void user_is_on_spicejet_landing_page() 
    {
        TestContextSetup.SpicejetTestBase1.WebDriverManager();
    }

    @When("User Click With Deals_{int} and Actual Name of Deals_{int}")
    public void user_click_with_deals_and_actual_name_of_deals(Integer int1, Integer int2) 
    {
        SpicejetLandingPage LandingPage = TestContextSetup.SpicejetPageObjectManager2.GetSpicejetLandingPage();
        LandingPage.SpiceDeals1();
        String Dname1 = LandingPage.SpiceDName1();
        System.out.println(Dname1);
    }
}
