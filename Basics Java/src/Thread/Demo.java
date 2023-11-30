package Thread;

public class Demo  extends Thread
		{
			public void run()
			{
				System.out.println("hai");
			}

			public static void main(String[] args) {
				Demo d=new Demo();//thread creation
				d.start();

		}
	
}
