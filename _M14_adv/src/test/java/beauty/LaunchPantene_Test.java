package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchPantene_Test {
	@Test(groups="beauty")
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		Reporter.log("pantene website");
		driver.get("https://www.pantene.in/en-in/");
		driver.close();
	}
}
