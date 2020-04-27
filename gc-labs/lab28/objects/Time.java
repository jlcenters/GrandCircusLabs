package co.grandcircus.lab28.objects;

import java.util.Arrays;


public class Time {

	
	private String[] startPeriodName;
	private String[] startValidTime;
	
	public String[] getStartValidTime() {
		return startValidTime;
	}
	public void setStartValidTime(String[] startValidTime) {
		this.startValidTime = startValidTime;
	}
	public String[] getStartPeriodName() {
		return startPeriodName;
	}
	public void setStartPeriodName(String[] startPeriodName) {
		this.startPeriodName = startPeriodName;
	}
	@Override
	public String toString() {
		return "Time [startPeriodName=" + Arrays.toString(startPeriodName) + "]";
	}

	
}
