package Polymorphism;

import java.util.Date;

public class Childclass extends StaticPolymorphism{

	public String  Addition(String a){
		System.out.println(a);
		return a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Childclass ch=new Childclass();
ch.Addition("Addition method is inherited and overloaded");
Date s=new Date();
System.out.println("System Date "+s);

	}

}
