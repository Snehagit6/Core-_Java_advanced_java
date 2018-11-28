package SCJPprograms;

public class Access_Privatevariables {
 private int y=9;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Access_Privatevariables p=new Access_Privatevariables();
System.out.println(p.getY());//Private variable without given a public access can be accessed in main method
	}
/*Getter and setter has to be included to access a private variable in a different class*/
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}
