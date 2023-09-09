package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class mulipleclass1 {
	@Test
	public void m1() {
		Reporter.log("bhavani",true);
		
	}
@Test
public void m2() {
	Reporter.log("prasad",true);
}
}
