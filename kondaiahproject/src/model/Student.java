package model;

public class Student {
	String studentId;
	String studentName;
	int creditPoints;
	private static String idCount="101";
	public Student(String name,int credit) {
		if(name==null)
			throw new NullPointerException();
		if(credit==0 || credit<0)
			System.out.println("invalid credits");
			//throw new InvalidCreditException("credits should not be 0 or < 0");
		this.studentName=name;
		this.creditPoints=credit;
		Long id=Long.valueOf(idCount);
		id++;
		this.studentId=id.toString();
		
	}
	
	public boolean nameValidation(String s) {
		if(s.length()<4)
			return false;
		for(int i=0;i<s.length();i++) {
			 if (!Character.isDigit(s.charAt(i))
		                && !Character.isLetter(s.charAt(i))
		                && !Character.isWhitespace(s.charAt(i))) {
				 return false;
			 }
		}
		
		return true;
	}
	
}
