package com.techelevator;

public class Airplane {

	private String planeNumber;
	private int bookedFirstClassSeats = 0;
	private int totalFirstClassSeats;
	private int bookedCoachSeats = 0;
	private int totalCoachSeats;

	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}

	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if (forFirstClass) {
			if (totalNumberOfSeats > getAvailableFirstClassSeats()) {
				return false;
			}
				bookedFirstClassSeats = totalNumberOfSeats + bookedFirstClassSeats;
				
			} else {
				if (totalNumberOfSeats > getAvailableCoachSeats()) {
				return false;
			}
				bookedCoachSeats = totalNumberOfSeats + bookedCoachSeats;
			} 
			
			return true;

	}


	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
	public int getAvailableFirstClassSeats() {
		if (totalFirstClassSeats - bookedFirstClassSeats > 0) {
		return totalFirstClassSeats - bookedFirstClassSeats;
		}
	 return 0;
	}
	
	public int getAvailableCoachSeats() {
		if (totalCoachSeats - bookedCoachSeats > 0) {
		return totalCoachSeats - bookedCoachSeats;
		}
	 return 0;
	}
}
