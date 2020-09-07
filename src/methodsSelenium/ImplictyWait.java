package methodsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictyWait {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	static void implicitWait(WebDriver driver) {
		driver.get("https://loanauth-qa.loanhd.com/Login.aspx");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		ImplictyWait.implicitWait(driver);

	}

}
