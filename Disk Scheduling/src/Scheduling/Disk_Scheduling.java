package Scheduling;
import java.util.*;

public abstract class Disk_Scheduling {
	protected int initialState;
	protected ArrayList<Integer>requests;
	
	
	public Disk_Scheduling(int initialState, ArrayList<Integer> requests) {
		super();
		this.initialState = initialState;
		this.requests = requests;
	}


	public abstract int[] schedule();
	
}
