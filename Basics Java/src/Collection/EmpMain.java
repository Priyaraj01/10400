package Collection;
import java.util.ArrayList;
import java.util.Collections;

public class EmpMain {

	public static void main(String[] args) {
				Emp e1=new Emp("gayathri",56000,"pune");
				Emp e2=new Emp("sreeja",70000,"banglore");

				Emp e3=new Emp("mohana",66000,"mumbai");

				ArrayList<Emp>emplist=new ArrayList<Emp>();
				emplist.add(e1);
				emplist.add(e2);

				emplist.add(e3);
				 for(Emp e:emplist)
			       {
			    	   System.out.println(e);
			       }
				System.out.println("=================Sorting==================");
				Collections.sort(emplist);
		       for(Emp e:emplist)
		       {
		    	   System.out.println(e);
		       }
				}
			
	}