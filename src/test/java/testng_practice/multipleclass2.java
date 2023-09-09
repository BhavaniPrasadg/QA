package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class multipleclass2 {
	@Test
	public void m3() {
		Reporter.log("manoj",true);
		
	}
@Test
public void m4() {
	Reporter.log("kumar",true);
}
}



