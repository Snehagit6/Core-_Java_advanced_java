package basics_programs;

/**
 *Method overriding is compile time polymorphism.It can be achieved by:
 *a)By changing number of arguments
	b)By changing the data type
	By changing the returntype of method only[arguments should also have the same datatype],it will cause ambiguity,hence cannot be done
 *
 */
public class method_overloading {
	public method_overloading() {
		System.out.println("Constructor");
		
	}
	public method_overloading(int a){
		System.out.println("Parameterized Constructor: "+a);
	}
	public int  add(int a,int b,int d){
		int c=a+b;
		return c;
		
	}
	public float add(float a,float b){
		float c=a+b;
		return c;
		
	}
	public static void main(String args){
		System.out.println(args);
	}
public static int main(int args){
	return args;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_overloading m=new method_overloading(9);
		m.add((int) 9.0, 0,8);
		System.out.println(m.main(89));//main method can be overloaded,but JVM will call the static void main(String[] args) method
	}

}
