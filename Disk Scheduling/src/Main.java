import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import Scheduling.C_Look;
import Scheduling.C_SCAN;
import Scheduling.Disk_Scheduling;
import Scheduling.FCFS;
import Scheduling.SCAN;
import Scheduling.SSTF;


public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		Disk_Scheduling scheduler;
		
		FileReader test = new FileReader("test.txt");
		BufferedReader trainbuf = new BufferedReader(test);
		Scanner sc = new Scanner(test);
		
		int initial = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> requests = new ArrayList<Integer>();
		
		for (int i = 0; i < k; i++) {
			requests.add(sc.nextInt());			
		}
		
		Main_Window frame = new Main_Window(initial,requests);
		frame.setVisible(true);
		
		/////////////////////////////////////////////////
		// test SSTF
//		scheduler = new SSTF(initial, (ArrayList<Integer>) requests.clone());
//		int []arr = scheduler.schedule();
//		System.out.println("SSTF");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		
//		scheduler = new FCFS(initial, (ArrayList<Integer>) requests.clone());
//		int []arr2 = scheduler.schedule();
//		System.out.println("FCFS");
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i] + " ");
//		}
//		System.out.println();
//		
//		
//		scheduler = new C_Look(initial, (ArrayList<Integer>) requests.clone());
//		int []arr3 = scheduler.schedule();
//		System.out.println("C Look");
//		for (int i = 0; i < arr3.length; i++) {
//			System.out.print(arr3[i] + " ");
//		}
//		System.out.println();
//		
//		scheduler = new C_SCAN(initial, (ArrayList<Integer>) requests.clone());
//		int []arr4 = scheduler.schedule();
//		System.out.println("C_Scan");
//		for (int i = 0; i < arr4.length; i++) {
//			System.out.print(arr4[i] + " ");
//		}
//		System.out.println();
//		
//		
//		scheduler = new SCAN(initial, (ArrayList<Integer>) requests.clone());
//		int []arr5 = scheduler.schedule();
//		System.out.println("SCAN");
//		for (int i = 0; i < arr5.length; i++) {
//			System.out.print(arr5[i] + " ");
//		}
//		System.out.println();
	}

}
