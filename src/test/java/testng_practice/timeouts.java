package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeouts {
	@Test(timeOut = 5000)
	public void login() {
		Reporter.log("iam login",true);
	}

}
