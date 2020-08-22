package com.nvilla.house.entities;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ForeignKey;

public class Room {

	
	@SuppressWarnings("deprecation")
	@Id 
	@ForeignKey(name = "id_house")
    private int houseId;

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private int roomId;

    

    @ManyToOne(fetch=FetchType.LAZY ,  optional=false)
    @JoinColumn(name="id_house", insertable=false, updatable=false)
    private House house;
	
	private String idRoom ;
	
	private String nameRoom;
	
	private String position ; 
	
	
	private boolean is_principal ;
	
	private boolean has_access ;
	
	private boolean has_adjacent_room ;

	/**
	 * @return the houseId
	 */
	public int getHouseId() {
		return houseId;
	}

	/**
	 * @param houseId the houseId to set
	 */
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	/**
	 * @return the roomId
	 */
	public int getRoomId() {
		return roomId;
	}

	/**
	 * @param roomId the roomId to set
	 */
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	/**
	 * @return the house
	 */
	public House getHouse() {
		return house;
	}

	/**
	 * @param house the house to set
	 */
	public void setHouse(House house) {
		this.house = house;
	}

	/**
	 * @return the idRoom
	 */
	public String getIdRoom() {
		return idRoom;
	}

	/**
	 * @param idRoom the idRoom to set
	 */
	public void setIdRoom(String idRoom) {
		this.idRoom = idRoom;
	}

	/**
	 * @return the nameRoom
	 */
	public String getNameRoom() {
		return nameRoom;
	}

	/**
	 * @param nameRoom the nameRoom to set
	 */
	public void setNameRoom(String nameRoom) {
		this.nameRoom = nameRoom;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the is_principal
	 */
	public boolean isIs_principal() {
		return is_principal;
	}

	/**
	 * @param is_principal the is_principal to set
	 */
	public void setIs_principal(boolean is_principal) {
		this.is_principal = is_principal;
	}

	/**
	 * @return the has_access
	 */
	public boolean isHas_access() {
		return has_access;
	}

	/**
	 * @param has_access the has_access to set
	 */
	public void setHas_access(boolean has_access) {
		this.has_access = has_access;
	}

	/**
	 * @return the has_adjacent_room
	 */
	public boolean isHas_adjacent_room() {
		return has_adjacent_room;
	}

	/**
	 * @param has_adjacent_room the has_adjacent_room to set
	 */
	public void setHas_adjacent_room(boolean has_adjacent_room) {
		this.has_adjacent_room = has_adjacent_room;
	}

	@Override
	public String toString() {
		return "Room [houseId=" + houseId + ", roomId=" + roomId + ", house=" + house + ", idRoom=" + idRoom
				+ ", nameRoom=" + nameRoom + ", position=" + position + ", is_principal=" + is_principal
				+ ", has_access=" + has_access + ", has_adjacent_room=" + has_adjacent_room + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (has_access ? 1231 : 1237);
		result = prime * result + (has_adjacent_room ? 1231 : 1237);
		result = prime * result + ((house == null) ? 0 : house.hashCode());
		result = prime * result + houseId;
		result = prime * result + ((idRoom == null) ? 0 : idRoom.hashCode());
		result = prime * result + (is_principal ? 1231 : 1237);
		result = prime * result + ((nameRoom == null) ? 0 : nameRoom.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + roomId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Room other = (Room) obj;
		if (has_access != other.has_access) {
			return false;
		}
		if (has_adjacent_room != other.has_adjacent_room) {
			return false;
		}
		if (house == null) {
			if (other.house != null) {
				return false;
			}
		} else if (!house.equals(other.house)) {
			return false;
		}
		if (houseId != other.houseId) {
			return false;
		}
		if (idRoom == null) {
			if (other.idRoom != null) {
				return false;
			}
		} else if (!idRoom.equals(other.idRoom)) {
			return false;
		}
		if (is_principal != other.is_principal) {
			return false;
		}
		if (nameRoom == null) {
			if (other.nameRoom != null) {
				return false;
			}
		} else if (!nameRoom.equals(other.nameRoom)) {
			return false;
		}
		if (position == null) {
			if (other.position != null) {
				return false;
			}
		} else if (!position.equals(other.position)) {
			return false;
		}
		if (roomId != other.roomId) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 */
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param houseId
	 * @param roomId
	 * @param house
	 * @param idRoom
	 * @param nameRoom
	 * @param position
	 * @param is_principal
	 * @param has_access
	 * @param has_adjacent_room
	 */
	public Room(int houseId, int roomId, House house, String idRoom, String nameRoom, String position,
			boolean is_principal, boolean has_access, boolean has_adjacent_room) {
		super();
		this.houseId = houseId;
		this.roomId = roomId;
		this.house = house;
		this.idRoom = idRoom;
		this.nameRoom = nameRoom;
		this.position = position;
		this.is_principal = is_principal;
		this.has_access = has_access;
		this.has_adjacent_room = has_adjacent_room;
	}
	
	
	
	
}
