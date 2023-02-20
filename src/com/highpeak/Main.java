package com.highpeak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	ArrayList<Job> l=new ArrayList<Job>(); //Created array-list objects to store list of jobs.
	public void addJob(Job j) {
		l.add(j); //adding job objects into array-list

	}

	public void function() {
		for(int i=0;i<=l.size()-1;i++) {
			for(int j=1;j<=l.size()-1;j++) {

				if(l.get(i).equals(l.get(j))){

					l.remove(i);

				}
			}
		}

		Collections.sort(l); //Calling compareTo() explicitly in order to perform sorting logic.

		l.remove(l.size()-1); // removing highest earning job object 
		int sum=0;
		for(Job js:l) {
			sum=sum+js.earning; //adding the remaining job earnings
		}
		System.out.println("The number of task and earnings available for others");
		System.out.println("Task: "+l.size());  //printing the number if task.
		System.out.println("Earnings: " +sum);  //printing remaining earnings.

	}

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in); //created scanner class object to accept user inputs.
		Main m=new Main();
		System.out.println("Enter no. of jobs");
		int job=sc.nextInt();
		while(true) {

			System.out.println("1:Add jobs  Details\n2:Get output");
			System.out.println("Enter choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:{   //adding job details
				int max_job=100;
				System.out.println("Start Time");
				int n1=sc.nextInt();
				System.out.println("End Time");
				int n2=sc.nextInt();
				System.out.println("Earning");
				int n3=sc.nextInt();
				if(job<=max_job) {
					m.addJob(new Job(n1,n2,n3));
				}
			}
			break;
			case 2:{ //to display result.
				m.function();
			}
			}
		}
	}
}
