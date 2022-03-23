package FaileTestScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class GetScreenshot extends MainTest {
	
	public static String  capture (String screenshotName) throws IOException {
		
		File d=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File s=new File(" \"C:\\Users\\Amol\\Desktop\\FailScreenShot.bmp\"");
		FileUtils.copyFile(d, s);
		
		return screenshotName;
		
	}

}
