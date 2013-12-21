package elsealabs.eutil.schedule;

import java.io.Serializable;

public class Course implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String PROGRAM_ID;
	
	private String TEACHER;
	private String NAME;
	private String ROOM;

	private TimeDayHolder TD_HOLDER;
	
	private boolean VALIDATED;
	private boolean HAS_TEACHER;
	private boolean HAS_ROOM;
	private boolean HAS_NAME;
	private boolean HAS_TIME;
	private boolean HAS_DAY;
	
	public Course() {
		
		VALIDATED = false;
		HAS_TEACHER = false;
		HAS_ROOM = false;
		HAS_TIME = false;
		HAS_DAY = false;
	}
	
	public boolean validate() {
		
		if (!HAS_DAY || !HAS_TIME || !HAS_NAME) {
			VALIDATED = false;
			return VALIDATED;
		}
		
		if (HAS_TEACHER == false) setTeacher("Unknown");
		if (HAS_ROOM == false) setRoom("Unknown");
		
		generatePID();
		VALIDATED = true;
		return VALIDATED;
	}
	
	public boolean isValidated() {
		return VALIDATED;
	}
	
	private void generatePID() {
		setPID(NAME.replaceAll("\\s+",""));
	}
	
	public String getTeacher() {
		return TEACHER;
	}
	
	public void setTeacher(String teacher) {
		TEACHER = teacher;
	}
	
	public String getName() {
		return NAME;
	}
	
	public void setName(String name) {
		NAME = name;
	}
	
	public String getRoom() {
		return ROOM;
	}
	
	public void setRoom(String room) {
		ROOM = room;
	}
	
	public TimeDayHolder getTimeDayHolder() {
		return TD_HOLDER;
	}
	
	public void setTimeDayHolder(TimeDayHolder tdHolder) {
		TD_HOLDER = tdHolder;
	}

	public String getPID() {
		return PROGRAM_ID;
	}

	public void setPID(String pid) {
		PROGRAM_ID = pid;
	}
	
}