package Polymorphism;

public class StaticPolymorphism {

	/*Method Overloading*/
	public void Addition(){
		int a=9;
		int z=a+a;
		System.out.println("z : "+z);
		
	}
	public void Addition(int a){
		int z=a+a;
		System.out.println("z : "+z);
		
	}
	public void Addition(float a,int b){
		
		float z=a+b;
		System.out.println("z : "+z);
		
	}
	public double Addition(double a){
		
		double z=a+a;

		return z;
		
	}
	public StaticPolymorphism(String Sneha) {
		this();
		System.out.println("Constructor overloading by "+Sneha);
	}
	/*Constructor overloading*/
	public  StaticPolymorphism() {
		System.out.println("Default constructor");
	}
	/*Final method can be overloaded*/
	public final void Sub(){
		System.out.println("Final method");
	}
	public final void Sub(String Name){
		System.out.println("Final method"+Name);
	}
	/*Static method can be overloaded*/
	public static void Mul(){
		System.out.println("Static method");
	}
	public static void Mul(String Name){
		System.out.println("Static method"+Name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticPolymorphism stpm=new StaticPolymorphism("Mimi");

stpm.Addition();
stpm.Addition(7);
stpm.Addition((float) 6.7,7);
System.out.println(stpm.Addition(9.678));
stpm.Sub();
Mul();

	}

}
