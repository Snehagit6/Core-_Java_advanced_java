package basics_programs;

public class inheritance extends alphabets{
	public inheritance(){
		System.out.println("Calling parent constructor");
	}
	int rank=4;
	public void ranking(){
		System.out.println("Ranking"+rank);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance tu=new inheritance();
		
		tu.input();
	}

}

