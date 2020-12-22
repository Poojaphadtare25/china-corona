package testng;

import org.testng.annotations.Test;

public class ZooTest {
	@Test(groups= {"regression","Sanity"})
public void one()
{
System.out.println("One");	
}
	@Test(priority=1)
public void two()
{
System.out.println("Two");	
}
	@Test(priority=2)
public void three()
{
System.out.println("Three");	
}
}
