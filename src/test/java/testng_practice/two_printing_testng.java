package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class two_printing_testng {
	@Test
	public void m1() {
		Reporter.log("Hi how are you sister");
		Reporter.log("hello happy rakhabandan",true);
	}

}
