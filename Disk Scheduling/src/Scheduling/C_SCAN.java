package Scheduling;
import java.util.ArrayList;
import java.util.Collections;


public class C_SCAN extends Disk_Scheduling {

	public C_SCAN(int initialState, ArrayList<Integer> requests) {
		super(initialState, requests);
		
	}

	@Override
	public int[] schedule() {
		// when adding first cylinder and last one we can use c_Look
		requests.add(0, 0);
		requests.add(199);
		
		return (new C_Look(initialState, requests).schedule());
	}

}
