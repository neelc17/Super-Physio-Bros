/*
 * Neel Chaudhari, Jay Ray
 * Per. 6, 3
 * 4/21/15
 * Super Physio Bros.
 * Game in 5 Weeks project
 * SPBQuiz.java
 * Has the Quiz Panel
 */

import java.awt.*;  //import libraries
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Scanner;
import java.net.URL;
import java.io.*;

public class SPBQuizB extends JPanel implements ActionListener, MouseListener{  //SPBQuiz class header
	
	Base ba;
	JLabel quesUno;  //declare variables, objects
	JLabel quesDos;
	JLabel quesTres;
	JLabel title;
	JButton cont;
	JButton start;
	JRadioButton c1Uno;
	JRadioButton c1Dos;
	JRadioButton c1Tres;
	JRadioButton c1Cuatro;
	JRadioButton c2Uno;
	JRadioButton c2Dos;
	JRadioButton c2Tres;
	JRadioButton c2Cuatro;
	JRadioButton c3Uno;
	JRadioButton c3Dos;
	JRadioButton c3Tres;
	JRadioButton c3Cuatro;
	JRadioButton b1Uno;
	JRadioButton b1Dos;
	JRadioButton b1Tres;
	JRadioButton b2Uno;
	JRadioButton b2Dos;
	JRadioButton b2Tres;
	JButton submit1;
	JButton submit2;
	JButton submit3;
	ButtonGroup cBg;
	ButtonGroup bBg;
	JTextArea aUno;
	String aWordUno;
	String aWordDos;
	String aWordTres;
	String aWordCuatro;
	String aText;
	Timer timer;
	boolean isCorrect;  //tells whether previous question was correct
	int whichLevel;  //tells which level previous question was; 1 = C, 2 = B, 3 = A
	int points;
	int quesNum;  //which question out of the three total is the user on
	int seconds; //no. of seconds to take quiz
	boolean marS;
	boolean peaS;
	boolean notLine;
	String curr;
	URL url;
	Image marTalk;
	Image peaTalk;
	Image speech;
	Image bimg;
	Scanner readIt;
	JLabel riteONah;
	
	public SPBQuizB(Base b){  //constructor
		
		ba = b;
		setLayout(null);
		System.out.println("Entered SPBQuiz Constructor");  //test if it entered constructor (println)
		
		points = 0;  //initialize variables
		whichLevel = 1;
		
		title = new JLabel("Quiz");
		quesUno = new JLabel();
		quesDos = new JLabel();
		quesTres = new JLabel();
		aUno = new JTextArea("Type your 3-4 sentence reponse here");
		aWordUno = "large intestine";
		aWordDos = "water";
		aWordTres = "rectum";
		aWordCuatro = "feces";
		submit1 = new JButton("Submit");
		submit2 = new JButton("Submit");
		submit3 = new JButton("Submit");
		cont = new JButton("Finish");
		start = new JButton("Start");
		riteONah = new JLabel();
		timer = new Timer(1000, this);
		
		notLine = true;
			
		try{  //use File IO to read a txt file and put it in info string
			
			readIt = new Scanner(new File("QuizPregunts.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
		}catch(FileNotFoundException e){
		
			System.err.println("QuizPregunts.txt not found");  //to catch FileNotFoundException
			
		}
			
		while(notLine){
			
			curr = readIt.nextLine();
				
			if(curr.equals("DigC")){
					
				notLine = false;
				quesUno.setText(readIt.nextLine());
				
			}
				
		}
		
		notLine = true;
		readIt.reset();
			
		while(notLine){
			
			curr = readIt.nextLine();
				
			if(curr.equals("DigB")){
					
				notLine = false;
				quesDos.setText(readIt.nextLine());
				
			}
				
		}
		
		readIt.reset();
		notLine = true;
		
		while(notLine){
			
			curr = readIt.nextLine();
				
			if(curr.equals("DigA")){
					
				notLine = false;
				quesTres.setText(readIt.nextLine());
				
			}
				
		}
		
		//instantiate components
		c1Uno = new JRadioButton("a) A lining of basic fluid neutralizes the acid");
		c1Dos = new JRadioButton("b) The stomach does get burnt, it just heals fast");
		c1Tres = new JRadioButton("c) A coating of mucus protect the inside");
		c1Cuatro = new JRadioButton("d) none of the above");
		cBg = new ButtonGroup();
		bBg = new ButtonGroup();
		b1Uno = new JRadioButton();
		b1Dos = new JRadioButton();
		b1Tres = new JRadioButton();
		
		title.setFont(new Font("Times", Font.BOLD, 15));
		title.setBounds(400, 50, 200, 100);
		
		quesUno.setBounds(25, 200, 400, 50);
		quesUno.setVisible(false);
		c1Uno.setBounds(50, 240, 350, 20);
		c1Uno.setVisible(false);
		c1Dos.setBounds(50, 260, 350, 20);
		c1Dos.setVisible(false);
		c1Tres.setBounds(50, 280, 350, 20);
		c1Tres.setVisible(false);
		c1Cuatro.setBounds(50, 300, 350, 20);
		c1Cuatro.setVisible(false);
		submit1.setBounds(100, 325, 75, 25);
		submit1.setVisible(false);
		
		quesDos.setBounds(25, 350, 300, 50);
		quesDos.setVisible(false);
		b1Uno.setBounds(20, 410, 20, 20);
		b1Uno.setVisible(false);
		b1Dos.setBounds(300, 600, 20, 20);
		b1Dos.setVisible(false);
		b1Tres.setBounds(10, 600, 20, 20);
		b1Tres.setVisible(false);
		submit2.setBounds(100, 610, 75, 25);
		submit2.setVisible(false);
		
		quesTres.setBounds(400, 195, 300, 50);
		quesTres.setVisible(false);
		aUno.setBounds(400, 240, 200, 300);
		aUno.setVisible(false);
		aUno.setLineWrap(true);
		aUno.setFont(new Font("Times", Font.PLAIN, 15));
		submit3.setBounds(400, 550, 75, 25);
		submit3.setVisible(false);
		
		riteONah.setBounds(100, 325, 75, 25);
		cont.setBounds(400, 600, 200, 50);
		cont.setVisible(false);
		start.setBounds(400, 200, 75, 25);
		
		addMouseListener(this);
		submit1.addActionListener(this);
		submit2.addActionListener(this);
		submit3.addActionListener(this);
		cont.addActionListener(this);
		start.addActionListener(this);
		
		cBg.add(c1Uno);
		cBg.add(c1Dos);
		cBg.add(c1Tres);
		cBg.add(c1Cuatro);
		bBg.add(b1Uno);
		bBg.add(b1Dos);
		bBg.add(b1Tres);
		
		add(title);
		add(quesUno);
		add(quesDos);
		add(quesTres);
		add(c1Uno);
		add(c1Dos);
		add(c1Tres);
		add(c1Cuatro);
		add(b1Uno);
		add(b1Dos);
		add(b1Tres);
		add(aUno);
		add(submit1);
		add(submit2);
		add(submit3);
		add(riteONah);
		add(cont);
		add(start);
		
		url = SPBStudy.class.getResource("marTalk.gif");
		marTalk = Toolkit.getDefaultToolkit().getImage(url);
		url = SPBStudy.class.getResource("peaTalk.gif");
		peaTalk = Toolkit.getDefaultToolkit().getImage(url);
		url = SPBStudy.class.getResource("speech.png");
		speech = Toolkit.getDefaultToolkit().getImage(url);
		url = SPBStudy.class.getResource("digDiag.jpg");
		bimg = Toolkit.getDefaultToolkit().getImage(url);
		
		//all have listeners to tell which one has been selected, and 
		//then set an appropriate boolean value to true
		//after you have set these, you can click a start button to be forwarded
		//to the quiz class, which is displayed in the same JPanel
		
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
			
		if(marS && !peaS){
				
			g.drawImage(marTalk, 0, 0, this);
			g.drawImage(speech, 100, 0, 200, 150, this);
			g.drawString("Answer all the questions", 140, 90);
			g.drawString("given to you. Then press", 120, 100);
			g.drawString("'Finish'", 170, 110);
				
		}
			
		else if(!marS && peaS){
				
			g.drawImage(peaTalk, 0, 0, 100, 200, this);
			g.drawImage(speech, 100, 0, 200, 150, this);
			g.drawString("Answer all the questions", 140, 90);
			g.drawString("given to you. Then press", 120, 100);
			g.drawString("'Finish'", 170, 110);
				
		}
		
		if(whichLevel > 1){
		
			g.drawImage(bimg, 0, 400, 300, 200, this);
			g.drawLine(117, 507, 20, 410);
			g.drawLine(125, 531, 300, 600);
			g.drawLine(104, 556, 20, 600);
		
		}
		
	}
	
	public void actionPerformed(ActionEvent e){	

		if(e.getSource() == start){
		
			timer.start();
			start.setVisible(false);
			quesUno.setVisible(true);
			c1Uno.setVisible(true);
			c1Dos.setVisible(true);
			c1Tres.setVisible(true);
			c1Cuatro.setVisible(true);
			submit1.setVisible(true);
				
		}
	
		else if(e.getSource() == submit1){
		
			if(c1Tres.isSelected()){
				
				isCorrect = true;
				submit1.setVisible(false);
			}
			
			else{
			
				isCorrect = false;
				submit1.setVisible(false);
			}
			
			if(isCorrect){
				
				points += 10;
				whichLevel = 2;
				riteONah.setForeground(Color.green);
				riteONah.setText("Correct");
				
			}
			
			else{
				
				points += 0;
				whichLevel = 1;
				riteONah.setForeground(Color.red);
				riteONah.setText("Wrong");
								
			}
			
			
			quesDos.setVisible(true);
			b1Uno.setVisible(true);
			b1Dos.setVisible(true);
			b1Tres.setVisible(true);
			submit2.setVisible(true);
			
		}
		
		else if(e.getSource() == submit2){
		
			if(b1Uno.isSelected()){
				
				isCorrect = true;
				submit2.setVisible(false);
			
			}
			
			else{
			
				isCorrect = false;
				submit2.setVisible(false);
			}
			
			if(isCorrect){
				
				points += 20;
				whichLevel = 3;
				riteONah.setBounds(100, 600, 75, 25);
				riteONah.setForeground(Color.green);
				riteONah.setText("Correct");
				
			}
			
			else{
				
				points += 0;
				whichLevel = 2;
				riteONah.setBounds(100, 600, 75, 25);
				riteONah.setForeground(Color.red);
				riteONah.setText("Wrong");
								
			}
			
			quesTres.setVisible(true);
			aUno.setVisible(true);
			submit3.setVisible(true);
			
		}
		
		else if(e.getSource() == submit3){
		
			aText = aUno.getText();
			
			if(aText.contains(aWordUno) && aText.contains(aWordDos) && aText.contains(aWordTres) && aText.contains(aWordCuatro)){
				
				points += 30;
				submit3.setVisible(false);
				riteONah.setBounds(400, 550, 75, 25);
				riteONah.setForeground(Color.green);
				riteONah.setText("Correct");
				cont.setVisible(true);
				
			}
			
			else{
				
				points += 0;
				submit3.setVisible(false);
				riteONah.setBounds(400, 550, 75, 25);
				riteONah.setForeground(Color.red);
				riteONah.setText("Wrong");
				cont.setVisible(true);
				
			}
			
		}
		
		else if(e.getSource() == cont){
		
			timer.stop();
			ba.showEnd(marS, peaS, points, whichLevel, seconds);
			
		}
		
		else{
		
			seconds++;
			System.out.println(seconds);
			
		}
		
	}
	
	public void mouseClicked(MouseEvent e){  //mouseClicked
			
			requestFocus();

			int x = e.getX();
			int y = e.getY();
			
			System.out.println(x + "," + y);
			
	}
		
	public void mouseReleased(MouseEvent e){}
	
	public void mouseEntered(MouseEvent e){}
	
	public void mouseExited(MouseEvent e){}
	
	public void mousePressed(MouseEvent e){}
	
	//Diff class header extends JPanel
		
		//declare components, variables
	
		//constructor
		
			//test if it entered constructor (println)
			//setLayout
			//instantiate components
			//initialize variables
			//add components/images
			
		//after this is all done and interacted with
		//forward the user to SPBEnd.java
	
}
