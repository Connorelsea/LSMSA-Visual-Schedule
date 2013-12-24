package elsealabs.eutil.schedule;

public class Program {
	
	public static void main(String[] args) {
		
		InputParser IP = new InputParser();
		
		TimeDayHolder tdh1 = null;
		
		try {
			tdh1 = IP.parseInput("2w");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Course c1 = new Course();
		c1.setName("History");
		c1.setTimeDayHolder(tdh1);
		c1.validate();
		
	}
	
}