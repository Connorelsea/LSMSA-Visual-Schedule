package elsealabs.eutil.schedule;

/**
 *  <b>Time.class</b></br>
 *  <i>Represents a static time during the day accurate to the minute</i></br>
 *  </br>
 *  Represents a static time during the day accurate to the minute that can
 *  be compared with other Time objects.</br>
 * 
 * 	@creator Connor Elsea
 *  @author Elsea Labs
 *  @version 2.0
 */
public class Time implements Comparable<Time> {
	
	private int HOUR;
	private int MIN;
	private int TIME_SECTOR;
	
	private int COMPARISON_TYPE;
	public final int COMPARISON_ASCENDING = 0;
	public final int COMPARISON_DESCENDING = 1;
	
	public Time(int hour, int min, int timeSector) {
		
		HOUR = hour;
		MIN = min;
		TIME_SECTOR = timeSector;
		COMPARISON_TYPE = COMPARISON_ASCENDING;
		
	}
	
	public Time(int hour, int min, int timeSector, int comparisonType) {
		
		HOUR = hour;
		MIN = min;
		TIME_SECTOR = timeSector;
		COMPARISON_TYPE = comparisonType;
		
	}
	
	/**
	 *  <b>compareTo()</b></br>
	 *  <i>Compares two Time objects.</i></br>
 	 *  </br>
 	 *  Compares the Time object calling the method to the Time object
	 *  given in the method arguments. If this Time is greater than
	 *  the argument time, it returns 1, if the Time is less than it
	 *  returns -1, if they are equal it returns 0.</br>
	 * 
	 * @version 2.0
	 * @param other The time to be compared against
	 * @return Returns 1 if object is past argument, -1 if before, 0 if equal
	 */
	public int compareTo(Time other) {
		
		short greater = 1;
		short less = -1;
		
		if (COMPARISON_TYPE == COMPARISON_DESCENDING) {
			greater = -1;
			less = 1;
		}

		if (this.getTimeSector() != other.getTimeSector()) {
			if (this.getTimeSector() < other.getTimeSector()) return less; else return greater;
		} else {
			
			if (this.getHour() != other.getHour()) {
				if (this.getHour() < other.getHour()) return less; else return greater;
			} else {
				
				if (this.getMin() < other.getMin()) {
					return less;
				} else {
					if (this.getMin() > other.getMin()) return greater;
					if (this.getMin() == other.getMin()) return 0;
					return -2;
				}
			}
			
		}
		
	}
	
	/**
	 *  <b>setComparison()</b></br>
	 *  <i>Set the comparison type to use when compared as a collection.</i></br>
	 * 
	 * @version 2.0
	 * @param type The comparison type
	 */
	public void setComparison(int type) {
		COMPARISON_TYPE = type;
	}
	
	public void display() {
		System.out.printf("%d:%d", getHour(), getMin());
		if (getTimeSector() == 0) System.out.printf(" AM"); else System.out.printf(" PM");
	}
	
	public int getHour() {
		return HOUR;
	}
	
	public int getMin() {
		return MIN;
	}
	
	public int getTimeSector() {
		return TIME_SECTOR;
	}

}