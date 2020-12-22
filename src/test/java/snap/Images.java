package snap;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Images {
	public static WebDriver driver;
	public static long a=0;

	public void pic(WebDriver driver) throws IOException
	{  Random r=new Random();
	if(r.nextInt()!=0)
	{
		a=a+1;
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(".//pics//img"+a+".png");
		FileUtils.copyFile(src, dest);
	}
	}
}
