package UtilActions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;

public class SpicejetReuseUtil 
{
	public WebDriver obj1;
	
	public SpicejetReuseUtil( WebDriver obj1)
	{
		this.obj1 = obj1;
	}
	
	public void SwitchParentToChild()
	{
		
		Set<String> A1=obj1.getWindowHandles();
		Iterator<String> B1 = A1.iterator();
		String ParentC1 = B1.next();
		String ChildC1 = B1.next();
		obj1.switchTo().window(ChildC1);
	}

}
