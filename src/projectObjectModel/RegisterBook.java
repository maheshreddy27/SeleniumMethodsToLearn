package projectObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterBook {
	@FindBy(id="firstname")
	private WebElement frstname;
	@FindBy(id="lastname")
	private WebElement lstname;
	@FindBy(id="userName")
	private WebElement usrname;
	@FindBy(id="password")
	private WebElement pwsd;
	
	public RegisterBook(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void firstname(String fn) {
		frstname.sendKeys(fn);
	}
	
	public void lastname(String ln) {
		lstname.sendKeys(ln);
	}
	
	public void username(String un) {
		usrname.sendKeys(un);
	}
	
	public void password(String pw) {
		pwsd.sendKeys(pw);
	}
	
	

}
