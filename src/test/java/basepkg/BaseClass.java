package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.CartPage;
import pagepkg.CheckPage;
import pagepkg.HomePage;
import pagepkg.LoginPage;
import pagepkg.PaymentPage;

public class BaseClass {
	public static WebDriver driver;
	public LoginPage lp;
	public HomePage hp;
	public CartPage cp;
	public CheckPage chp;
	public PaymentPage pp;
	
	@BeforeTest
	public void opensetup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objMthd() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		cp = new CartPage(driver);
		chp = new CheckPage(driver);
		pp = new PaymentPage(driver);
	}

}
