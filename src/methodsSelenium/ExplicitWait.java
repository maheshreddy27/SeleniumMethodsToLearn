package methodsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	

	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	static void explicitWait(WebDriver driver) {
		driver.get("https://loanauth-qa.loanhd.com/Login.aspx");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("login_button_box")));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		ExplicitWait.explicitWait(driver);

	}

}
