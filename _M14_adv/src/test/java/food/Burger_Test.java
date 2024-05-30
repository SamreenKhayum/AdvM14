package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Burger_Test {
	@Test
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		Reporter.log("burger website");
		driver.get("https://www.burgerking.in/");
		driver.close();
	}
}
