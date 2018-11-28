package Polymorphism;

public class Salary extends Employeeclass{
private double Salary;
public Salary(String name, String address, int number,double Salary) {
		super(name, address, number);
		System.out.println(name+" "+address+" "+number);
		setSalary(Salary);
}
public double getSalary(){
	return Salary;
}
public void setSalary(double newSalary){
	
	if(newSalary>0)
		Salary=newSalary;
}
public void checkmail(){
	System.out.println("Within mailcheck of Salary class");
	System.out.println("Mailing check to "+getname()+" with salary "+Salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employeeclass emp1=new Salary("James Clements","3/A Baker's Street,London",8,890.789);
emp1.checkmail();
Employeeclass emp2=new Employeeclass("James Clements","3/A Baker's Street,London",8);
emp2.checkmail();
	}

}
