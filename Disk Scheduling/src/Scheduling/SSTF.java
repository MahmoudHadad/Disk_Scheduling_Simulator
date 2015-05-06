package Scheduling;
import java.util.ArrayList;


public class SSTF extends Disk_Scheduling {
	

	public SSTF(int initialState, ArrayList<Integer> requests) {
		super(initialState, requests);
		
	}

	@Override
	public int[] schedule() {
		int totalMoves = 0;
		
		int []result = new int[1 + requests.size()];
		int iterator = 1;
		
		while(! requests.isEmpty())
		{
			int index = 0;
			int min = Math.abs(initialState - requests.get(0));
			
			for(int i=1;i<requests.size();i++)
			{
				if(Math.abs(initialState - requests.get(i)) < min)
				{
					min = Math.abs(initialState - requests.get(i));
					index = i;
				}
			}
			totalMoves += min;
			initialState = requests.get(index);
			requests.remove(index);
			result[iterator] = initialState;
			iterator++;
			
		}
		result[0] = totalMoves;
		
		return result;
	}

}
