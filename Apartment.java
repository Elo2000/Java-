public class Apartment {
	private String family;
	private int flat;
	private Room firstRoom;
	private Room secondRoom;
	private Room thirdRoom;
	private int numOfRooms;

	//The method initializes the last name and floor. 
	//If the flat is less than zero, the method will set the floor value 0.
	//In addition, the method will set null to each of the rooms, and zero to the number of rooms.
	public Apartment(String name, int flat) {
		this.family=name;
		this.numOfRooms=0;
		this.firstRoom=null;
		this.secondRoom=null;
		this.thirdRoom=null;
		if(flat<0) {
			this.flat=0;
		}
		else
			this.flat=flat;
	}
	// It returns family name
	public String getFamily() {
		return family;
	}
	// It returns the flat number 
	public int getFlat() {
		return flat;
	}
	//The method returns a Room type object. If there is no such room, the method returns null.
	public Room getRoomByType(String type) {
		if( firstRoom !=null && firstRoom.getType()==type) {
			return new Room(firstRoom);
		}
		else if( secondRoom!= null && secondRoom.getType()==type) {
			return new Room(secondRoom);
		}
		else if( thirdRoom!=null && thirdRoom.getType()==type) {
			return new Room(thirdRoom);
		}
		else return null;
	}
	// It returns number of rooms 
	public int getNumOfRooms() {
		return numOfRooms;
	}
	//If the rooms is not yet initialized, the method will set r to one, no matter which one.
	public void setRoom(Room r) {
		if (firstRoom ==null) {
			this.firstRoom=new Room(r);
			numOfRooms++;
		}
		else if (secondRoom == null) {
			this.secondRoom = new Room (r);
			numOfRooms++;
		}
		else if (thirdRoom == null) {
			this.thirdRoom=new Room(r);
			numOfRooms++;
		}}
	//It returns the total area
	public double getTotalArea() {
		double total=(firstRoom.getArea())+(secondRoom.getArea())+(thirdRoom.getArea());
		return total;
	}
	//It returns the apartment details 
	public String toString() {
		String s=family+"'s apartment, flat "+ flat+" has "+ numOfRooms + " rooms";
		if(firstRoom!=null) {
			s+="\n"+ firstRoom.toString();
		}
		if (secondRoom!=null) {
			s+="\n"+ (secondRoom.toString());
		}
		if (thirdRoom!=null) {
			s+="\n"+(thirdRoom.toString());
		}
		return s;
	}
}
