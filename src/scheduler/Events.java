package scheduler;

public class Events {
	String time;
	String event;
	public Events(String time, String event) {
		this.time = time;
		this.event=event;
	}
	String getTime() {
		return time;
	}
	String getEvent() {
		return event;
	}
	public void setTime(String time) {
		this.time=time;
	}
	public void setEvent(String event) {
		this.event=event;
	}
}
