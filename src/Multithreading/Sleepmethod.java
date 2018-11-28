package Multithreading;

public class Sleepmethod extends Thread{

	public void run(){
		for(int i=1;i<5;i++){
			try{Thread.sleep(5000);}
			catch(InterruptedException e){
				System.out.println(e);
				}
				System.out.println(i);
			}
			}
		
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Sleepmethod t1=new Sleepmethod ();
Sleepmethod t2=new Sleepmethod();
t1.start();//Thread scheduler picks up another thread while the first one sleeps
t2.start();
//t2.setPriority(MAX_PRIORITY);
/*Calling the run() method directly instead of start() method->there won't be any context switching.t1,t2 treated as normal objects rather than thread.run() method goes onto the current call stack rather than at the beginning of a new call stack */
t1.run();
t2.run();
	}

}
