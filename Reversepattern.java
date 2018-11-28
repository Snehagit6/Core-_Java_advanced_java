package Scannerinputs;

import java.util.Scanner;

public class Reversepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter pattern");
String s=sc.nextLine();
int rowno=4;
for(int i=0;i<=rowno;i++){
	
	for(int j=i;j<=rowno-1;j++){
		System.out.print(s);
		
		
	}
	//r=r-1;
	System.out.print("\n");
}
	}
}


