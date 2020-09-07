package methodsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaPopUp {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	
	static void javaPopUp(WebDriver driver) throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("alertButton")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(5000);
		al.accept();
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a2=driver.switchTo().alert();
		Thread.sleep(5000);
		a2.dismiss();
		System.out.println("Able to execute the test case 1");
		driver.findElement(By.id("confirmButton")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(5000);
		a2.dismiss();
		System.out.println("Able to execute the test case 2");
		driver.findElement(By.id("promtButton")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(5000);
		//Alert a3=driver.switchTo().alert();
		a2.sendKeys("Mahesh Reddy");
		Thread.sleep(5000);
		a2.accept();

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		JavaPopUp.javaPopUp(driver);
		

	}

}
