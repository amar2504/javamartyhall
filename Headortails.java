package assignment1;
import java.lang.Math;

public class Headortails {
		private double p ;
		
	public void giveResult()
	{
		for (int i=0; i< 10; i++)
		{	
			this.p = Math.random();
			if(this.p > 0.5)
			{
				System.out.println(this.p);
				System.out.println("Its heads");
			}
			else
			{
				System.out.println("Its tails");
			}
		}
	}	
}
