package methodsSelenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMindowMethod {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String pw=driver.getWindowHandle();
		System.out.println(pw);
		Set<String> aw=driver.getWindowHandles();
		System.out.println(aw.size());
		for(String allwindow:driver.getWindowHandles()) {
			if(!allwindow.equals(pw)) {
				driver.switchTo().window(allwindow);
				driver.close();
				
			}
		}
			

	}

}
