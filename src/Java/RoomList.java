package Java;

import java.util.ArrayList;
import java.util.List;

public class RoomList {
	
	private List<Room> rooms;

	public RoomList() {
		rooms = new ArrayList<Room>();
		
		List<Link> links1 = new ArrayList<Link>();
		links1.add(new Link("top:50%;left:45%", "?room=2", "Accueil"));
		links1.add(new Link("top:40%;left:80%", "", "Retour"));
		Room room1 = new Room(1, "20181219_095742.jpg", "Bienvenue", links1);
		
		List<Link> links2 = new ArrayList<Link>();
		links2.add(new Link("top:35%;left:75%", "?room=4", "Polaroid"));
		links2.add(new Link("top:20%;left:50%", "?room=6", "Spectacle"));
		links2.add(new Link("top:75%;left:40%", "?room=1", "Entrée"));
		links2.add(new Link("top:65%;left:75%", "?room=3", "Bar"));
		links2.add(new Link("top:35%;left:5%", "?room=5", "Labo"));
		Room room2 = new Room(2, "20181219_100739.jpg", "Accueil", links2);
		
		List<Link> links3 = new ArrayList<Link>();
		links3.add(new Link("top:30%;left:5%", "?room=10", "Galerie"));
		links3.add(new Link("top:80%;left:15%", "?room=2", "Accueil"));
		Room room3 = new Room(3, "20181219_100824.jpg", "FeedBar", links3);
		
		List<Link> links4 = new ArrayList<Link>();
		links4.add(new Link("top:75%;left:80%", "?room=2", "Accueil"));
		Room room4 = new Room(4, "20181219_101107.jpg", "Polaroid", links4);
		
		List<Link> links5 = new ArrayList<Link>();
		links5.add(new Link("top:40%;left:80%", "?room=2", "Accueil"));
		Room room5 = new Room(5, "20181219_101220.jpg", "Labo", links5);
		
		List<Link> links6 = new ArrayList<Link>();
		links6.add(new Link("top:80%;left:60%", "?room=2", "Accueil"));
		links6.add(new Link("top:80%;left:20%", "?room=7", "Descendre"));
		Room room6 = new Room(6, "20181219_101417.jpg", "Spectacle", links6);
		
		List<Link> links7 = new ArrayList<Link>();
		links7.add(new Link("top:80%;left:30%", "?room=2", "Accueil"));
		links7.add(new Link("top:40%;left:80%", "?room=8", "Atelier"));
		links7.add(new Link("top:40%;left:5%", "?room=9", "FabLab"));
		Room room7 = new Room(7, "48414226_812494072425017_6965448789511372800_n.jpg", "Sous-sol", links7);
		
		List<Link> links8 = new ArrayList<Link>();
		links8.add(new Link("top:70%;left:30%", "?room=7", "Sous-sol"));
		Room room8 = new Room(8, "20181219_102818.jpg", "Atelier", links8);
		
		
		List<Link> links9 = new ArrayList<Link>();
		links9.add(new Link("top:70%;left:60%", "?room=7", "Sous-sol"));
		Room room9 = new Room(9, "20181219_102054.jpg", "FabLab", links9);
		
		
		List<Link> links10 = new ArrayList<Link>();
		links10.add(new Link("top:70%;left:60%", "?room=3", "FeedBar"));
		Room room10 = new Room(10, "20181219_100856.jpg", "Galerie", links10);
		
		
		rooms.add(room1);
		rooms.add(room2);
		rooms.add(room3);
		rooms.add(room4);
		rooms.add(room5);
		rooms.add(room6);
		rooms.add(room7);
		rooms.add(room8);
		rooms.add(room9);
		rooms.add(room10);
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
