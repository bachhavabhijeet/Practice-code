package practice;

import java.util.ArrayList;

public class Arraylistpractice {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(10);
		al.add("abhijeet");
		al.add(true);
System.out.println(al);
al.add(0, "BACHHAV");
System.out.println(al);
al.indexOf(10);
System.out.println(al.indexOf(10));
System.out.println(al.get(2));
al.addFirst(200);
System.out.println(al);
	}

}
