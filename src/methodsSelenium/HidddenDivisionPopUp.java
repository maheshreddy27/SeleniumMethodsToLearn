package methodsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HidddenDivisionPopUp {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	static void  HidddenDivPop(WebDriver driver) {
		driver.get("https://www.starhealth.in/customerportal/instant-renewal");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("policyNumber")).sendKeys("13253734-1");
		driver.findElement(By.className("form-control")).sendKeys("01-06-1960");
		driver.findElement(By.className("MuiButton01306")).click();
		System.out.println("Element is clicked");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		HidddenDivisionPopUp.HidddenDivPop(driver);

	}

}
