package testng_practice;

import org.testng.annotations.Test;

public class InvocationCount {
@Test(invocationCount = 5)
public void m1() {
	System.out.println("Hii");
}
}
