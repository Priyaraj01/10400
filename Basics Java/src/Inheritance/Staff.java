package Inheritance;

public class Staff extends Student {
	int Exp;
	String Subject;
	int StaffAttendance;
	public Staff() {
		
	}
	public Staff(int exp, String subject, int StaffAttendance) {
		super();
		Exp = exp;
		Subject = subject;
		this.StaffAttendance = StaffAttendance;
	}
	public int getExp() {
		return Exp;
	}
	public void setExp(int exp) {
		Exp = exp;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public int getSAttendance() {
		return StaffAttendance;
	}
	public void setSAttendance(int sAttendance) {
		StaffAttendance = sAttendance;
	}
	@Override
	public String toString() {
		return "Staff [Exp=" + Exp + ", Subject=" + Subject + ", StaffAttendance=" + StaffAttendance + ", Attendance="
				+ Attendance + ", Std=" + Std + ", Percentage=" + Percentage + "]";
	}

}
