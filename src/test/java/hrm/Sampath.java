package hrm;

public class Sampath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1="rama";
String name2="  rao  ";
String name3="RAMA";  //AMAR
String name4="NARASIMHA GG";
int i=10;
int j=10;
System.out.println(i==j);
System.out.println(name1==name3);
System.out.println(name1.equals(name2));
System.out.println(name1.concat(name2));
System.out.println(name2.concat("gopal"));
System.out.println(name1.toUpperCase());
System.out.println(name4.toLowerCase());
System.out.println(name2.charAt(1));
System.out.println(name2.indexOf('o'));
System.out.println(name4.endsWith("M"));
System.out.println(name4.indexOf("GG"));
System.out.println(name1.equals(name3));
System.out.println(name1.equalsIgnoreCase(name3));
System.out.println(name2.trim());
System.out.println(name2.contains("a"));
System.out.println(name3.length());

	}

}
