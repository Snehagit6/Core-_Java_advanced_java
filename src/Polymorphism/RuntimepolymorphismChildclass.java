package Polymorphism;

public class RuntimepolymorphismChildclass extends ParentClass1{

	public void Operations(int a){
		int z=a*a;
	
	System.out.println(z);
	}
	public static void main(String[] args) {
//ParentClass1
ParentClass1 rc=new RuntimepolymorphismChildclass();//Parent class reference and Child class object
rc.Operations(92);

	}

}
