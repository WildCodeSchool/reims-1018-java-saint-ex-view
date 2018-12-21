package Java;

import java.util.ArrayList;
import java.util.List;

public class RoomList {
	
	private List<Room> rooms;

	public RoomList() {
		rooms = new ArrayList<Room>();
		
		List<Link> links1 = new ArrayList<Link>();
		links1.add(new Link("top:15%;left:20%", "?room=2", "Accueil"));
		links1.add(new Link("top:40%;left:80%", "", "Retour"));
		Room room1 = new Room(1, "20181219_095742.jpg", "Bienvenue", links1);
		
		List<Link> links2 = new ArrayList<Link>();
		links2.add(new Link("top:35%;left:75%", "?room=4", "Polaroid"));
		links2.add(new Link("top:20%;left:50%", "", "Spectacle"));
		links2.add(new Link("top:75%;left:40%", "?room=2", "Accueil"));
		links2.add(new Link("top:65%;left:75%", "?room=3", "Bar"));
		links2.add(new Link("top:35%;left:5%", "?room=5", "Labo"));
		Room room2 = new Room(2, "20181219_100739.jpg", "Accueil", links2);
		
		List<Link> links3 = new ArrayList<Link>();
		Room room3 = new Room(3, "20181219_100824.jpg", "", links3);
		
		List<Link> links4 = new ArrayList<Link>();
		Room room4 = new Room(4, "20181219_101107.jpg", "", links4);
		
		List<Link> links5 = new ArrayList<Link>();
		Room room5 = new Room(5, "20181219_101220.jpg", "", links5);
		rooms.add(room1);
		rooms.add(room2);
		rooms.add(room3);
		rooms.add(room4);
		rooms.add(room5);
	}
	
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public Room getRoomById(int id) {
		for(var room : this.rooms) {
			if(room.getId() == id) {
				return room;
			}
		}
		return null;
	}
}