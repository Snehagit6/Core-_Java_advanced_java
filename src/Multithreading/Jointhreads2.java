package Multithreading;

public class Jointhreads2 extends Thread{

	public void run(){
		int[] Array={1,2,3,7,8};
			try{
				Thread.sleep(5000);
			}catch(Exception e){
				System.out.println(e);
				}
			for(int i:Array)
			System.out.println(i);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Jointhreads2 jt1=new Jointhreads2();
Jointhreads2 jt2=new Jointhreads2();
Jointhreads2 jt3=new Jointhreads2();
jt1.start();
//try{
	//jt1.join();
//}catch(Exception e){
	//System.out.println(e);
//}
jt2.start();
jt3.start();
	}

}
