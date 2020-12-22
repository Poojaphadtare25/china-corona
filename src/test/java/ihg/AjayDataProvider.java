package ihg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AjayDataProvider {
	@Test(dataProvider="good")
public void ram(int i,int j,String name)
{
System.out.println("Hello"+i+"J value is"+j);	
System.out.println(name);
}
     @DataProvider(name="good")
	public static Object[][] tamil()
	{
    	 
		return new Object[][]
				{
			{10,20,"Kumar"}
				};
	}

}
