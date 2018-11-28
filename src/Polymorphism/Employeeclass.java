package Polymorphism;

public class Employeeclass {
	private String name;
	private String address;
	private int number;
	public Employeeclass(String name,String address,int number) {
		System.out.println("Constructing Employeeclass");
		this.name=name;
		this.address=address;
		this.number=number;
	}
	public String getname(){
		return name;
	}
	public void setname(String newname){
		name=newname;
		}
	public String getaddress(){
		return address;
	}
	public void setaddress(String newaddress){
		address=newaddress;
		}
	public int getnumber(){
		return number;
	}
	public void setnumber(int newnumber){
		number=newnumber;
		}
	public void checkmail(){
	System.out.println("name: "+name+'\n'+"address: "+address+'\n'+"number: "+number);
	}

}
