package Aggregation;

public class Employee {
	private String name;
    Address a;
	private int number;
	public Employee(String name,int number,Address a) {
		System.out.println("Constructing Employeeclass");
		this.name=name;
		
		this.number=number;
		this.a=a;
	}
	public String getname(){
		return name;
	}
	public void setname(String newname){
		name=newname;
		}
	
	public void getAddress(){
		System.out.println(a.number+a.getstreetname()+a.city);
	}
	
	public int getnumber(){
		return number;
	}
	public void setnumber(int newnumber){
		number=newnumber;
		}
	public void checkmail(){
	System.out.println("name: "+name+'\n'+"number: "+number);
	}
}
