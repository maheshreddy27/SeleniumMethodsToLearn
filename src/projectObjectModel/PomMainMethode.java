package projectObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomMainMethode {
	static {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Pom login=new Pom(driver);
		login.setUsername("TestA");
		login.setPwd("1234");
		login.newUser();
		
		
		RegisterBook register=new RegisterBook(driver);
		register.firstname("Mahesh");
		register.lastname("Reddy");
		register.username("Mahesh");
		register.password("Mahi@1234");

	}

}
