package basics_programs;

public class static_block {
	//static block is executed before main method
	static{
		
		System.out.println("Executing static block");
		String os=System.getenv("OS");
		//Windows_NT is a family of 
		//operating systems which includes Windows XP, Vista, Windows 7, Windows 8 and others.
		System.out.println(os);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Executing main block");

	}

}
