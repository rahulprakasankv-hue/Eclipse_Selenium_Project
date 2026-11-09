package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;

public class Paymenttest extends BaseClass{
	@Test
	public void finishtest() throws Exception {
		pp.finishMthd();
	}
	
}
