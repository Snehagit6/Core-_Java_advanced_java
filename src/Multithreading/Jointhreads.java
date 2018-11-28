package Multithreading;

public class Jointhreads extends Thread{

	public void run(){
		System.out.println("Current thread name :"+" "+Thread.currentThread().getName());
		for (int i=1;i<5;i++){
			try{
				Thread.sleep(5000);
			}catch(Exception e){
				System.out.println(e);
				}
		
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Jointhreads jt1=new Jointhreads();
Jointhreads jt2=new Jointhreads();
Jointhreads jt3=new Jointhreads();
jt1.setName("jt1");
jt1.start();
try{
	jt1.join(15000);//Thread jt1 will complete its task for 15 secs and then jt2 ,jt3 start
}catch(Exception e){
	System.out.println(e);
}
jt1.setName("jt2");
jt2.start();
jt1.setName("jt3");
jt3.start();
	}

}
