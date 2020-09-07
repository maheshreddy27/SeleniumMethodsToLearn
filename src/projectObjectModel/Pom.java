package projectObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	@FindBy(id="userName")
	private WebElement un;
	@FindBy(id="password")
	private WebElement pw;
	@FindBy(id="login")
	private WebElement ln;
	@FindBy(id="newUser")
	private WebElement nw;
	
	public Pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void setUsername(String usrn) {
		un.sendKeys(usrn);
		
	}
	
	public void setPwd(String pwd) {
		pw.sendKeys(pwd);
		ln.click();
		
	}
	
	public void newUser() {
		nw.click();
		
	}
	
	
	
	

}
