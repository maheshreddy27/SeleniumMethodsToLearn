package methodsSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Active {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	static void active(WebDriver driver) {
		driver.get("https://loanauth-qa.loanhd.com/Login.aspx");
		driver.manage().window().maximize();
		WebElement w=driver.switchTo().activeElement();
		w.sendKeys("test");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Active.active(driver);
		

	}

}
