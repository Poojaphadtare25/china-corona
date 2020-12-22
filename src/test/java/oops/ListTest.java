package oops;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(10);
al.add(20);
al.add(30);
System.out.println(al);
al.add(10);
System.out.println(al);
System.out.println(al.get(1));
al.add(400);
al.add(500);
al.add(600);
al.add(700);
al.add(800);
al.add(400);
al.add(500);
al.add(600);
al.add(700);
al.add(800);
System.out.println(al);
/*
Iterator<Integer> i=al.iterator();
while(i.hasNext())
{
	int abc=i.next();
	System.out.println(abc);
}  */
/*
for(int k=0;k<al.size();k++)
{
	System.out.println(al.get(k));
}
*/
/*
for(Integer ab:al)
{
	System.out.println(ab);
}
*/
int g=0;
while(g<al.size())
{
	System.out.println(al.get(g));
	g++;
}

	}

}
