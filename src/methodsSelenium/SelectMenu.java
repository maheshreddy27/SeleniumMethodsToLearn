package methodsSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu {
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	static void selectDropDown(WebDriver driver) {
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//*[@class=' css-1wa3eu0-placeholder']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Group 1, option 1')]")).click();
		WebElement w=driver.findElement(By.id("oldSelectMenu"));
		w.click();
		Select s1=new Select(w);
		s1.selectByIndex(2);
		List <WebElement> l=s1.getOptions();
		for(WebElement e:l) {
			System.out.println(e.getText());
		}
		System.out.println(s1.isMultiple());
		
		
//		WebElement w=driver.findElement(By.xpath("//*[@class=' css-1wa3eu0-placeholder']"));
//		w.click();
//		Select s1=new Select(w);
//		s1.selectByIndex(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		SelectMenu.selectDropDown(driver);

	}

}
