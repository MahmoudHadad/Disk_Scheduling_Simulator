package Scheduling;
import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.Collections;


public class C_Look extends Disk_Scheduling {

	public C_Look(int initialState, ArrayList<Integer> requests) {
		super(initialState, requests);
		
	}

	@Override
	public int[] schedule() {
		int totalDistance = 0;
		int[] path = new int[1 + requests.size()] ;
		
		// i will move from the initialState to right tell end then i will go back to the beginning
		
		Collections.sort(requests);
		//System.out.println(requests);
		// assume that the requests initially goes from left to right
		int startIndex =0;
		// search for start request
		for (int i = 0; i < requests.size(); i++) {	
			if(requests.get(i)>=initialState)
			{
				startIndex = i;
				break;
			}
		}
		
		int iterator = 1;
		totalDistance+= Math.abs(initialState - requests.get(startIndex));
		
		for (int i = startIndex; i < requests.size()-1; i++, iterator++) {
			totalDistance+= Math.abs(requests.get(i+1) - requests.get(i));
			path[iterator] = requests.get(i);
		}
		// to add the last request
		path[iterator] = requests.get(requests.size()-1);
		iterator++;
		totalDistance+= Math.abs(requests.get(requests.size()-1) - requests.get(0));
		// start from begining
		for (int i = 0; i < startIndex-1; i++, iterator++) {
			totalDistance+= Math.abs(requests.get(i+1) - requests.get(i));
			path[iterator] = requests.get(i);
		}
		path[iterator] = requests.get(startIndex-1);
		
		path[0]=totalDistance;
		

		return path;
	}

}
