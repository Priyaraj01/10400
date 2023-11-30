package Thread;

public class DemoExample1  extends Thread
	{
		public void run()
		{
			for(int i=0;i<5;i++)
			{
			System.out.println("hai");
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			}
		}

		public static void main(String[] args) {
			Demo d=new Demo();//thread creation
			d.start();

		}

	}