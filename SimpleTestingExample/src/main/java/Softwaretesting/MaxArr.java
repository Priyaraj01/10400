package Softwaretesting;

public class MaxArr {
	
		public static int MaxArray(int a[])
		{
			int max=a[0];
			for(int i=0;i<a.length;i++)
			{
				if(max<a[i])
				{
					max=a[i];
				}
			}
			return max;
		}

		
	}
