import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Scheduling.*;

public class Main_Window extends JFrame {

	private JPanel contentPane;
	static private ArrayList<Integer> requests = null;
	static private int initialState = 0;
	/**
	 * Create the frame.
	 */
	public Main_Window(int initialState, ArrayList<Integer> requests) {
		this.requests = requests;
		this.initialState = initialState;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 200, 291, 316);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton fcfs = new JButton("FCFS");
		fcfs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ViewWindow( ( new FCFS(Main_Window.initialState, (ArrayList<Integer>) Main_Window.requests.clone()).schedule() ) , "FCFS");
			}
		});
		
		fcfs.setForeground(Color.BLUE);
		fcfs.setFont(new Font("Tahoma", Font.BOLD, 18));
		fcfs.setBounds(10, 22, 130, 23);
		contentPane.add(fcfs);
		
		JButton sstf = new JButton("SSTF");
		sstf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ViewWindow( ( new SSTF(Main_Window.initialState, (ArrayList<Integer>) Main_Window.requests.clone()).schedule()), "SSTF" );
			}
		});
		sstf.setForeground(Color.BLUE);
		sstf.setFont(new Font("Tahoma", Font.BOLD, 18));
		sstf.setBounds(10, 68, 130, 23);
		contentPane.add(sstf);
		
		JButton scan = new JButton("SCAN");
		scan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ViewWindow( ( new SCAN(Main_Window.initialState, (ArrayList<Integer>) Main_Window.requests.clone()).schedule() ) , "SCAN");
			}
		});
		scan.setForeground(Color.BLUE);
		scan.setFont(new Font("Tahoma", Font.BOLD, 18));
		scan.setBounds(10, 114, 130, 23);
		contentPane.add(scan);
		
		JButton c_scan = new JButton("C_SCAN");
		c_scan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ViewWindow( ( new C_SCAN(Main_Window.initialState, (ArrayList<Integer>) Main_Window.requests.clone()).schedule() ), "C_SCAN" );
			}
		});
		c_scan.setForeground(Color.BLUE);
		c_scan.setFont(new Font("Tahoma", Font.BOLD, 18));
		c_scan.setBounds(10, 158, 130, 23);
		contentPane.add(c_scan);
		
		JButton c_look = new JButton("C_Look");
		c_look.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ViewWindow( ( new C_Look(Main_Window.initialState, (ArrayList<Integer>) Main_Window.requests.clone()).schedule() ), "C_Look" );
			}
		});
		c_look.setForeground(Color.BLUE);
		c_look.setFont(new Font("Tahoma", Font.BOLD, 18));
		c_look.setBounds(10, 202, 130, 23);
		contentPane.add(c_look);
		
		
		
		
	}
}
