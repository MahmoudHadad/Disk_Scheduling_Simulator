import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

public class ViewWindow extends JFrame {

	private JPanel contentPane;
	private int []toBeDrawen;

	public ViewWindow(int []toBeDrawen, String Title) {
		super(Title);
		this.toBeDrawen = toBeDrawen;
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 434);
		contentPane = new DrawPane(toBeDrawen);
		
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Total Distance:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 141, 38);
		contentPane.add(lblNewLabel);
		
		JLabel distance = new JLabel("");
		distance.setFont(new Font("Tahoma", Font.BOLD, 18));
		distance.setBounds(155, 11, 173, 38);
		contentPane.add(distance);
		distance.setText(String.valueOf(toBeDrawen[0]));
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(10, 60, 300, 35);
		contentPane.add(label);
		
		String s = "";
		for (int i = 1; i < toBeDrawen.length; i++) {
			s = s + toBeDrawen[i] + " ";
		}
		label.setText(s);
	}

	
	class DrawPane extends JPanel{
		private int []toBeDrawen;
		
		public DrawPane(int []toBeDrawen)
		{
			this.toBeDrawen = toBeDrawen;
			setBackground(Color.WHITE);
		}
        public void paintComponent(Graphics g){
        	int x =0, y =120;
    		g.setColor(Color.black);
    		
    		for (int i = 1; i < toBeDrawen.length-1; i++, y+=20) {
    			g.drawString(String.valueOf(toBeDrawen[i]), toBeDrawen[i]*3, y);
    			g.drawLine(toBeDrawen[i]*3, y, toBeDrawen[i+1]*3, y+20);
			}
    		g.drawString(String.valueOf(toBeDrawen[toBeDrawen.length-1]), toBeDrawen[toBeDrawen.length-1]*3, y);
         }
     }
}
