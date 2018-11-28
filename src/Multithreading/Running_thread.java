package Multithreading;

public class Running_thread extends Thread{

	public void run(){
		System.out.println("Thread is running");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Running_thread t1=new Running_thread();
t1.start();
//Thread.sleep(3000);
t1.start();
	}

}
