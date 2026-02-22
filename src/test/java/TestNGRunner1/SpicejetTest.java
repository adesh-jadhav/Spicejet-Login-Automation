package TestNGRunner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/FeatureSpicejet1",glue="StepDefinations",monochrome=true)
//@CucumberOptions(features="src/test/java/Feature_Files",glue="StepDefinations",monochrome=true,dryRun=true )


public class SpicejetTest extends AbstractTestNGCucumberTests 
{

}
