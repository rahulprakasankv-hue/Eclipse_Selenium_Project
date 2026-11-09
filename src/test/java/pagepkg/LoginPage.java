package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"user-name\"]") WebElement username;
	@FindBy(xpath ="//*[@id=\"password\"]") WebElement password;
	@FindBy(xpath = "//*[@id=\"login-button\"]") WebElement logbtn;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//to initialize the located element located by the @findby anotations
	}
	
	public String titleMthd() {
		String title = driver.getTitle();
		return title;
	}
	
	public void loginMthd(String un,String pw) throws Exception {
		username.sendKeys(un);
		password.sendKeys(pw);
		Thread.sleep(4000);
		logbtn.click();
		
	}
	
	public String urlmthd() {
		String Actualurl = driver.getCurrentUrl();
		return Actualurl;
		
	}

}









