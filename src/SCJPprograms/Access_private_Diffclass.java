package SCJPprograms;

import Aggregation.Employee;
import Polymorphism.Employeeclass;

public class Access_private_Diffclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employeeclass ec=new Employeeclass("Smi", "LK", 3);
System.out.println(ec.getname());

Access_Privatevariables a=new Access_Privatevariables();
System.out.println(a.getY());

	}

}
