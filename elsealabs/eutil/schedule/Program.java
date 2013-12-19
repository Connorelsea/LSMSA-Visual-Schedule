package elsealabs.eutil.schedule;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
	
	public static void main(String[] args) {
		
		Time time1 = new Time(1, 30, 0);
		Time time2 = new Time(10, 30, 1);
		Time time3 = new Time(3, 40, 0);
		Time time4 = new Time(10, 40, 1);
		Time time5 = new Time(10, 50, 1);
		Time time6 = new Time(10, 04, 0);
		//System.out.println(time1.compareTo(time2));
		
		ArrayList<Time> arr = new ArrayList<Time>();
		arr.add(time3);
		arr.add(time2);
		arr.add(time1);
		arr.add(time4);
		arr.add(time5);
		arr.add(time6);
		
		Collections.sort(arr);
		
		for (Time t : arr) {
			t.display();
			System.out.printf("\n");
		}
		
		ArrayList<Day> days = new ArrayList<Day>();
		
		Day d1 = null;
		Day d2 = null;
		Day d3 = null;
		Day d4 = null;
		
		try {
			System.out.printf("Creating Days\n");
			d1 = new Day(4);
			d2 = new Day(2);
			d3 = new Day(5);
			d4 = new Day(4);
		} catch (Exception ex) {
			System.out.printf("Error\n");
			ex.printStackTrace();
		}
		
		days.add(d1);
		days.add(d2);
		days.add(d3);
		days.add(d4);
		
		Collections.sort(days);
		
		System.out.printf("\n");
		
		for (Day d : days) {
			System.out.printf("%d\n", d.getInt());
		}
		
	}
	
}