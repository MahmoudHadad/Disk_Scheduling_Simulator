package Scheduling;
import java.util.ArrayList;
import java.util.Collections;


public class SCAN extends Disk_Scheduling {

	public SCAN(int initialState, ArrayList<Integer> requests) {
		super(initialState, requests);
		
	}

	@Override
	public int[] schedule() {
		int totalDistance = 0;
		
		requests.add(199);
		int []path = new int [requests.size() + 1];
		Collections.sort(requests);

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
		
		
		totalDistance+= Math.abs(requests.get(requests.size()-1) - requests.get(startIndex -1));
		for (int i = startIndex-1; i > 0; i--, iterator++) {

			totalDistance+= Math.abs(requests.get(i-1) - requests.get(i));
			path[iterator] = requests.get(i);
		}
		path[iterator] = requests.get(0);
		
		
		path[0] = totalDistance;
		return path;

	}

}
