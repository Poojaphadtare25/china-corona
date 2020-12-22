package Attributes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvoTest {
@Test(dependsOnMethods= {"bala"})
public void rama()
{
	System.out.println("Ramarao");
	System.out.println("ajay");
	System.out.println("Srivani");
}

@Test(dependsOnMethods= {"sai"})
public void bala()
{
	System.out.println("bala");
	System.out.println("boja");
	System.out.println("yogi");
}

@Test()
public void sai()
{
	System.out.println("sai");
	
}
}
