package oops;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1=new String("krishna");
String name2="rama";
String name3="HANUMAM";
String name4="RAMA";
String name5="rama";
System.out.println(name2.toUpperCase());
System.out.println(name3.toLowerCase());
System.out.println(name3.indexOf('N'));
System.out.println(name3.lastIndexOf('M'));
System.out.println(name2.equals(name4));
System.out.println(name2.equalsIgnoreCase(name4));
System.out.println(name2.equals(name5));
System.out.println(name2==name5);
System.out.println(name2.charAt(2));
System.out.println(name2.startsWith("a"));
System.out.println(name2.endsWith("a"));
System.out.println(name2.isEmpty());
System.out.println(name2.concat("rao"));
System.out.println(name2);
	}

}
