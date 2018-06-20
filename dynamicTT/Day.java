package dynamicTT;

import java.util.ArrayList;

public class Day {
	//private String name;
	private ArrayList <TimeSlot> timeSlot=new ArrayList();
	
	public ArrayList<TimeSlot> getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(ArrayList<TimeSlot> timeSlot) {
		this.timeSlot = timeSlot;
	}

	public Day(String inputname){
//		this.setName(inputname);
		for(int i=7; i<18; i++){
			
			TimeSlot ts=new TimeSlot(/*i*/);
			timeSlot.add(ts);
			
			
		}

	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
}
