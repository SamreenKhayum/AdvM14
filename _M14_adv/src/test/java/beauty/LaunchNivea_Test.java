package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchNivea_Test{
	@Test(groups="beauty")
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		Reporter.log("nivea website");
		driver.get("https://www.nivea.in/");
		driver.close();
	}
}
