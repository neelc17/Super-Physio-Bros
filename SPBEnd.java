/*
 * Neel Chaudhari, Jay Ray
 * Per. 6, 3
 * 4/21/15
 * Super Physio Bros.
 * Game in 5 Weeks project
 * SPBEnd.java
 * Has the End JPanel
 */

import java.awt.*;  //import libraries
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JPanel;
import java.net.URL;

class SPBEnd extends JPanel implements ActionListener{  //SPBEnd class header
	
	Base ba;
	boolean marS;
	boolean peaS;
	String whichLevel;
	int seconds;
	int points;
	Image marTalk;
	Image peaTalk;
	Image speech;
	URL url;
	JLabel title;
	JButton back;
	JLabel info;
	
	//declare variables,objects,components
	
	public SPBEnd(Base b){  //constructor
		
		removeAll();
		
		setLayout(null);
		
		ba = b;
		
		System.out.println("Entered SPBEnd Constructor");  //test if it entered constructor (println)
	   whichLevel = "";
	   seconds = 0;
	   points = 0;
		title = new JLabel("You Finished!");
		title.setFont(new Font("Times", Font.BOLD, 15));
		title.setBounds(400, 50, 200, 100);
		info = new JLabel();
		info.setFont(new Font("Times", Font.BOLD, 15));
		info.setBounds(200, 200, 400, 400);
		back = new JButton("Back to Home");
		back.setBounds(250, 550, 200, 50);
		back.addActionListener(this);
		url = SPBStudy.class.getResource("marTalk.gif");
		marTalk = Toolkit.getDefaultToolkit().getImage(url);
		url = SPBStudy.class.getResource("peaTalk.gif");
		peaTalk = Toolkit.getDefaultToolkit().getImage(url);
		url = SPBStudy.class.getResource("speech.png");
		speech = Toolkit.getDefaultToolkit().getImage(url);
	   
		add(title);
		add(back);
		add(info);
		//initialize variables
		//instantiate objects
		//instantiate components
		
		revalidate();
		repaint();
	
	}
	
	public void paintComponent(Graphics g){  //paintComponent method 
		
		super.paintComponent(g);
		
		if(marS && !peaS){
				
			g.drawImage(marTalk, 0, 0, this);
			g.drawImage(speech, 100, 0, 200, 150, this);
			g.drawString("Click ", 140, 90);
			g.drawString("'Back to Home' to go", 120, 100);
			g.drawString("back to the home page", 140, 110);
				
		}
			
		else if(!marS && peaS){
				
			g.drawImage(peaTalk, 0, 0, 100, 200, this);
			g.drawImage(speech, 100, 0, 200, 150, this);
			g.drawString("Click ", 140, 90);
			g.drawString("'Back to Home' to go", 120, 100);
			g.drawString("back to the home page", 140, 110);
				
		}
		
		//uses drawString() to print all the strings
		//uses variables saved from SPBQuiz to get info (time, difficulty)
		
	}
	
	public void actionPerformed(ActionEvent e){
	
		ba.showHome();
		
	}
	
}
