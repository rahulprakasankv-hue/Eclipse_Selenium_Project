package pagepkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
	WebElement products;

	@FindBy(tagName = "a")
	List<WebElement> links;

	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement addcart;

	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String textMthd() {
		String ActualText = products.getText();// to retrieve text of the element
		return ActualText;
	}

	public int linkmthd() {
		int count = links.size();
		return count;
	}

	public void cartmthd() throws Exception {
		addcart.click();
		Thread.sleep(4000);
		cart.click();
	}
}
