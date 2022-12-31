package com.placements.collection;

public class Seat {
	String seatArrangement;
	Boolean reserved=false;
	public Seat(){};

	public Seat(String seatArrangement,Boolean reserved) {
		System.out.println("inside seat constructor");
		this.seatArrangement = seatArrangement;
		this.reserved=reserved;
	}
	public boolean reserve(){
		if (this.reserved == false) {
			this.reserved=true;
			System.out.println("your seat has been reserved");
		}
		else {
			System.out.println("seat is already reserved");
		}
		return this.reserved;

	}
	public boolean cancel(){
		if (this.reserved==true){
			System.out.println("Booking cancelled");
			this.reserved=false;

		}
		else {
			System.out.println("please book to cancel");
		}
		return this.reserved;
	}

	public String getSeatArrangement() {
		return seatArrangement;
	}

	public Boolean getReserved() {
		return reserved;
	}
}
