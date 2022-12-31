package com.placements.collection;

import java.util.ArrayList;

public class Theatre {
	private String theatreName;
	private ArrayList<Seat> seats=new ArrayList<>();

	public Theatre (String theatreName,int RowNum,int seatsPerRow){
		System.out.println("inside theatre constructor");
		theatreName=this.theatreName;
		int lastRow='A'+(RowNum);
		for (char row = 'A'; row <lastRow ; row++) {
			for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
			Seat seat=new Seat(row+String.format("%02d",seatNum),false);
			seats.add(seat);
			}

		}
	}
	public String getName(){
		return theatreName;
	}
	public void reserveSeat(String seatNo){
		for (Seat seat:seats){
			if (seatNo.equalsIgnoreCase(seat.getSeatArrangement()) && !seat.getReserved()) {
				seat.reserve();
			}

		}
	}

	public ArrayList<Seat> getSeats() {
		for (Seat seat:seats){
			System.out.println(seat.seatArrangement +"--"+seat.getReserved());
		}
		return seats;
	}
}
