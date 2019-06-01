package oppexercise2;

public class Circle {
	private double radius;
	
	/** Gives the radius.
	 * @return gives the radius of the circle.
	 */

	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	/**Area of the circle
	 * Area of the given circle
	 */
	public void getArea()
	{
		System.out.println(Math.PI * radius *radius);
	}
	
	@Override
	public String toString() {
		return ("Circle's Radius is " + this.radius);
		
	}

}
