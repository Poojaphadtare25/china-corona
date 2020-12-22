package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTestNG {
   @AfterSuite
	public void one()
	{
		System.out.println("Hello one");
	}
	@BeforeMethod
	public void two()
	{
		System.out.println("Hello two");
	}
	@BeforeTest
	public void three()
	{
		System.out.println("Hello three");
	}
	@AfterTest
	public void four()
	{
		System.out.println("Hello four");
	}
	@Test
	public void five()
	{
		System.out.println("Hello five");
	}
	@BeforeClass
	public void six()
	{
		System.out.println("Hello six");
	}
	@AfterMethod
	public void seven()
	{
		System.out.println("Hello seven");
	}
	@BeforeSuite
	public void eight()
	{
		System.out.println("Hello eight");
	}
	
}
