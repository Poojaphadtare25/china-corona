package ihg;

import org.testng.annotations.Test;

public class AttriTest {
	@Test()
public void one()
{
System.out.println("One");	
}
	@Test(dependsOnMethods= {"one"})
	public void two()
	{
		System.out.println("two");
	}
	@Test(dependsOnMethods= {"two"})
	public void three()
	{
	System.out.println("three");	
	}
}
