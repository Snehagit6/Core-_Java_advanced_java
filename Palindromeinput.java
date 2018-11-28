package Scannerinputs;

import java.util.Scanner;

public class Palindromeinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		int c=1;
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter string");
String s=sc.nextLine();
int len=s.length();
System.out.println("Length of string :"+len);
for(int i=len-1;i>=0;i--){
	rev=rev+s.charAt(i);}
	//System.out.println("Reverse string :"+rev);
	//}
	if(s.equals(rev)){
		//System.out.println("Reverse string :"+rev);
	System.out.println("String is palindrome");}
	else{
		System.out.println("Reverse string "+rev+" is not palindrome");	}
	while(c!=11){
	System.out.println("Enter number");
	//try{
	int j=sc.nextInt();
	//}catch(Exception e){
	//	System.out.println("Wrong input type");
	//}
	int reverse=0;
	int temp=j;

	while(temp!=0){
		reverse=reverse*10;
		reverse=reverse+temp%10;
		temp=temp/10;
	}
if(reverse==j){
	System.out.println(j +" is a palindrome number");
}
else 
	System.out.println(j +" is not a palindrome number");
}
	c++;
	}

}
	


