package basics_programs;

import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to search");
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
		// TODO Auto-generated method stub

	}

}
}
