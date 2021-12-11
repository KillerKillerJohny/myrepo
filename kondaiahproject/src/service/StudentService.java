package service;

import model.Student;

public class StudentService {
	public boolean nameValidation(Student st) {
		String s=st.studentName;
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
