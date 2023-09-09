package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotationtestng {
	@BeforeSuite
	public void m1() {
		Reporter.log("connection to Database",true);
	}
@BeforeClass
public void m2() {
	Reporter.log("open the browser",true);
}
@BeforeMethod
public void m3() {
	Reporter.log("login to application",true);
}
@Test
public void t1() {
	Reporter.log("boss iam main testcase",true);
}
@AfterMethod
public void m4() {
	Reporter.log("log out application",true);
}
@AfterClass
public void m5() {
	Reporter.log("log out browser",true);
}
@AfterSuite
public void m6() {
	Reporter.log("log out to Database",true);
}
}
