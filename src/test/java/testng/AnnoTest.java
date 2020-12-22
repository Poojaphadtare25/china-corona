package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnoTest {
	@BeforeSuite
	public void besuite()
	{
		System.out.println("before suite");
	}
	@AfterSuite
	public void afsuite()
	{
		System.out.println("after suite");
	}
	
	@BeforeTest
	public void betest()
	{
		System.out.println("beforetest");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest");
	}
	@Test
public void test()
{
	System.out.println("test");
}
	@BeforeClass
	public void beclass()
	{
		System.out.println("before class");
	}
	@AfterClass
	public void afclass()
	{
		System.out.println("after class");
	}
}
