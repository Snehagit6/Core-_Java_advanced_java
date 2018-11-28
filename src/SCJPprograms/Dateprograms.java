package SCJPprograms;

import java.util.Date;

public class Dateprograms {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
long start=System.currentTimeMillis();
		Date d1=new Date();
		System.out.println(d1);
		Thread.sleep(6000);
		long end=System.currentTimeMillis();
		Date d2=new Date();
		System.out.println(d2);	
		try{
		System.out.println("Time difference : "+(end-start));
	}catch(Exception e){
		System.out.println("Foolish");
	}

}
}
