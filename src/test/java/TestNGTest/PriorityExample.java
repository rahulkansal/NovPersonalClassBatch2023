package TestNGTest;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority=2)
	public void login() {
		System.out.println("login");
	}
	
	@Test(priority=-2)
	public void product() {
		System.out.println("product");
	}
	
	@Test(priority=0)
	public void cart() {
		System.out.println("cart");
	}
	
	@Test(priority=2)
	public void checkout() {
		System.out.println("checkout");
	}
	
	@Test(priority=-1)
	public void payment() {
		System.out.println("payment");
	}

}
