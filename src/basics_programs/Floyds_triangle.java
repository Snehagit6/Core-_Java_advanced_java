package basics_programs;

import java.util.Scanner;

public class Floyds_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=sc.nextInt();
		int num=1;
		for(int i=1;i<=rows;i++){
			for(int j=i;j<=rows;j++){
				System.out.print(num);
				num++;
			}
			
			System.out.println();
//			num=1;
		}
	}

}
