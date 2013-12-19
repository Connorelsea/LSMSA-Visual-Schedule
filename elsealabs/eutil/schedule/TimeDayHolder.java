package elsealabs.eutil.schedule;

import java.util.HashMap;

public class TimeDayHolder {
	
	private HashMap<Integer, Time> TIMES;
	private HashMap<Integer, Day> DAYS;
	private int GLOBAL_COUNTER;
	
	public TimeDayHolder() {
		TIMES = new HashMap<Integer, Time>();
		DAYS = new HashMap<Integer, Day>();
		GLOBAL_COUNTER = 0;
	}
	
	public void addSet(Day day, Time time) {
		GLOBAL_COUNTER += 1;
		DAYS.put(GLOBAL_COUNTER, day);
		TIMES.put(GLOBAL_COUNTER, time);
	}
	
	public HashMap<Integer, Time> getTimes() {
		return TIMES;
	}
	
	public HashMap<Integer, Day> getDays() {
		return DAYS;
	}

}