package SCJPprograms;

import java.util.ArrayList;
import java.util.List;

public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		Integer i=Integer.valueOf(a);//Autoboxing:Wrapping primitive to object using Integer.valueOf(a)
		//Integer j=a;
		System.out.println(a);
		Integer a1=new Integer(6);
		//int k=a1;
		System.out.println(a1.intValue());//Unboxing:Unwrapping object to Integer using intValue()
		List<Integer>li=new ArrayList<>();//Integer is a Wrapper class
		li.add(9);
		li.add(19);
		li.add(9);
		System.out.println(li.get(0).intValue());//Unwrapping of Integer object to an integer(primitive) variable
		//int i = list.get(0).intValue(); 
		/*ParseInt() method method*/
		int x=Integer.parseInt("9");
		try{
		double b=Double.parseDouble("9098.890");
		System.out.println(b);
		}catch(NumberFormatException e){
			System.out.println("Wrong datatype!@");
		}
		int b1=Integer.parseInt("777",12);
		System.out.println(x+"  "+b1);
		
	}

}
