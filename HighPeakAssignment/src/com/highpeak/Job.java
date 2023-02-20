package com.highpeak;

public class Job implements Comparable<Job>{ // Implemented comparable interface to override compareTo()
	int startTime;  
	int endTime;
	int earning;


	public Job(int startTime, int endTime, int earning) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.earning = earning;
	}

	@Override //overriden compareTo() to compare and sort the object in ascending order
	public int compareTo(Job j) {
		return this.earning-j.earning  ;
	}
	
}
