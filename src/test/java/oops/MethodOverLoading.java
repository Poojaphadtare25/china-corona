package oops;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading mol=new MethodOverLoading();
		//mol.piza();
		//mol.piza(5, "Rama");
		mol.piza(10, "Ramarao", "Hyderabad");
	}
	public void piza()
	{
		System.out.println("Hi i need one piza");
	}
	public void piza(int a)
	{
	System.out.println("I need "+a+"Piza");	
	}
	public void piza(int a,String name)
	{
	System.out.println("I need "+a+"Pizza ");	
	System.out.println("My name is "+name);

	}
	public void piza(int a,String name,String city)
	{
		System.out.println("I need "+a+"Pizza ");	
		System.out.println("My name is "+name);
		System.out.println("My city is "+city);
	}

	
}
