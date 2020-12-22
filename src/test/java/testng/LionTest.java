package testng;

import org.testng.annotations.Test;

public class LionTest {
	@Test(dependsOnMethods= {"veg"})
	public void nonveg()
	{
		System.out.println("non-veg");
	}
	@Test()
	public void veg()
	{
		System.out.println("veg");
	}
}
