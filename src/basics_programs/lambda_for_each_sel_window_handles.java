package basics_programs;
import java.util.*;  

public class lambda_for_each_sel_window_handles {

		// TODO Auto-generated method stub


		    public static void main(String[] args) {  
		          
		        List<String> list=new ArrayList<String>();  
		        list.add("ankit");  
		        list.add("mayank");  
		        list.add("irfan");  
		        list.add("jai");  
		          
		        list.forEach(  
		            (n)->
		            		System.out.println(n) 
		        );  
		    }  
		 
	}


