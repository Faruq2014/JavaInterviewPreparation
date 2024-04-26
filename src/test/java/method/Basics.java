package method;

import java.util.Locale;

public class Basics {

	private Locale fullName1;

	public static void main(String[] args) {
		System.out.println("hello");
		Basics basics= new Basics();
		basics.fullName().toUpperCase(basics.fullName1);
		basics.m1();
		
	}
 //how many different type of method in java
	 // based on return type, there are two types of method
	    // void 
	    // return method
	public void m1() {
		String fn="faruq";
		String ln="molla";
		String fullName=fn+ln;
		System.out.println(fullName);
	}
	public String   m2() {
		return null;}
	
	// based on return arugements, there are two types of method
    // zero 
    // parameterize method
	public String   fullName() {
		String fn="faruq";
		String ln="molla";
		String fullName1=fn+ln;
		System.out.println(fullName1);
		return fullName1;}
	
	public String   fullName(String fn,String ln) {
		return null;}
}
