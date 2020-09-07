package methodsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDocuments {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	static void uploaddoc(WebDriver driver) {
		driver.get("https://tus.io/demo.html");
		driver.findElement(By.id("js-file-input")).sendKeys("D:\\Test Case Images\\Final Attachments\\T11407544.pdf");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		UploadDocuments.uploaddoc(driver);

	}

}
