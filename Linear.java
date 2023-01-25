
public class Linear {

	private double a;
	private double b;

	public Linear(double a, double b) {
		this.a=a;
		this.b=b;
	}
	public Linear(Linear lin) {
		a=lin.a;
		b=lin.b;
	}
	//The method will return the slope value.
	public double getA() {
		return a;
	}
	//The method returns the cut-point value with the y.
	public double getB() {
		return b;
	}
	//The method will return a string representing the equation.
	public String toString() {
		if(a==0) {
			return "y="+b;
		}
		else if(b==0) {
			return "y="+a+"x";
		}
		else if (a==0 && b==0) {
			return "y=0";
		}

		else if(b<0) {
			return "y="+a+"x"+b;
		}
		else
			return "y="+a+"x +"+b;
	}
	//The method obtains an x ​​value and places it in the equation. The method will return the result.
	public double assign(double x) {
		double assign=(a*x)+b;
		return assign;
	}
	//The method obtains a value of y and finds the value of x.
	public double solve(double y) {
		double solve=(y-b)/a;
		return solve;
	}
	//The method will get a linear equation object
	//it return the x coordinate of the intersection of both equations.
	public double getIntersection(Linear other) {
		double getIntersection=(other.b-this.b)/(this.a-other.a);
		return getIntersection;
	}
	//The method obtains coordinates of a point x, y 
	//it returns true if the point is on the straight, and false if not.
	public boolean isOnLine(double x, double y) {
		double xside = (a*x)+b;
		if (y == xside) {
			return true;
		}
		else
			return false;
	}
	//The method obtains a linear equation object type 
	//it returns true if the graph of the other equation corresponds to the graph of the equation represented by this, and false if not.
	public boolean areParallel(Linear other) {
		if (other.a == this.a && other.b != this.b) {
			return true;
		}
		else
			return false;
	}
	//The function takes two-point coordinates,
	//it returns a Linear object that represents the straight line that extends between the two points.
	public Linear createLinear(double x1, double y1, double x2, double y2) {
		double a = (y2-y1)/(x2-x1);
		double b = y2-(a*x2);

		return new Linear(a,b);	
	}
}
