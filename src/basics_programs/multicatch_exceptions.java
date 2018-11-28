package basics_programs;

public class multicatch_exceptions {

	public static void main(String[] args) {
		 int array[]={7,8,9,7};
		// TODO Auto-generated method stub
		try
        {
           
//            System.out.println(array[8]);

            System.out.println(array[2]/0);
            
            
        }
        catch(ArrayIndexOutOfBoundsException|ArithmeticException e)
        {

            System.out.println("Exception caught"+e);

        }
        
	}

}
