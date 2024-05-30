package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchDove_Test 
{
@Test(groups="beauty")
public void dove()
{
	WebDriver driver=new ChromeDriver();
	Reporter.log("dove website");
	driver.get("https://www.dove-india.com/");
	driver.close();
	//mvn -Dtest=LaunchDove_Testusingcmd test
	//mvn test -P Ab rofiling plugin
}
}
