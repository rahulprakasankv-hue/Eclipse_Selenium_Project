package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.BaseClass;

public class HomeTest extends BaseClass{
	@Test(priority = 1)
	public void textverify() {
		//lp.loginMthd("standard_user", "secret_sauce");
		String productText = hp.textMthd();
		Assert.assertEquals(productText, "Products");
	}
	
	@Test(priority = 2)
	public void linkverify() {
		int linkcount = hp.linkmthd();
		System.out.println("Number of Links----" +linkcount);
	}
	
	@Test(priority = 3)
	public void cartverify() throws Exception {
		hp.cartmthd();
	}

}






