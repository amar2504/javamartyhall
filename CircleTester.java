import java.util.*; 

public class CircleTester {
	
	public static void main(String[] args) {
	
	List <Circle> listofCircle = new LinkedList<>();
	
	while(true)
	{
		double r = Math.random();
		if	(r>=0.01)
		{
			Circle c = new Circle(r);
			listofCircle.add(c);
		}
		else
			break;
	}
	
	for (int i =0; i<listofCircle.size();i++)
	{
		
		System.out.println(listofCircle.get(i));
	}
 }
}