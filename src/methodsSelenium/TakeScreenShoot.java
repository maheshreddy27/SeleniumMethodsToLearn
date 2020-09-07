package methodsSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShoot {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	static void takePhoto(WebDriver driver) {
		driver.get("https://loanauth-qa.loanhd.com/Login.aspx");
		driver.manage().window().maximize();
		Date d= new Date();
		String date=d.toString();
		String date1=date.replaceAll(":", "_");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sc=ts.getScreenshotAs(OutputType.FILE);
		String path="./photo/"+date1+".png";
		File ds=new File(path);
		try {
			FileUtils.copyFile(sc, ds);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		TakeScreenShoot.takePhoto(driver);

	}

}
