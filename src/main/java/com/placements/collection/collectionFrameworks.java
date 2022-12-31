package com.placements.collection;

public class collectionFrameworks {


	public static void main(String[] args) {
		Theatre theatre=new Theatre("olympian",3,2);
	System.out.println(theatre.getSeats().get(0).getReserved());
		theatre.getSeats().get(0).reserve();
		theatre.getSeats().get(0).reserve();
//		System.out.println(theatre.getSeats().get(0).getReserved());
		theatre.getSeats().get(0).cancel();
//		System.out.println(theatre.getSeats().get(0).getReserved());
		System.out.println(theatre.getSeats().get(0).seatArrangement);


	}

}
