package Aggregation;

public class Salary extends Employee{
private double Salary;

public Salary(String name,int number,double Salary,Address a) {
super(name,number,a);
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
	//System.out.println("Mailing check to "+getname()+getAddress()+" with salary "+Salary);
	}
	public static void main(String[] args) {
Address a1=new Address(9,"Baker's Street", "London");
Employee e1=new Salary("James Clements",7,908.8,a1);
e1.checkmail();
	}

}
