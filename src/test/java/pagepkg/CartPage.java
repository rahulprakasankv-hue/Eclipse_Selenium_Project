package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
	WebElement yourcart;
	@FindBy(xpath = "//*[@id=\"checkout\"]")
	WebElement chkbtn;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String yourcartMthd() {
		String cartText = yourcart.getText();
		return cartText;
	}
	
	public void chkoutMthd() throws Exception {
		Thread.sleep(4000);
		chkbtn.click();
	}

}
