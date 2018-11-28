package basics_programs;

import java.util.Scanner;

public class alphabets {
	public void input(){
		System.out.println("Input is an alphabet");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter alphabet");
		char c=sc.next().charAt(0);
	
	
		while(c<='Z'){
			System.out.println(c);
			c++;
		}
				

	}

}
