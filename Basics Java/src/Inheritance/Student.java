package Inheritance;

public class Student extends Person {
 
	int Attendance;
	int Std;
	Float Percentage;
	public Student()
	{
		
	}
	public Student(int Id,String Name,String Address,int attendance, int std, Float percentage) {
		super(Id,Name,Address);
		Attendance = attendance;
		Std = std;
		Percentage = percentage;
	}
	public int getAttendance() {
		return Attendance;
	}
	public void setAttendance(int attendance) {
		Attendance = attendance;
	}
	public int getStd() {
		return Std;
	}
	public void setStd(int std) {
		Std = std;
	}
	public Float getPercentage() {
		return Percentage;
	}
	public void setPercentage(Float percentage) {
		Percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [Attendance=" + Attendance + ", Std=" + Std + ", Percentage=" + Percentage + "]";
	}
	
}
