package Aggregation;

public class Address {
int number;
private String streetname;
String city;
public int getnumber(){
	return number;
}
public String getstreetname(){
	return getStreetname();
	
}
public String setstreetname(String newstreetname){
	return setStreetname(newstreetname);
	
}
public String getcity(){
	return city;
	
}
public String setcity(String newcity){
	return city=newcity;
	
}
Address(int number,String streetname,String city){
	this.number=number;
	this.setStreetname(streetname);
	this.city=city;
	//System.out.println(number+streetname+city);
}
public String getStreetname() {
	return streetname;
}
public String setStreetname(String streetname) {
	this.streetname = streetname;
	return streetname;
}
}
