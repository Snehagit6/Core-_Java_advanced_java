package basics_programs;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num==0||num<0){
			System.out.println("Invalid input");
		}
		
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println(String.format("Factorial of number %d is %d",num,fact));
	}

}
