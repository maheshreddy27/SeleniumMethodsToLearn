package methodsSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	static void deletcookkies(WebDriver driver) {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		DeleteCookies.deletcookkies(driver);
		
		

	}

}
