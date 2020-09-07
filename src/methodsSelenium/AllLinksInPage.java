package methodsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksInPage {
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	static void allLinks(WebDriver driver) {
		driver.get("https://loanauth-qa.loanhd.com/Login.aspx");
		driver.manage().window().maximize();
		List<WebElement> wb=driver.findElements(By.xpath("//a"));
		System.out.println(wb);
		System.out.println(wb.size());
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		AllLinksInPage.allLinks(driver);

	}

}
