package methodsSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksInAPage {
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	static void allLinks(WebDriver driver) {
		driver.get("https://www.naukri.com/");
		List<WebElement> al=driver.findElements(By.tagName("a"));
		//int b=al.size();
		System.out.println(al.size());
		for(int a=0;a<al.size();a++) {
			WebElement w=al.get(a);
			String v=w.getText();
			System.out.println(v);
			String url=w.getAttribute("href");
			System.out.println("Url number"+a+"....."+url);
			
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AllLinksInAPage.allLinks(driver);

	}

}
