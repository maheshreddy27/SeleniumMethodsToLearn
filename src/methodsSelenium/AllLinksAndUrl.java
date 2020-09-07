package methodsSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksAndUrl {

	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	static void linksUrl(WebDriver driver) {
		driver.get("https://www.naukri.com/");
		List<WebElement> al=driver.findElements(By.tagName("a"));
		for(WebElement w:al) {
			String links=w.getText();
			String url=w.getAttribute("href");
			System.out.println("link and name..."+links);
			System.out.println("Url and name..."+url);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AllLinksAndUrl.linksUrl(driver);

	}

}
