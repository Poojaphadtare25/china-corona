package ihg;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="ramarao";
/*
for(int i=0;i<(name.length());i++)
{
System.out.println(name.substring(name.length(),(name.length()-i)));	
}
*/
for(int i=1;i<=name.length();i++)
{
System.out.print(name.charAt(name.length()-i));	
}

//Another approach
String name1="Derangulla";
System.out.println();
StringBuilder sb=new StringBuilder(name1);
System.out.println(sb.reverse());
	}

}
