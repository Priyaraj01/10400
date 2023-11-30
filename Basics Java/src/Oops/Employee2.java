package Oops;

public class Employee2 {

	 private int EmployeeId;
	 private String EmployeeName;
  	 private int EmployeeSalary;
	public String EmployeeAddress;
	Employee2()
	{
		
	}
	Employee2(int i,String j,int k,String l)
	{
		EmployeeId=i;//1001
		EmployeeName=j;//gayathri
		EmployeeSalary=k;//90
		EmployeeAddress=l;//78
	}
	public void setEmployeeId( int EmployeeId)
    {
        this.EmployeeId=EmployeeId;
        
    }
    public int getEmployeeId()
    {
        return EmployeeId;
    }
    public void setEmployeeName( String EmployeeName)
    {
        this.EmployeeName=EmployeeName;
        
    }
    public String getEmployeeName()
    {
        return EmployeeName;
    }
    public void setEmployeeSalary( int EmployeeSalary)
    {
        this.EmployeeSalary=EmployeeSalary;
        
    }
    public int getEmployeeSalary()
    {
        return EmployeeSalary;
    }
    public void setEmployeeAddress( String EmployeeAddress)
    {
    	this.EmployeeAddress=EmployeeAddress;
    }
    public String getEmployeeAddress()
    { 	
    	return EmployeeAddress;
    			
    }
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