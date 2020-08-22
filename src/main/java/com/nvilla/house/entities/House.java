package com.nvilla.house.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity @Table ( name="house")
public class House {
	
	 
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column( name="id_house")
	private String idHouse;
	
	private String nameHouse;
	
	private double size;
	
	private int nbrePiece ;
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, 
				fetch=FetchType.LAZY, mappedBy="house")
	private Collection<Room> rooms ;

	/**
	 * 
	 */
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idHouse
	 * @param nameHouse
	 * @param size
	 * @param nbrePiece
	 * @param rooms
	 */
	public House(String idHouse, String nameHouse, double size, int nbrePiece, Collection<Room> rooms) {
		super();
		this.idHouse = idHouse;
		this.nameHouse = nameHouse;
		this.size = size;
		this.nbrePiece = nbrePiece;
		this.rooms = rooms;
	}

	/**
	 * @return the idHouse
	 */
	public String getIdHouse() {
		return idHouse;
	}

	/**
	 * @param idHouse the idHouse to set
	 */
	public void setIdHouse(String idHouse) {
		this.idHouse = idHouse;
	}

	/**
	 * @return the nameHouse
	 */
	public String getNameHouse() {
		return nameHouse;
	}

	/**
	 * @param nameHouse the nameHouse to set
	 */
	public void setNameHouse(String nameHouse) {
		this.nameHouse = nameHouse;
	}

	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}

	/**
	 * @return the nbrePiece
	 */
	public int getNbrePiece() {
		return nbrePiece;
	}

	/**
	 * @param nbrePiece the nbrePiece to set
	 */
	public void setNbrePiece(int nbrePiece) {
		this.nbrePiece = nbrePiece;
	}

	/**
	 * @return the rooms
	 */
	public Collection<Room> getRooms() {
		return rooms;
	}

	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(Collection<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "House [idHouse=" + idHouse + ", nameHouse=" + nameHouse + ", size=" + size + ", nbrePiece=" + nbrePiece
				+ ", rooms=" + rooms + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idHouse == null) ? 0 : idHouse.hashCode());
		result = prime * result + ((nameHouse == null) ? 0 : nameHouse.hashCode());
		result = prime * result + nbrePiece;
		result = prime * result + ((rooms == null) ? 0 : rooms.hashCode());
		long temp;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		House other = (House) obj;
		if (idHouse == null) {
			if (other.idHouse != null) {
				return false;
			}
		} else if (!idHouse.equals(other.idHouse)) {
			return false;
		}
		if (nameHouse == null) {
			if (other.nameHouse != null) {
				return false;
			}
		} else if (!nameHouse.equals(other.nameHouse)) {
			return false;
		}
		if (nbrePiece != other.nbrePiece) {
			return false;
		}
		if (rooms == null) {
			if (other.rooms != null) {
				return false;
			}
		} else if (!rooms.equals(other.rooms)) {
			return false;
		}
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size)) {
			return false;
		}
		return true;
	}

	
	
}
