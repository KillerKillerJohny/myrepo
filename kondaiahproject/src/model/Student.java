package model;

public class Student {
	public String studentId;
	public String studentName;
	public int creditPoints;
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
	
}
