package basics_programs;

public class loading_class {
	


	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		methods m=(methods)Class.forName("methods").newInstance();//Calling the class without creating its object
		
		
	}

}
