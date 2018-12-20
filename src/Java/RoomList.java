package Java;

import java.util.ArrayList;
import java.util.List;

public class RoomList {
	
	private List<Room> rooms;

	public RoomList() {
		// TODO Auto-generated constructor stub
		rooms = new ArrayList<Room>();
		Room room1 = new Room(0, "20181219_095742.jpg");
		Room room2 = new Room(1, "20181219_100739.jpg");
		Room room3 = new Room(2, "20181219_100824.jpg");
		Room room4 = new Room(3, "20181219_101107.jpg");
		
		rooms.add(room1);
		rooms.add(room2);
		rooms.add(room3);
		rooms.add(room4);
	}
	
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public Room getRoomById(int id) {
		return rooms.get(id);
	}
}