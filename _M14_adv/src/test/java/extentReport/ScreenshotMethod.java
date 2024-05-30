package extentReport;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotMethod
{
public String takeScreenshot(WebDriver driver)
{
	LocalDateTime datetime=LocalDateTime.now();
	String date = datetime.toString().replace(":","-");
	String path = "./screenshot/"+date+".png";
	TakesScreenshot ts =(TakesScreenshot)driver;
	File scr=ts.getScreenshotAs(OutputType.FILE);
	File trg=new File(path);
	try {
		FileHandler.copy(scr, trg);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "."+path;//it will save inside the report on particular folder
}
}
