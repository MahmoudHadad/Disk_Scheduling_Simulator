package Scheduling;
import java.util.ArrayList;
import java.util.Arrays;

import com.sun.org.apache.xalan.internal.xsltc.dom.AbsoluteIterator;


public class FCFS extends Disk_Scheduling {
	

	public FCFS(int initialState, ArrayList<Integer> requests) {
		super(initialState, requests);
		
	}

	@Override
	public int[] schedule() {
		int totalDistance = Math.abs(initialState - requests.get(0));
		
		for (int i = 0; i < requests.size()-1; i++) {
			
			totalDistance += Math.abs((requests.get(i)-requests.get(i+1))); 
		}
	//	System.out.println(totalDistance);
		int[] path = new int[1+ requests.size()] ;
		path[0] = totalDistance;
		for (int i = 0; i < requests.size(); i++) {
			path[i+1] = requests.get(i);
		}
		
		return path;
	}

}
