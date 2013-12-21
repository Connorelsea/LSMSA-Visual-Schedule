package elsealabs.eutil.schedule;

import java.io.Serializable;

public class Schedule implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private CourseContainer COURSE_CONTAINER;
	
	public Schedule() {
		COURSE_CONTAINER = new CourseContainer();
	}
	
	public CourseContainer getCourseContainer() {
		return COURSE_CONTAINER;
	}

}