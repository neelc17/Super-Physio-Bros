/*
 * Neel Chaudhari, Jay Ray
 * Per. 6, 3
 * 4/21/15
 * Super Physio Bros.
 * Game in 5 Weeks project
 * SPBHomeHelp.java
 * Has the Home JPanel and the Help JPanel
 */

import java.awt.*;  //import libraries
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.util.*;
import java.net.URL;

public class SPBHomeHelp{  //SPBHomeHelp class header
	
	Home h;  //declare variables
	Help he;
	Base ba;
	URL url;
	
	public SPBHomeHelp(Base b){  //constructor
		
		//initialize variables
		
		System.out.println("Entered SPBHomeHelp Constructor");  //test if it entered constructor (println)
		
		ba = b;
		h = new Home();  
		he = new Help();
		
	}
	


	public class Home extends JPanel implements ActionListener, MouseListener{
		
		//declare variables, components, objects
		JLabel authors;
		JLabel pls;
		Image logo;
		Image mario;
		Image peach;
		JButton begin;
		JButton helpPage;
		boolean marSelect;
		boolean peaSelect;
		

		public Home(){  //constructor
		
			marSelect = false;  //initialize variables
			peaSelect = false;
			
			System.out.println("Entered Home Constructor");
			setLayout(null);  //setLayout to null so components can be placed in specific spots
			
			//instantiate components
			authors = new JLabel("by Neel Chaudhari and Jay Ray");
			pls = new JLabel("Please select a character");
			begin = new JButton("Begin!");
			helpPage = new JButton("Help");
			
			authors.setFont(new Font("Times", Font.BOLD, 15));
			authors.setBounds(240, 90, 250, 20);	
			pls.setFont(new Font("Times", Font.PLAIN, 15));
			pls.setForeground(Color.red);
			pls.setBounds(265, 500, 300, 30);
			pls.setVisible(false);
			begin.setBounds(200, 550, 100, 50);	
			helpPage.setBounds(400, 550, 100, 50);
			
			addMouseListener(this);
			begin.addActionListener(this);
			helpPage.addActionListener(this);
			
			url = SPBHomeHelp.class.getResource("spblogo.png");
			logo = Toolkit.getDefaultToolkit().getImage(url);
			url = SPBHomeHelp.class.getResource("drmario.png");
			mario = Toolkit.getDefaultToolkit().getImage(url);
			url = SPBHomeHelp.class.getResource("drpeach.png");
			peach = Toolkit.getDefaultToolkit().getImage(url);
			
			//add components
			add(authors);
			add(pls);
			add(begin);
			add(helpPage);
			
		}
		
		public void paintComponent(Graphics g){  //paintComponent
			
			super.paintComponent(g);
			
			g.drawImage(logo, 225, 10, 250, 75, this);
			g.drawString("Click on a character to play as him or her", 240, 150);
			g.drawImage(mario, 150, 200, 150, 275, this);
			g.drawImage(peach, 400, 200, 150, 275, this);
			
			g.setFont(new Font("Times", Font.PLAIN, 11));
			
			if(marSelect){
			
				g.drawString("Character selected:", 300, 250);
				g.drawString("Dr. Mario", 320, 270);
				
			}
			
			else if(peaSelect){
			
				g.drawString("Character selected:", 300, 250);
				g.drawString("Nurse Peach", 310, 270);
				
			}
			
			else{
			
				g.drawString("Character selected:", 300, 250);
				g.drawString("none", 340, 270);
				
			}
			

		}
		
		public boolean sendSelect()
		{
			if(marSelect)
				return true;
			else
				return false;				
		}
		
		public void mouseClicked(MouseEvent e){  //mouseClicked
	
			int x = e.getX();
			int y = e.getY();

			if((x >= 150 && x <= 300) && (y >= 200 && y <= 475)){
			
				marSelect = true;
				peaSelect = false;
				
				pls.setVisible(false);
				
			}
			
			if((x >= 400 && x <= 550) && (y >= 200 && y <= 475)){
			
				peaSelect = true;
				marSelect = false;
				
				pls.setVisible(false);
				
			}
			
			repaint();
			
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
		
		public void actionPerformed(ActionEvent e){  //actionPerformed
		
			if(e.getSource() == begin){  //if begin button pressed
			
				if(!marSelect && !peaSelect){
				
					pls.setVisible(true);
					
				}
				
				else{
					
					pls.setVisible(false);
					ba.showChooseSystem(marSelect, peaSelect);    //switch to choose systems panel
				
				}	
					
			}
			
			if(e.getSource() == helpPage){  //if help button pressed
			
				ba.showHelp();  //switch to help panel
					
			}
			
		}
		
	}
 
	public class Help extends JPanel implements ActionListener{  //Help class header extends JPanel

		JLabel title;  //declare components, variables
		JLabel description;
		String info;  //string will be read using File IO, contains the help instructions
		JButton back;
		
		Scanner readIt;
	
		public Help(){  //constructor
			
			System.out.println("Entered Help Constructor");  //test if it entered constructor (println)
		
			setLayout(null);  //setLayout
		
			title = new JLabel("Help Page");  //instantiate components
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("HelpText.txt"));  //instantiate Scanner with parameter Cells.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("HelpText.txt not found");  //to catch FileNotFoundException
			
			}
			
			info = readIt.nextLine();
			
			description = new JLabel(info);  //make description JLabel have info string
			
			back = new JButton("Back to Home");
			
			description.setFont(new Font("Times", Font.PLAIN, 12));
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(325, 50, 100, 100);
			description.setBounds(50, 100, 500, 500);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			
			//initialize variables
			
			add(title);  //add components
			add(description);
			add(back);
			
			repaint();
		
		}
		//JLabel to display instructions
		
		public void actionPerformed(ActionEvent e){
		
			ba.showHome();
				
		}
		
	}
	
}	
