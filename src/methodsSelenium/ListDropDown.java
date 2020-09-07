package methodsSelenium;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListDropDown {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	static void list(WebDriver driver) {
		driver.get("https://demoqa.com/select-menu");
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		WebElement wb=driver.findElement(By.xpath("//div[contains(@class,'css-tlfecz-indicatorContainer')]"));
//		wb.click();
//		Select sl=new Select(wb);
//		sl.selectByIndex(1);
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//div[contains(@class,'css-tlfecz-indicatorContainer')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'NCR')]")).click();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ListDropDown.list(driver);

	}

}
