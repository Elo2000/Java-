
public class Room {
	private String type;
	private double area;
	// The method gets the room name and area and places them into the class. 
	//If the area is less than zero, the method will return the value 0.
	public Room(String type, double area) {
		this.type=type;
		if(area<0) {
			this.area=0; 
		}
		else 
			this.area=area;
	}
	//A copy method.
	public Room(Room other) {
		this.type=other.type;
		this.area=other.area;
	}
	// It returns the room name.
	public String getType() {
		return type;
	}
	// It returns the room area.
	public double getArea() {
		return area;
	}
	//Places the name of the room.
	public void setType(String name) {
		this.type = name;
	}
	// It returns the room details.
	public String toString() {
		return "Room type: "+ type+ ",Area: "+ area;
	}
}
