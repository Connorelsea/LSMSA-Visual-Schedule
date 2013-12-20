package elsealabs.eutil.schedule;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
	
	public static void main(String[] args) {
		
		InputParser IP = new InputParser();
		TimeDayHolder TDH = new TimeDayHolder();
		
		try {
			TDH = (TimeDayHolder) IP.parseInput("2(M,W,F) 3(T)");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i <= TDH.getDays().size() - 1; i++) {
			System.out.println(TDH.getDays().get(i + 1).getString() + "\n" + TDH.getTimes().get(i + 1).getHour());
		}
		
	}
	
}