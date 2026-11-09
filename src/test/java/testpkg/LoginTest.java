package testpkg;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.BaseClass;

public class LoginTest extends BaseClass {
	@Test(priority=1)
	public void titleverify() {
		String ActualTitle = lp.titleMthd();
		Assert.assertEquals(ActualTitle, "Swag Labs");
	}
	
	@Test(priority=2)
	public void loginverify() throws Exception {
		lp.loginMthd("standard_user", "secret_sauce");
	}
	
	@Test(priority=3)
	public void urlvalidation() {
		String Homeurl = lp.urlmthd();
		System.out.println(Homeurl);
		//Assert.assertEquals(Homeurl, "https://www.saucedemo.com/inventory.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
	}

}









