package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class mulitiple_printing_testng {
	@Test
	public void m1() {
		Reporter.log("Boss Iam from tc1",true);
	}
	@Test
	public void m2() {
		Reporter.log("Boss Iam from tc2",true);
	}
@Test
public void m3() {
	Reporter.log("Boss Iam from tc3",true);
	Reporter.log("Boss Iam from tc4",true);
}
}
