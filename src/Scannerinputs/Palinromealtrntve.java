package Scannerinputs;

import java.util.Scanner;

public class Palinromealtrntve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter string");
String s=sc.nextLine();
int len=s.length();
int i;
int beg=0,end=len-1,mid=(beg+end)/2;
System.out.println("Length of string :"+len);
for(i=beg;i<=mid;i++){
if(s.charAt(beg)==s.charAt(end)){
	//System.out.println("String is palindrome");
	beg++;
	end--;
	
}
else{
	break;
}
}
if(i==mid+1){
	System.out.println("String is palindrome");
}else
	System.out.println("String is not palindrome");
	}
}