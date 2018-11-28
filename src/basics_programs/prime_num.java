package basics_programs;
import java.util.*;
public class prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=3;
		int prime = 1;
		System.out.println("Enter the number of prime numbers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int count=2;count<=n;){
			for(int j=2;j<=Math.sqrt(num);j++){
				if(num%j==0){
					prime=0;
					break;
				}
				
			}
			if(prime!=0||prime==2){
				System.out.println(num);
				count++;
			}
			num++;
			
		}
		
		
		
	}

}
