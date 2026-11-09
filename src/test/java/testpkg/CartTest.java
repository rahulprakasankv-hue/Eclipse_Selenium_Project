package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.BaseClass;

public class CartTest extends BaseClass{
	@Test(priority=1)
	public void yourcartVerify() {
		String textcart = cp.yourcartMthd();
		Assert.assertEquals(textcart, "Your Cart");
	}
	
	@Test(priority=2)
	public void chkVerify() throws Exception {
		cp.chkoutMthd();
	}

}
