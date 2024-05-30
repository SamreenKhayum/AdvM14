

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchDove_Testusingcmd 
{
@Test
public void dove() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	Reporter.log("dove website");
	driver.manage().window().maximize();
	//driver.get("https://www.dove-india.com/");
	String url = System.getProperty("url");
	driver.get(url);
	Thread.sleep(3000);
	driver.close();
	//mvn test -Dtest=LaunchDove_Testusingcmd -Durl="https://www.dove-india.com/"
}
}
