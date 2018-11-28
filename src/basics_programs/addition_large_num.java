package basics_programs;

import java.math.BigInteger;
import java.util.Scanner;

public class addition_large_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		String n1=sc.nextLine();
		BigInteger num1=new BigInteger(n1);
		System.out.println("Enter the second number");
		String n2=sc.nextLine();
		BigInteger num2=new BigInteger(n2);
		BigInteger sum;
		sum=num1.add(num2);
		System.out.println("Addition of two numbers :"+sum);

	}

}
