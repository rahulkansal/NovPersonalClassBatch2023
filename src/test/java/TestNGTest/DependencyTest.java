package TestNGTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

	
	@Test
	public void serverStartedOk() { 
		System.out.println("serverStartedOk");
		Assert.assertEquals(true, false);
		
	}
	@Test(dependsOnMethods = { "serverStartedOk" },alwaysRun =true)
	public void method1() {
		System.out.println("method1");
			
	}

}
