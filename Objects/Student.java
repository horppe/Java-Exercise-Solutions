
public class Student extends Human implements Comparable<Student>{
	public Integer mark;
	
	public Student(String firstName, String lastName, int mark) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mark = mark;
	}

	@Override
	public int compareTo(Student otherStudent) {
		// TODO Auto-generated method stub
		return this.mark.compareTo(otherStudent.mark);
	}
	
	@Override
	public String toString() {
		return String.format("Student ID: %s, mark: %d", this.firstName ,this.mark);
	}
}
