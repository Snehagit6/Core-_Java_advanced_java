package basics_programs;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer buffer=new StringBuffer("Java is great");
//		System.out.println(buffer.reverse());
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String string=sc.nextLine();
		int length=string.length();
		for(int l=(length-1);l>=0;l--){
			reverse=reverse+string.charAt(l);
			
		}
		System.out.println("Reverse string :"+reverse);
	}

}
