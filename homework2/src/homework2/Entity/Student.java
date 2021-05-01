package homework2.Entity;

public class Student extends User {
	private String schoolNumber;

	public Student() {
	}

	public Student(String schoolNumber) {
		super();
		this.schoolNumber = schoolNumber;
	}

	public String getSchoolNumber() {
		return schoolNumber;
	}

	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
}
