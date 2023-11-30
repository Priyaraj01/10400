package Collection;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		
	
			ArrayList<Integer> list=new ArrayList<Integer> ();
			list.add(12);
			list.add(37);
			list.add(90);

			list.add(88);

			list.add(89);
			System.out.println(list);
			list.set(2, 98);
			System.out.println(list);
			list.remove(0);
			System.out.println(list);
			
			System.out.println(list.get(3));


		}
}