package methodsSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitileOfAllOpenedWindowAndCloseAllChildWindow {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	static void getTitileOfAllWindow(WebDriver driver) {
		driver.get("https://www.naukri.com/");
		Set <String> at=driver.getWindowHandles();
		System.out.println(at.size());
		for(String w:at) {
			System.out.println(driver.switchTo().window(w).getTitle());
			driver.close();
		}
		
	}
	
	static void closeOnlyChildWindow(WebDriver driver) {
		driver.get("https://www.naukri.com/");
		String pw=driver.getWindowHandle();
		Set <String> at=driver.getWindowHandles();
		at.remove(pw);
		for(String w:at) {
			driver.switchTo().window(w).close();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		GetTitileOfAllOpenedWindowAndCloseAllChildWindow.getTitileOfAllWindow(driver);
		GetTitileOfAllOpenedWindowAndCloseAllChildWindow.closeOnlyChildWindow(driver);

	}

}
