package Oops;

public class Employee {

	int EmployeeId;
	String EmployeeName;
	int EmployeeSalary;
	String EmployeeAddress;
	double AnnualSalary()
		{
			int AnnualSalary=EmployeeSalary*12;
			return AnnualSalary;
		}
		double Pf()
		{
			double Pf=(EmployeeSalary*18)/100.0;
			return Pf;
		}
		public String toString()
		{
			return "Id=:"+EmployeeId+" \nSname=:"+EmployeeName+"\nEmployeeSalary=:"+EmployeeSalary+"\nEmployeeAddress=:"+EmployeeAddress
					+"\nAnnualSalary=:"+AnnualSalary()+"\nPf=:"+Pf();
		}
		
	}