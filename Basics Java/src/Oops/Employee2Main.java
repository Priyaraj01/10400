package Oops;

public class Employee2Main {

	public static void main(String[] args) {
		Employee2 E1=new Employee2(0102,"Prasanna",25000,"Coimbatore,Tamilnadu");
        System.out.println(E1);
        System.out.println("===============================");
        
        Employee2 E2=new Employee2(0103,"Priya",24000,"Chennai Tamilnadu");
        System.out.println(E2);
        System.out.println("===============================");
        
        Employee2 E3=new Employee2();
		E3.setEmployeeId(1003);
		E3.setEmployeeName("hari");
		System.out.println(E3.getEmployeeId());
		System.out.println(E3.getEmployeeName());
	}

}
