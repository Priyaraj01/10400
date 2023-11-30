package Interface;

public class BillMain {

	public static void main(String[] args) {

				EBill e=new EBill(23,78);
				System.out.println(e);
				e.display();

				
				WBill w=new WBill(55,78);
				System.out.println(w);
				w.display();
			}

		}