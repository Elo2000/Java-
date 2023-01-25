public class Circle {
	public double centerX ;
	public double centerY;
	public double radius;

	public Circle() {
		this.centerX=0;
		this.centerY=0;
		this.radius=1;
	}
	//It receives the variables and set them.
	//If the radius is not positive,it will gives us the value "1".
	public Circle(double x, double y, double r) {

		this.centerX=x;
		this.centerY=y;
		if(r>=0) {
			this.radius=r;
		}
		else
			this.radius=1;
	}

	public double getCenterX() {
		return centerX;
	}
	public void setCenterX(double centerX) {
		this.centerX = centerX;
	}
	public double getCenterY() {
		return centerY;
	}
	public void setCenterY(double centerY) {
		this.centerY = centerY;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if(radius>=0) {
			this.radius = radius;
		}
	}
	//The method will return a string representing the circuit details.
	public String toString() {
		return "Circle at("+centerX+ ","+ centerY+ ") radius"+ radius;
	}
	//The method will return the area of ​​the circle.
	public double area() {
		double area=Math.PI*radius*radius;
		return area;
	}
	//The method will return the perimeter of ​​the circle.
	public double perimeter() {
		double perimeter=2*Math.PI*radius;
		return perimeter;
	}
	//The method will change the size of the circle.
	public void resize(double factor) {
		if(factor>=0) {
			radius=radius*factor;
		}
	}
	//The method will take a new center for the circle, and place them in the current center.
	public void moveTo(double x, double y) {
		centerX=x;
		centerY=y;
	}
	//The method returns true if this point is inside or on it, and false otherwise.
	public boolean isIn(double x, double y) {
		double distance=(Math.sqrt(x-centerX)*(x-centerX)+(y-centerY)*(y-centerY));
		if(distance<=radius) {
			return true;
		}
		else 
			return false;
	}
}
