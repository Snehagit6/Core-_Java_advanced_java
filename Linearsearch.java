package Scannerinputs;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int search,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements");
int n=sc.nextInt();
int[] array=new int[n];
System.out.println("Enter "+n+" elements : "+"\n");
for(c=0;c<n;c++){

	array[c]=sc.nextInt();
}
System.out.println("Enter the number to be searched");	
search=sc.nextInt();
	for(c=0;c<n;c++){
		if(array[c]==search){
			System.out.println("Number is found at location : "+(c+1));
			break;
		}
	if(c==n){
		System.out.println("Number is not found");
	}
	
	}

}
}
