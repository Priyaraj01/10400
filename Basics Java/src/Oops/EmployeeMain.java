package Oops;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee E1=new Employee();
        E1.EmployeeId=0102;
        E1.EmployeeName="Prasanna";
        E1.EmployeeSalary=25000;
        E1.EmployeeAddress="Coimbatore,Tamilnadu";  
        System.out.println("The Employee id=:"+E1.EmployeeId);
        System.out.println("The Employee Name=:"+E1.EmployeeName);
        System.out.println("The Employee Salary=:"+E1.EmployeeSalary);
        System.out.println("The EmployeeId Adderss=:"+E1.EmployeeAddress);
        System.out.println("The Employee AnnualSalary=:"+E1.AnnualSalary());
        System.out.println("The Employee Pf=:"+E1.Pf());
        System.out.println("===============================");
        Employee E2=new Employee();
        E2.EmployeeId=0102;
        E2.EmployeeName="Priya";
        E2.EmployeeSalary=24500;
        E2.EmployeeAddress="Coimbatore,Tamilnadu";  
        System.out.println("The Employee id=:"+E2.EmployeeId);
        System.out.println("The Employee Name=:"+E2.EmployeeName);
        System.out.println("The Employee Salary=:"+E2.EmployeeSalary);
        System.out.println("The EmployeeId Adderss=:"+E2.EmployeeAddress);
        System.out.println("The Employee AnnualSalary=:"+E2.AnnualSalary());
        System.out.println("The Employee Pf=:"+E2.Pf());
        System.out.println("===============================");
 

	}

}
