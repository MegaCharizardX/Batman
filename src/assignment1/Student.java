package assignment1;

public class Student {
	
	int rollno;
	String name;

	public Student(){
		
	}			
	
	public Student(int rollno, String name) {

		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
