package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;

public class CheckTest extends BaseClass{
	@Test
	public void inputtest() {
		chp.inputMthd("Luminar", "Tester", "4534");
	}
	
	@Test
	public void submittest() throws Exception {
		chp.submitMthd();
	}

}
