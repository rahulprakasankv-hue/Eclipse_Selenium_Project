package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckPage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"first-name\"]") WebElement FName;
	@FindBy(xpath="//*[@id=\"last-name\"]") WebElement LName;
	@FindBy(xpath="//*[@id=\"postal-code\"]") WebElement Postal;
	@FindBy(xpath="//*[@id=\"continue\"]") WebElement ContinueBtn;
	
	public CheckPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void inputMthd(String fn,String ln,String pn) {
		FName.sendKeys(fn);
		LName.sendKeys(ln);
		Postal.sendKeys(pn);
	}
	
	public void submitMthd() throws Exception {
		Thread.sleep(4000);
		ContinueBtn.click();
	}
	

}
