package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class mulitiple_printing_testng1 {
	@Test
	public void m1() {
		Reporter.log("first test case",true);
	}
@Test
public void m2() {
	Reporter.log("second test case",true);
}
@Test
public void m3() {
	Reporter.log("third test case",true);
}
}
