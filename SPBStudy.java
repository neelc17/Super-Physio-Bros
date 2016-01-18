/*
 * Neel Chaudhari, Jay Ray
 * Per. 6, 3
 * 4/21/15
 * Super Physio Bros.
 * Game in 5 Weeks project
 * SPBStudy.java
 * Has the Choose System, Studying, and Description JPanels
 */

import java.awt.*;  //import libraries
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.net.URL;

public class SPBStudy extends JPanel{  //SPBStudy class header
	
	Base ba;  //declare variables 
	ChooseYoSystem cys;
	StudyYoEndo sendo;
	StudyYoResp sresp;
	StudyYoDig sdig;
	StudyYoFemRepro sfemrepro;
	StudyYoMaleRepro smalerepro;
	StudyYoUrin surin;
	StudyYoCirc scirc;
	ThymusGlands thymGlan;
	AdrenalGlands adrenGlan;
	SweatGlands sweatGlan;
	Kidneys kidneys;
	Ureters ureters;
	Aorta aorta;
	Arteries arteries;
	Bladder bladder;
	Bronchi bronchi;
	Capillaries capillaries;
	Cervix cervix;
	Diaphragm diaphragm;
	FallopianTubes fallopian;
	Heart heart;
	LargeIntestine lintestine;
	Larynx larynx;
	Liver liver;
	Lungs lungs;
	Ovaries ovaries;
	Pancreas pancreas;
	Penis penis;
	PituitaryGland pitGlan;
	Prostate prostate;
	RenalArteryVein renalAV;
	Scrotum scrotum;
	SmallIntestine sintestine;
	Stomach stomach;
	Testes testes;
	ThyroidGland thyGlan;
	Trachea trachea;
	Uterus uterus;
	Vagina vagina;
	VasDeferens vasDef;
	Veins veins;
	boolean marS;
	boolean peaS;
	boolean isEndo;
	boolean isFRepro;
	boolean isMRepro;
	boolean isDig;
	Scanner readIt;
	String curr;
	Image marTalk, peaTalk, speech;
	URL url;
	
	public SPBStudy(Base b){  //constructor  
		
		System.out.println("Entered SPBStudy Constructor");  //test if it entered constructor (println)
		
		ba = b;  //initialize variables
		cys = new ChooseYoSystem();
		sendo = new StudyYoEndo();
		sresp = new StudyYoResp();
		sdig = new StudyYoDig();
		sfemrepro = new StudyYoFemRepro();
		smalerepro = new StudyYoMaleRepro();
		surin = new StudyYoUrin();
		scirc = new StudyYoCirc();
		thymGlan = new ThymusGlands();
		adrenGlan = new AdrenalGlands();
		sweatGlan = new SweatGlands();
		kidneys = new Kidneys();
		ureters = new Ureters();
		aorta = new Aorta();
		arteries = new Arteries();
		bladder = new Bladder();
		bronchi = new Bronchi();
		capillaries = new Capillaries();
		cervix = new Cervix();
		diaphragm = new Diaphragm();
		fallopian = new FallopianTubes();
		heart = new Heart();
		lintestine = new LargeIntestine();
		larynx = new Larynx();
		liver = new Liver();
		lungs = new Lungs();
		ovaries = new Ovaries();
		pancreas = new Pancreas();
		penis = new Penis();
		pitGlan = new PituitaryGland();
		prostate = new Prostate();
		renalAV = new RenalArteryVein();
		scrotum = new Scrotum();
		sintestine = new SmallIntestine();
		stomach = new Stomach();
		testes = new Testes();
		thyGlan = new ThyroidGland();
		trachea = new Trachea();
		uterus = new Uterus();
		vagina = new Vagina();
		vasDef = new VasDeferens();
		veins = new Veins();
		marS = false;
		peaS = false;
		
		url = SPBStudy.class.getResource("marTalk.gif");
		marTalk = Toolkit.getDefaultToolkit().getImage(url);
		url = SPBStudy.class.getResource("peaTalk.gif");
		peaTalk = Toolkit.getDefaultToolkit().getImage(url);
		url = SPBStudy.class.getResource("speech.png");
		speech = Toolkit.getDefaultToolkit().getImage(url);
		
	}
	
	public class ChooseYoSystem extends JPanel implements ActionListener, MouseListener{  //ChooseYoSystem class header extends JPanel
	
		JLabel title;
		ButtonGroup bg;
		JRadioButton endo, resp, dig, repro, urin, circ;  //declare components, variables
		Image endoi, respi, digi, malereproi, femreproi, urini, circi;
		JButton start, back;
		boolean endoPressed, respPressed, digPressed, reproPressed, urinPressed, circPressed;

		public ChooseYoSystem(){  //constructor
			
			//setBackground(Color.blue);
			
			System.out.println("Entered ChooseYoSystem Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			
			title = new JLabel("Choose a System to Study");
			bg = new ButtonGroup();  //instantiate components
			endo = new JRadioButton("Endocrine System");
			resp = new JRadioButton("Respiratory System");
			dig = new JRadioButton("Digestive System");
			repro = new JRadioButton("Male Reproductive System");
			urin = new JRadioButton("Excretory System");
			circ = new JRadioButton("Circulatory System");
			start = new JButton("Study This System");
			back = new JButton("Back to Home");
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			endo.setBounds(50, 350, 150, 20);
			resp.setBounds(250, 350, 150, 20);
			dig.setBounds(450, 350, 150, 20);
			repro.setBounds(50, 500, 200, 20);
			urin.setBounds(250, 500, 200, 20);
			circ.setBounds(450, 500, 300, 20);
			start.setBounds(400, 550, 200, 50);	
			back.setBounds(100, 550, 200, 50);
			
			url = SPBStudy.class.getResource("endoicon.png");
			endoi = Toolkit.getDefaultToolkit().getImage(url);  //initialize variables
			url = SPBStudy.class.getResource("respicon.png");
			respi = Toolkit.getDefaultToolkit().getImage(url);
			url = SPBStudy.class.getResource("digicon.png");
			digi = Toolkit.getDefaultToolkit().getImage(url);
			url = SPBStudy.class.getResource("malereproicon.png");
			malereproi = Toolkit.getDefaultToolkit().getImage(url);
			url = SPBStudy.class.getResource("femreproicon.png");
			femreproi = Toolkit.getDefaultToolkit().getImage(url);
			url = SPBStudy.class.getResource("urinicon.png");
			urini = Toolkit.getDefaultToolkit().getImage(url);
			url = SPBStudy.class.getResource("circicon.png");
			circi = Toolkit.getDefaultToolkit().getImage(url);
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			curr = "";
			
			start.addActionListener(this);
			back.addActionListener(this);
			endo.addActionListener(this);
			resp.addActionListener(this);
			dig.addActionListener(this);
			repro.addActionListener(this);
			urin.addActionListener(this);
			circ.addActionListener(this);
			addMouseListener(this);
			
			bg.add(endo);  //add JRadioButtons to ButtonGroup
			bg.add(resp);
			bg.add(dig);
			bg.add(repro);
			bg.add(urin);
			bg.add(circ);
			
			add(title);
			add(endo);  //add components
			add(resp);
			add(dig);
			add(repro);
			add(urin);
			add(circ);
			add(start);
			add(back);
			
		}
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(endoi, 50, 220, 175, 125, this);
			g.drawImage(respi, 250, 220, 175, 125, this);
			g.drawImage(digi, 450, 190, 150, 150, this);
			g.drawImage(urini, 270, 370, 125, 125, this);
			g.drawImage(circi, 450, 370, 175, 125, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("It's-a-me, Dr. Mario!", 140, 90);
				g.drawString("Choose a system, then press", 120, 100);
				g.drawString("'Study this System' to start!", 130, 110);
				g.drawImage(malereproi, 70, 370, 125, 125, this);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Hello! I'm Nurse Peach.", 140, 90);
				g.drawString("Choose a system, then press", 120, 100);
				g.drawString("'Study this System' to start!", 130, 110);
				g.drawImage(femreproi, 50, 370, 175, 125, this);
				
			}
			
			else if(!marS && !peaS){
				
				g.setColor(Color.red);
				g.setFont(new Font("Times", Font.BOLD, 20));
				g.drawString("Please select a character at home page", 0, 50);
				g.setColor(Color.black);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){  //actionPerformed
			
			if(e.getSource() == back){  //if back pressed, take to home
				
				ba.showHome();
				
			}
			
			if(e.getSource() == endo){  //if endo selected, endo is true

				endoPressed = true;
				respPressed = false;
				digPressed = false;
				reproPressed = false;
				urinPressed = false;
				circPressed = false;
				
			}
			
			if(e.getSource() == resp){  //if resp selected, resp is true

				endoPressed = false;
				respPressed = true;
				digPressed = false;
				reproPressed = false;
				urinPressed = false;
				circPressed = false;
				
			}
			
			if(e.getSource() == dig){  //if dig selected, dig is true

				endoPressed = false;
				respPressed = false;
				digPressed = true;
				reproPressed = false;
				urinPressed = false;
				circPressed = false;
				
			}
			
			if(e.getSource() == repro){  //if repro selected, repro is true

				endoPressed = false;
				respPressed = false;
				digPressed = false;
				reproPressed = true;
				urinPressed = false;
				circPressed = false;

			}
			
			if(e.getSource() == urin){  //if urin selected, urin is true

				endoPressed = false;
				respPressed = false;
				digPressed = false;
				reproPressed = false;
				urinPressed = true;
				circPressed = false;
				
			}
			
			if(e.getSource() == circ){  //if immu selected, immu is true

				endoPressed = false;
				respPressed = false;
				digPressed = false;
				reproPressed = false;
				urinPressed = false;
				circPressed = true;
				
			}
			
			if(e.getSource() == start && (peaS || marS)){  //if start pressed
			
				if(endoPressed){  //if endo is true, take to endo
				
					ba.showEndo();
					
				}
				
				if(respPressed){  //if resp is true, take to resp
				
					ba.showResp();
				
				}
				
				if(digPressed){  //if dig is true, take to dig
				
					ba.showDig();
				
				}
				
				if(reproPressed){  //if repro is true, take to repro
				
					if(marS && !peaS){
			
						ba.showMaleRepro();
				
					}
			
					if(!marS && peaS){
			
						ba.showFemRepro();
				
					}
				
				}
				
				if(urinPressed){  //if urin is true, take to urin
				
					ba.showUrin();
				
				}
				
				if(circPressed){  //if circ is true, take to circ
					
					ba.showCirc();
				
				}
				
			}
			
		}
		
		public void mouseClicked(MouseEvent e){  //mouseClicked
			
			//g.drawImage(endoi, 50, 220, 175, 125, this);
			//g.drawImage(respi, 250, 220, 175, 125, this);
			//g.drawImage(digi, 450, 190, 150, 150, this);
			//g.drawImage(reproi, 30, 370, 200, 125, this);
			//g.drawImage(urini, 270, 370, 125, 125, this);
			//g.drawImage(circi, 450, 370, 175, 125, this);
			
			int x = e.getX();
			int y = e.getY();

			if((x >= 50 && x <= 225) && (y >= 220 && y <= 345)){
			
				endo.setSelected(true);
				
				endoPressed = true;
				respPressed = false;
				digPressed = false;
				reproPressed = false;
				urinPressed = false;
				circPressed = false;
		
			}
			
			if((x >= 250 && x <= 425) && (y >= 220 && y <= 345)){
			
				resp.setSelected(true);
				
				endoPressed = false;
				respPressed = true;
				digPressed = false;
				reproPressed = false;
				urinPressed = false;
				circPressed = false;
				
			}
			
			if((x >= 450 && x <= 600) && (y >= 190 && y <= 340)){
			
				dig.setSelected(true);
				
				endoPressed = false;
				respPressed = false;
				digPressed = true;
				reproPressed = false;
				urinPressed = false;
				circPressed = false;
				
			}
			
		    if((x >= 30 && x <= 230) && (y >= 370 && y <= 495)){
			
				repro.setSelected(true);
				
				endoPressed = false;
				respPressed = false;
				digPressed = false;
				reproPressed = true;
				urinPressed = false;
				circPressed = false;
				
			}
			
			if((x >= 270 && x <= 395) && (y >= 370 && y <= 495)){
			
				urin.setSelected(true);
				
				endoPressed = false;
				respPressed = false;
				digPressed = false;
				reproPressed = false;
				urinPressed = true;
				circPressed = false;
				
			}
			
			if((x >= 450 && x <= 625) && (y >= 370 && y <= 495)){
			
				circ.setSelected(true);
				
				endoPressed = false;
				respPressed = false;
				digPressed = false;
				reproPressed = false;
				urinPressed = false;
				circPressed = true;
				
			}
			
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
		
	}	
	
	public class StudyYoEndo extends JPanel implements ActionListener, MouseListener{  //StudyYoEndo class header extends JPanel (endocrine system) ONLY NEEL WORK ON THIS
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		JButton quizB;
		boolean notEndoStart;
		Image femDiag;
		Image maleDiag;
		
		public StudyYoEndo(){  //constructor
				
			System.out.println("Entered StudyYoEndo Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Endocrine System");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			quizB = new JButton("Take the quiz!");
			quizB.setBounds(500, 550, 200, 50);
			quizB.addActionListener(this);
			add(quizB);
			notEndoStart = true;  //initialize variables
			url = SPBStudy.class.getResource("femEndoDiag.gif");
			femDiag = Toolkit.getDefaultToolkit().getImage(url);
			url = SPBStudy.class.getResource("maleEndoDiag.gif");
			maleDiag = Toolkit.getDefaultToolkit().getImage(url);
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notEndoStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("EndoStart")){
					
					notEndoStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 400, 400, 200);
			
			back.addActionListener(this);
			addMouseListener(this);
			 
			add(back);  //add components
			add(desc);
			add(title);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click on an organ on", 140, 90);
				g.drawString("the diagram to learn more", 120, 100);
				g.drawString("about it!", 170, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click on an organ on", 140, 90);
				g.drawString("the diagram to learn more", 120, 100);
				g.drawString("about it!", 170, 110);
				
				
			}
			
			if(marS && !peaS){
				
				g.drawImage(maleDiag, 150, 160, 350, 300, this);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(femDiag, 150, 160, 350, 300, this);
				
				
			}
			
			
				
		}
		
		public void actionPerformed(ActionEvent e){  //actionPerformed
			
			if(e.getSource() == back){
				
				ba.showChooseSystem(marS, peaS);
				
			}
			if(e.getSource() == quizB){
				
				ba.showEQuiz();
			
			}
			
		}
		
		public void mouseClicked(MouseEvent e){  //mouseClicked
			
			requestFocus();
			
			int x = e.getX();
			int y = e.getY();
			
			if((x >= 286 && x <= 313) && (y >= 184 && y <= 199)){
				
				ba.showPitGlan();
		
			}
			
			if((x >= 295 && x <= 322) && (y >= 227 && y <= 253)){
				
				ba.showThyGlan();
		
			}
			
			if((x >= 292 && x <= 327) && (y >= 254 && y <= 282)){
				
				ba.showThymGlands();
		
			}
				
			if(((x >= 281 && x <= 296) && (y >= 314 && y <= 327)) || ((x >= 316 && x <= 331) && (y >= 315 && y <= 327))){
				
				ba.showAdrenGlands();
		
			}
			
			if((x >= 299 && x <= 316) && (y >= 326 && y <= 340)){
				
				isEndo = true;
				isFRepro = false;
				isMRepro = false;
				isDig = false;
				ba.showPancreas();
		
			}
			
			if(((x >= 288 && x <= 324) && (y >= 414 && y <= 439)) && (marS && !peaS)){
				
				isEndo = true;
				isFRepro = false;
				isMRepro = false;
				isDig = false;
				ba.showTestes();
		
			}
			
			if((((x >= 261 && x <= 292) && (y >= 392 && y <= 417)) || ((x >= 324 && x <= 355) && (y >= 395 && y <= 413))) && (!marS && peaS)){
				
				isEndo = true;
				isFRepro = false;
				isMRepro = false;
				isDig = false;
				ba.showOvaries();
		
			}
			
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
			
	}
	
	public class StudyYoResp extends JPanel implements ActionListener, MouseListener{  //StudyYoResp class header extends JPanel (respiratory system) ONLY NEEL WORK ON THIS
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		boolean notRespStart;
		Image diag;
		JButton quizB;
		public StudyYoResp(){  //constructor
				
			System.out.println("Entered StudyYoResp Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Respiratory System");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			quizB = new JButton("Take the quiz!");
			quizB.setBounds(500, 550, 200, 50);
			quizB.addActionListener(this);
			add(quizB);
			notRespStart = true;  //initialize variables
			url = SPBStudy.class.getResource("respDiag.jpg");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notRespStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("RespStart")){
					
					notRespStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 400, 400, 200);
			
			back.addActionListener(this);
			addMouseListener(this);
			
			add(title);  //add components
			add(back);
			add(desc);
		
		}	
		
		public void paintComponent(Graphics g){
			
			super.paintComponent(g);
			
			g.drawImage(diag, 150, 160, 350, 300, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click on an organ on", 140, 90);
				g.drawString("the diagram to learn more", 120, 100);
				g.drawString("about it!", 170, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click on an organ on", 140, 90);
				g.drawString("the diagram to learn more", 120, 100);
				g.drawString("about it!", 170, 110);
				
			}
				
		}
		
		public void mouseClicked(MouseEvent e){  //mouseClicked
			
			requestFocus();

			int x = e.getX();
			int y = e.getY();
			
			if((x >= 290 && x <= 319) && (y >= 262 && y <= 283)){
				
				ba.showLarynx();
		
			}
			
			if((x >= 315 && x <= 325) && (y >= 293 && y <= 322)){
				
				ba.showTrachea();
		
			}
			
			if((x >= 314 && x <= 331) && (y >= 324 && y <= 338)){
				
				ba.showBronchi();
		
			}
			
			if(((x >= 264 && x <= 315) && (y >= 301 && y <= 385)) || ((x >= 332 && x <= 388) && (y >= 291 && y <= 384))){
				
				ba.showLungs();
		
			}
				
			if((x >= 269 && x <= 378) && (y >= 395 && y <= 421)){
				
				ba.showDiaphragm();
		
			}
			
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
		
		public void actionPerformed(ActionEvent e){  //actionPerformed
			
			if(e.getSource() == back){
				
				ba.showChooseSystem(marS, peaS);
				
			}
			if(e.getSource() == quizB){
				
				ba.showRQuiz();
			
			}
			
		}
			
	}
	
	public class StudyYoDig extends JPanel implements ActionListener, MouseListener{  //StudyYoDig class header extends JPanel (digestive system) ONLY NEEL WORK ON THIS
	
		JLabel title;//declare components, variables
		JButton back;
		JLabel desc;
		JButton quizB;
		boolean notDigStart;
		Image diag;
		
		public StudyYoDig(){//constructor
		
			System.out.println("Entered StudyYoDig Constructor");
			setLayout(null);
			title = new JLabel("Digestive System");
			back = new JButton ("Back");
			desc = new JLabel();
			quizB = new JButton("Take the quiz!");
			quizB.setBounds(500, 550, 200, 50);
			quizB.addActionListener(this);
			add(quizB);
			notDigStart = true;
			url = SPBStudy.class.getResource("digDiag.jpg");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notDigStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("DigStart")){
					
					notDigStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
		
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 400, 400, 200);
			
			back.addActionListener(this);
			addMouseListener(this);
				
			add(title);  //add components
			add(back);
			add(desc);
		
		}
		
		public void paintComponent(Graphics g){
			
			super.paintComponent(g);
			
			g.drawImage(diag, 150, 160, 420, 300, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click on an organ on", 140, 90);
				g.drawString("the diagram to learn more", 120, 100);
				g.drawString("about it!", 170, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click on an organ on", 140, 90);
				g.drawString("the diagram to learn more", 120, 100);
				g.drawString("about it!", 170, 110);
				
			}
			
		}
		
		public void mouseClicked(MouseEvent e){  //mouseClicked
			
			requestFocus();

			int x = e.getX();
			int y = e.getY();
			
			if((x >= 289 && x <= 340) && (y >= 308 && y <= 341)){
				
				ba.showLiver();
		
			}
			
			if((x >= 345 && x <= 369) && (y >= 328 && y <= 348)){
				
				ba.showStomach();
		
			}
			
			if((x >= 319 && x <= 344) && (y >= 350 && y <= 360)){
				
				isEndo = false;
				isFRepro = false;
				isMRepro = false;
				isDig = true;
				ba.showPancreas();
		
			}
			
			if((x >= 308 && x <= 355) && (y >= 375 && y <= 403)){
				
				ba.showSIntestine();
		
			}
				
			if(((x >= 287 && x <= 305) && (y >= 358 && y <= 405)) || ((x >= 304 && x <= 365) && (y >= 361 && y <= 370)) || ((x >= 366 && x <= 375) && (y >= 356 && y <= 408))){
				
				ba.showLIntestine();
		
			}
			
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showChooseSystem(marS, peaS);
				
			}
			if(e.getSource() == quizB){
				
				ba.showDQuiz();
			
			}
			
		}
		
	}	
	
	public class StudyYoFemRepro extends JPanel implements ActionListener, MouseListener{  //StudyYoRepro class header extends JPanel (digestive system) ONLY NEEL WORK ON THIS
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		JButton quizB;
		boolean notFemReproStart;
		Image diag;
		
		public StudyYoFemRepro(){  //constructor
				
			System.out.println("Entered StudyYoFemRepro Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Female Reproductive System");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			quizB = new JButton("Take the quiz!");
			quizB.setBounds(500, 550, 200, 50);
			quizB.addActionListener(this);
			add(quizB);
			notFemReproStart = true;//initialize variables
			url = SPBStudy.class.getResource("femReproDiag.jpg");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notFemReproStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("FemReproStart")){
					
					notFemReproStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(350, 50, 250, 100);
			back.setBounds(250, 550, 200, 50);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 400, 400, 200);
			
			back.addActionListener(this);
			addMouseListener(this);
			 
			add(back);  //add components
			add(desc);
			add(title);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 150, 160, 350, 300, this);
				
			g.drawImage(peaTalk, 0, 0, 100, 200, this);
			g.drawImage(speech, 100, 0, 200, 150, this);
			g.drawString("Click on an organ on", 140, 90);
			g.drawString("the diagram to learn more", 120, 100);
			g.drawString("about it!", 170, 110);
			
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showChooseSystem(marS, peaS);
			
			}
			if(e.getSource() == quizB){
				
				ba.showFRQuiz();
			
			}
		
		}
		
		public void mouseClicked(MouseEvent e){  //mouseClicked
			
			requestFocus();

			int x = e.getX();
			int y = e.getY();
			
			if(((x >= 194 && x <= 243) && (y >= 232 && y <= 286)) || ((x >= 397 && x <= 444) && (y >= 241 && y <= 283))){
				
				isEndo = false;
				isFRepro = true;
				isMRepro = false;
				isDig = false;
				ba.showOvaries();
		
			}
			
			if(((x >= 155 && x <= 242) && (y >= 190 && y <= 236)) || ((x >= 384 && x <= 491) && (y >= 188 && y <= 253))){
				
				ba.showFallopian();
		
			}
			
			if((x >= 277 && x <= 359) && (y >= 370 && y <= 433)){
				
				ba.showVagina();
		
			}
			
			if((x >= 286 && x <= 351) && (y >= 339 && y <= 359)){
				
				ba.showCervix();
		
			}
				
			if((x >= 271 && x <= 373) && (y >= 213 && y <= 335)){
				
				ba.showUterus();
		
			}
			
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
	
	}
	
	public class StudyYoMaleRepro extends JPanel implements ActionListener, MouseListener{  //StudyYoRepro class header extends JPanel (digestive system) ONLY NEEL WORK ON THIS
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		boolean notMaleReproStart;
		Image diag;
		JButton quizB;
		
		public StudyYoMaleRepro(){  //constructor
				
			System.out.println("Entered StudyYoMaleRepro Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Male Reproductive System");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			quizB = new JButton("Take the quiz!");
			quizB.setBounds(500, 550, 200, 50);
			quizB.addActionListener(this);
			add(quizB);
			notMaleReproStart = true;//initialize variables
			url = SPBStudy.class.getResource("maleReproDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notMaleReproStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("MaleReproStart")){
					
					notMaleReproStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(350, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 400, 400, 200);
			
			back.addActionListener(this);
			addMouseListener(this);
			 
			add(back);  //add components
			add(desc);
			add(title);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 150, 160, 350, 300, this);
				
			g.drawImage(marTalk, 0, 0, this);
			g.drawImage(speech, 100, 0, 200, 150, this);
			g.drawString("Click on an organ on", 140, 90);
			g.drawString("the diagram to learn more", 120, 100);
			g.drawString("about it!", 170, 110);
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showChooseSystem(marS, peaS);
			
			}
			if(e.getSource() == quizB){
				
				ba.showMRQuiz();
			
			}
		
		}
		
		public void mouseClicked(MouseEvent e){  //mouseClicked
			
			requestFocus();
			
			int x = e.getX();
			int y = e.getY();
			
			 
			
			if((x >= 143 && x <= 208) && (y >= 310 && y <= 418)){
				
				ba.showPenis();
		
			}
			
			if((x >= 221 && x <= 281) && (y >= 385 && y <= 442)){
				
				isEndo = false;
				isFRepro = false;
				isMRepro = true;
				isDig = false;
				ba.showTestes();
		
			}
			
			if(((x >= 213 && x <= 295) && (y >= 363 && y <= 448)) && !((x >= 221 && x <= 281) && (y >= 385 && y <= 442))){
				
				ba.showScrotum();
		
			}
			
			if((x >= 296 && x <= 362) && (y >= 285 && y <= 328)){
				
				ba.showProstate();
		
			}
				
			if((x >= 235 && x <= 282) && (y >= 259 && y <= 362)){
				
				ba.showVasDef();
		
			}
			
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
	
	}
	
	public class StudyYoUrin extends JPanel implements ActionListener, MouseListener{  //StudyYoUrin class header extends JPanel (digestive system) ONLY NEEL WORK ON THIS
	
		JLabel title;  //declare components, variables
		JButton back;
		JButton sweatB;
		JLabel desc;
		boolean notUrinStart;
		Image diag;
		JButton quizB;
		public StudyYoUrin(){  //constructor
				
			System.out.println("Entered StudyYoUrin Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Excretory System");//instantiate components
			back = new JButton("Back");
			sweatB = new JButton("Sweat Glands");
			desc = new JLabel();
			quizB = new JButton("Take the quiz!");
			quizB.setBounds(500, 550, 200, 50);
			
			quizB.addActionListener(this);
			add(quizB);
			notUrinStart = true;//initialize variables
			url = SPBStudy.class.getResource("urinDiag.jpg");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notUrinStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("UrinStart")){
					
					notUrinStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			sweatB.setBounds(500, 200, 200, 50);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 400, 400, 200);
			
			back.addActionListener(this);
			sweatB.addActionListener(this);
			addMouseListener(this);
			 
			add(back);  //add components
			add(desc);
			add(title);
			add(sweatB);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 150, 160, 350, 300, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click on an organ on", 140, 90);
				g.drawString("the diagram to learn more", 120, 100);
				g.drawString("about it!", 170, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click on an organ on", 140, 90);
				g.drawString("the diagram to learn more", 120, 100);
				g.drawString("about it!", 170, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showChooseSystem(marS, peaS);
			
			}
			
			if(e.getSource() == sweatB){
				
				ba.showSweatGlands();
			
			}
			
			if(e.getSource() == quizB){
				
				ba.showUQuiz();
			
			}
		
		}
		
		public void mouseClicked(MouseEvent e){  //mouseClicked
	
			requestFocus();

			int x = e.getX();
			int y = e.getY();
			
			 
			
			if(((x >= 284 && x <= 305) && (y >= 216 && y <= 273)) || ((x >= 356 && x <= 385) && (y >= 214 && y <= 263))){
				
				ba.showKidneys();
		
			}
			
			if(((x >= 311 && x <= 323) && (y >= 254 && y <= 377)) || ((x >= 348 && x <= 359) && (y >= 250 && y <= 364))){
				
				ba.showUreters();
		
			}
			
			if(((x >= 316 && x <= 323) && (y >= 234 && y <= 252)) || ((x >= 342 && x <= 354) && (y >= 232 && y <= 248))){
				
				ba.showRenalAV();
		
			}
			
			if((x >= 313 && x <= 362) && (y >= 362 && y <= 422)){
				
				ba.showBladder();
		
			}
			
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
	}
	
	public class StudyYoCirc extends JPanel implements ActionListener, MouseListener{  //StudyYoImmu class header extends JPanel (digestive system) ONLY NEEL WORK ON THIS
	
		JLabel title;  //declare components, variables
		JButton back;
		JButton veinsB;
		JButton artB;
		JButton capB;
		JButton quizB;
		JLabel desc;
		boolean notCircStart;
		Image diag;
		
		public StudyYoCirc(){  //constructor
				
			System.out.println("Entered StudyYoCirc Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Circulatory System");//instantiate components
			back = new JButton("Back");
			veinsB = new JButton("Veins");
			artB = new JButton("Arteries");
			capB = new JButton("Capillaries");
			quizB = new JButton("Take the quiz!");
			quizB.setBounds(500, 550, 200, 50);
			quizB.addActionListener(this);
			add(quizB);
			desc = new JLabel();
			
			notCircStart = true;//initialize variables
			url = SPBStudy.class.getResource("circDiag.jpg");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notCircStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("CircStart")){
					
					notCircStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			veinsB.setBounds(550, 200, 100, 50);
			artB.setBounds(550, 250, 100, 50);
			capB.setBounds(550, 300, 100, 50);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 400, 400, 200);
			
			back.addActionListener(this);
			veinsB.addActionListener(this);
			artB.addActionListener(this);
			capB.addActionListener(this);
			addMouseListener(this);
			 
			add(back);  //add components
			add(desc);
			add(title);
			add(veinsB);
			add(artB);
			add(capB);
			
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 150, 160, 350, 300, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click on an organ on", 140, 90);
				g.drawString("the diagram to learn more", 120, 100);
				g.drawString("about it!", 170, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click on an organ on", 140, 90);
				g.drawString("the diagram to learn more", 120, 100);
				g.drawString("about it!", 170, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showChooseSystem(marS, peaS);
			
			}
			
			if(e.getSource() == veinsB){
				
				ba.showVeins();
			
			}
			
			if(e.getSource() == artB){
				
				ba.showArteries();
			
			}
			
			if(e.getSource() == capB){
				
				ba.showCapillaries();
			
			}
			if(e.getSource() == quizB){
				
				ba.showCQuiz();
			
			}
		
		}
		
		public void mouseClicked(MouseEvent e){  //mouseClicked
	
			requestFocus();

			int x = e.getX();
			int y = e.getY();
			
			 
			
			if((x >= 286 && x <= 369) && (y >= 275 && y <= 370)){
				
				ba.showHeart();
		
			}
			
			if((x >= 303 && x <= 345) && (y >= 214 && y <= 268)){
				
				ba.showAorta();
		
			}
			
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
	
	}
	
	//START ENDO ORGANS
	
	public class ThymusGlands extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notThymGlanStart;
		
		public ThymusGlands(){  //constructor
				
			System.out.println("Entered ThymusGlands Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Thymus Glands");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			
			url = SPBStudy.class.getResource("thymusDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notThymGlanStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notThymGlanStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("ThymusGlandsStart")){
					
					notThymGlanStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the ", 140, 100);
				g.drawString("endocrine system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the ", 120, 100);
				g.drawString("endocrine system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showEndo();
			
			}
		
		}
		
	}
	
	public class AdrenalGlands extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notAdrenGlanStart;
		
		public AdrenalGlands(){  //constructor
				
			System.out.println("Entered AdrenalGlands Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Adrenal Glands");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("adrenDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notAdrenGlanStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notAdrenGlanStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("AdrenalGlandsStart")){
					
					notAdrenGlanStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 350, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the ", 140, 100);
				g.drawString("endocrine system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the ", 120, 100);
				g.drawString("endocrine system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showEndo();
			
			}
		
		}
		
	}
	
	public class PituitaryGland extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notPituiGlanStart;
		
		public PituitaryGland(){  //constructor
				
			System.out.println("Entered PituitaryGland Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Pituitary Gland");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("pituiDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notPituiGlanStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notPituiGlanStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("PituitaryGlandStart")){
					
					notPituiGlanStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 350, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the ", 140, 100);
				g.drawString("endocrine system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the ", 120, 100);
				g.drawString("endocrine system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showEndo();
			
			}
		
		}
		
	}
	
	public class ThyroidGland extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notThyrGlanStart;
		
		public ThyroidGland(){  //constructor
				
			System.out.println("Entered ThyroidGland Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Thyroid Gland");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("thyroidDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notThyrGlanStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notThyrGlanStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("ThyroidGlandStart")){
					
					notThyrGlanStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 350, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the ", 140, 100);
				g.drawString("endocrine system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the ", 120, 100);
				g.drawString("endocrine system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showEndo();
			
			}
		
		}
		
	}
	
	//START RESP ORGANS
	
	public class Lungs extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notLungStart;
		
		public Lungs(){  //constructor
				
			System.out.println("Entered Lungs Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Lungs");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("lungsDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notLungStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notLungStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("LungsStart")){
					
					notLungStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the ", 140, 100);
				g.drawString("respiratory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the ", 120, 100);
				g.drawString("respiratory system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showResp();
			
			}
		
		}
		
	}
	
	public class Bronchi extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notBronchiStart;
		
		public Bronchi(){  //constructor
				
			System.out.println("Entered Bronchi Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Bronchi");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();

			url = SPBStudy.class.getResource("bronchiDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notBronchiStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notBronchiStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("BronchiStart")){
					
					notBronchiStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the ", 140, 100);
				g.drawString("respiratory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the ", 120, 100);
				g.drawString("respiratory system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showResp();
			
			}
		
		}
		
	}
	
	public class Trachea extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notTracheaStart;
		
		public Trachea(){  //constructor
				
			System.out.println("Entered Trachea Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Trachea");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("tracheaDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notTracheaStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notTracheaStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("TracheaStart")){
					
					notTracheaStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the ", 140, 100);
				g.drawString("respiratory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the ", 120, 100);
				g.drawString("respiratory system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showResp();
			
			}
		
		}
		
	}
	
	public class Diaphragm extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notDiaphragmStart;
		
		public Diaphragm(){  //constructor
				
			System.out.println("Entered Diaphragm Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Diaphragm");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();

			url = SPBStudy.class.getResource("diaphDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notDiaphragmStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notDiaphragmStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("DiaphragmStart")){
					
					notDiaphragmStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);

			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the ", 140, 100);
				g.drawString("respiratory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the ", 120, 100);
				g.drawString("respiratory system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showResp();
			
			}
		
		}
		
	}
	
	public class Larynx extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notLarynxStart;
		
		public Larynx(){  //constructor
				
			System.out.println("Entered Larynx Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Larynx");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();

			url = SPBStudy.class.getResource("larynxDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notLarynxStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notLarynxStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("LarynxStart")){
					
					notLarynxStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the ", 140, 100);
				g.drawString("respiratory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the ", 120, 100);
				g.drawString("respiratory system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showResp();
			
			}
		
		}
		
	}
	
	//START DIG ORGANS
	
	public class Stomach extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notStomachStart;
		
		public Stomach(){  //constructor
				
			System.out.println("Entered Stomach Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Stomach");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();

			url = SPBStudy.class.getResource("stomDiag.jpg");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notStomachStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notStomachStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("StomachStart")){
					
					notStomachStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the ", 140, 100);
				g.drawString("digestive system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the ", 120, 100);
				g.drawString("digestive system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showDig();
			
			}
		
		}
		
	}
	
	public class SmallIntestine extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notSIntestineStart;
		
		public SmallIntestine(){  //constructor
				
			System.out.println("Entered SmallIntestine Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Small Intestine");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();

			url = SPBStudy.class.getResource("smallLargeDiag.jpg");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notSIntestineStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notSIntestineStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("SmallIntestineStart")){
					
					notSIntestineStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the ", 140, 100);
				g.drawString("digestive system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the ", 120, 100);
				g.drawString("digestive system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showDig();
			
			}
		
		}
		
	}
	
	public class LargeIntestine extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notLIntestineStart;
		
		public LargeIntestine(){  //constructor
				
			System.out.println("Entered LargeIntestine Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Large Intestine");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();

			url = SPBStudy.class.getResource("smallLargeDiag.jpg");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notLIntestineStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notLIntestineStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("LargeIntestineStart")){
					
					notLIntestineStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the ", 140, 100);
				g.drawString("digestive system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the ", 120, 100);
				g.drawString("digestive system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showDig();
			
			}
		
		}
		
	}
	
	public class Liver extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notLiverStart;
		
		public Liver(){  //constructor
				
			System.out.println("Entered Liver Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Liver");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("liverDiag.jpg");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notLiverStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notLiverStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("LiverStart")){
					
					notLiverStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);

			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the ", 140, 100);
				g.drawString("digestive system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the ", 120, 100);
				g.drawString("digestive system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showDig();
			
			}
		
		}
		
	}
	
	public class Pancreas extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notPancreasStart;
		
		public Pancreas(){  //constructor
				
			System.out.println("Entered Pancreas Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Pancreas");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();

			url = SPBStudy.class.getResource("pancDiag.jpg");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notPancreasStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notPancreasStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("PancreasStart")){
					
					notPancreasStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(125, 375, 500, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);

			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(isEndo && !isDig){
					
				if(marS && !peaS){
				
					g.drawImage(marTalk, 0, 0, this);
					g.drawImage(speech, 100, 0, 200, 150, this);
					g.drawString("Click 'Back'", 160, 90);
					g.drawString("to go back to the ", 140, 100);
					g.drawString("endocrine system page", 140, 110);
				
				}
			
				else if(!marS && peaS){
				
					g.drawImage(peaTalk, 0, 0, 100, 200, this);
					g.drawImage(speech, 100, 0, 200, 150, this);
					g.drawString("Click 'Back'", 140, 90);
					g.drawString("to go back to the ", 120, 100);
					g.drawString("endocrine system page", 140, 110);
					
				}
					
			}
				
			if(!isEndo && isDig){
				
				if(marS && !peaS){
				
					g.drawImage(marTalk, 0, 0, this);
					g.drawImage(speech, 100, 0, 200, 150, this);
					g.drawString("Click 'Back'", 160, 90);
					g.drawString("to go back to the ", 140, 100);
					g.drawString("digestive system page", 140, 110);
				
				}
			
				else if(!marS && peaS){
				
					g.drawImage(peaTalk, 0, 0, 100, 200, this);
					g.drawImage(speech, 100, 0, 200, 150, this);
					g.drawString("Click 'Back'", 140, 90);
					g.drawString("to go back to the ", 120, 100);
					g.drawString("digestive system page", 140, 110);
					
				}
				
			}
		
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				if(isEndo && !isDig){
					
					ba.showEndo();
					
				}
				
				if(!isEndo && isDig){
				
					ba.showDig();
					
				}
			
			}
		
		}
		
	}
	
	//START FEM REPRO ORGANS
	
	public class FallopianTubes extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notFallopianStart;
		
		public FallopianTubes(){  //constructor
				
			System.out.println("Entered FallopianTubes Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Fallopian Tubes");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("fallTubesDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notFallopianStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notFallopianStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("FallopianTubesStart")){
					
					notFallopianStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the female", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the female", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showFemRepro();
			
			}
		
		}
		
	}
	
	public class Ovaries extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notOvaryStart;
		
		public Ovaries(){  //constructor
				
			System.out.println("Entered Ovaries Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Ovaries");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("cervixOvaryUterusDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notOvaryStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notOvaryStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("OvariesStart")){
					
					notOvaryStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
		
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(isEndo && !isFRepro){
					
				if(marS && !peaS){
				
					g.drawImage(marTalk, 0, 0, this);
					g.drawImage(speech, 100, 0, 200, 150, this);
					g.drawString("Click 'Back'", 160, 90);
					g.drawString("to go back to the ", 140, 100);
					g.drawString("endocrine system page", 140, 110);
				
				}
			
				else if(!marS && peaS){
				
					g.drawImage(peaTalk, 0, 0, 100, 200, this);
					g.drawImage(speech, 100, 0, 200, 150, this);
					g.drawString("Click 'Back'", 140, 90);
					g.drawString("to go back to the ", 120, 100);
					g.drawString("endocrine system page", 140, 110);
					
				}
					
			}
				
			if(!isEndo && isFRepro){
				
				if(marS && !peaS){
				
					g.drawImage(marTalk, 0, 0, this);
					g.drawImage(speech, 100, 0, 200, 150, this);
					g.drawString("Click 'Back'", 160, 90);
					g.drawString("to go back to the female", 120, 100);
					g.drawString("reproductive system page", 140, 110);
				
				}
			
				else if(!marS && peaS){
				
					g.drawImage(peaTalk, 0, 0, 100, 200, this);
					g.drawImage(speech, 100, 0, 200, 150, this);
					g.drawString("Click 'Back'", 140, 90);
					g.drawString("to go back to the female", 120, 100);
					g.drawString("reproductive system page", 140, 110);
					
				}
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				if(isEndo && !isFRepro){
					
					ba.showEndo();
					
				}
				
				if(!isEndo && isFRepro){
				
					ba.showFemRepro();
					
				}
			
			}
		
		}
		
	}
	
	public class Vagina extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notVaginaStart;
		
		public Vagina(){  //constructor
				
			System.out.println("Entered Vagina Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Vagina");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("vaginaDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notVaginaStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notVaginaStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("VaginaStart")){
					
					notVaginaStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the female", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the female", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showFemRepro();
			
			}
		
		}
		
	}
	
	public class Cervix extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notCervixStart;
		
		public Cervix(){  //constructor
				
			System.out.println("Entered Cervix Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Cervix");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("cervixOvaryUterusDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notCervixStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notCervixStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("CervixStart")){
					
					notCervixStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(photo, 25, 200, 300, 200, this);
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the female", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the female", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showFemRepro();
			
			}
		
		}
		
	}
	
	public class Uterus extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notUterusStart;
		
		public Uterus(){  //constructor
				
			System.out.println("Entered Uterus Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Uterus");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("cervixOvaryUterusDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notUterusStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notUterusStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("UterusStart")){
					
					notUterusStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(photo, 25, 200, 300, 200, this);
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the female", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the female", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showFemRepro();
			
			}
		
		}
		
	}
	
	//START MALE REPRO ORGANS
	
	public class Penis extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notPenisStart;
		
		public Penis(){  //constructor
				
			System.out.println("Entered Penis Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Penis");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("penisDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notPenisStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notPenisStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("PenisStart")){
					
					notPenisStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the male", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the male", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showMaleRepro();
			
			}
		
		}
		
	}
	
	public class Testes extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notTestesStart;
		
		public Testes(){  //constructor
			
			System.out.println("Entered Testes Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Testes");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("scrotumDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notTestesStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notTestesStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("TestesStart")){
					
					notTestesStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(75, 375, 475, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(isEndo && !isMRepro){
					
				if(marS && !peaS){
				
					g.drawImage(marTalk, 0, 0, this);
					g.drawImage(speech, 100, 0, 200, 150, this);
					g.drawString("Click 'Back'", 160, 90);
					g.drawString("to go back to the ", 140, 100);
					g.drawString("endocrine system page", 140, 110);
				
				}
			
				else if(!marS && peaS){
				
					g.drawImage(peaTalk, 0, 0, 100, 200, this);
					g.drawImage(speech, 100, 0, 200, 150, this);
					g.drawString("Click 'Back'", 140, 90);
					g.drawString("to go back to the ", 120, 100);
					g.drawString("endocrine system page", 140, 110);
					
				}
					
			}
				
			if(!isEndo && isMRepro){
				
				if(marS && !peaS){
				
					g.drawImage(marTalk, 0, 0, this);
					g.drawImage(speech, 100, 0, 200, 150, this);
					g.drawString("Click 'Back'", 160, 90);
					g.drawString("to go back to the male", 120, 100);
					g.drawString("reproductive system page", 140, 110);
				
				}
			
				else if(!marS && peaS){
				
					g.drawImage(peaTalk, 0, 0, 100, 200, this);
					g.drawImage(speech, 100, 0, 200, 150, this);
					g.drawString("Click 'Back'", 140, 90);
					g.drawString("to go back to the male", 120, 100);
					g.drawString("reproductive system page", 140, 110);
					
				}
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				if(isEndo && !isMRepro){
					
					ba.showEndo();
					
				}
				
				if(!isEndo && isMRepro){
				
					ba.showMaleRepro();
					
				}
			
			}
		
		}
		
	}
	
	public class Prostate extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notProstateStart;
		
		public Prostate(){  //constructor
				
			System.out.println("Entered Prostate Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Prostate");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("prostateDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notProstateStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notProstateStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("ProstateStart")){
					
					notProstateStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the male", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the male", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showMaleRepro();
			
			}
		
		}
		
	}
	
	public class Scrotum extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notScrotumStart;
		
		public Scrotum(){  //constructor
				
			System.out.println("Entered Scrotum Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Scrotum");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("scrotumDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notScrotumStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notScrotumStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("ScrotumStart")){
					
					notScrotumStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the male", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the male", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showMaleRepro();
			
			}
		
		}
		
	}
	
	public class VasDeferens extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notVasDeferensStart;
		
		public VasDeferens(){  //constructor
				
			System.out.println("Entered VasDeferens Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Vas Deferens");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("vasDefDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notVasDeferensStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notVasDeferensStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("VasDeferensStart")){
					
					notVasDeferensStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the male", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the male", 120, 100);
				g.drawString("reproductive system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showMaleRepro();
			
			}
		
		}
		
	}
	
	//START URIN ORGANS
	
	public class SweatGlands extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notSweatGlanStart;
		
		public SweatGlands(){  //constructor
				
			System.out.println("Entered SweatGlands Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Sweat Glands");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("sweatDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notSweatGlanStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notSweatGlanStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("SweatGlandsStart")){
					
					notSweatGlanStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 350, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the", 140, 100);
				g.drawString("excretory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the", 120, 100);
				g.drawString("excretory system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showUrin();
			
			}
			
			
		
		}
		
	}
	
	public class Kidneys extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notKidneyStart;
		
		public Kidneys(){  //constructor
				
			System.out.println("Entered Kidneys Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Kidneys");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("kidneyDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			
			notKidneyStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notKidneyStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("KidneysStart")){
					
					notKidneyStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 350, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the", 140, 100);
				g.drawString("excretory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the", 120, 100);
				g.drawString("excretory system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showUrin();
			
			}
		
		}
		
	}
	
	public class Ureters extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notUretersStart;
		
		public Ureters(){  //constructor
				
			System.out.println("Entered Ureters Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Ureters");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("uretersDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			
			notUretersStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notUretersStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("UretersStart")){
					
					notUretersStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 350, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the", 140, 100);
				g.drawString("excretory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the", 120, 100);
				g.drawString("excretory system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showUrin();
			
			}
		
		}
		
	}
	
	public class Bladder extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notBladderStart;
		
		public Bladder(){  //constructor
				
			System.out.println("Entered Bladder Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Urinary Bladder");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("bladdDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notBladderStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notBladderStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("BladderStart")){
					
					notBladderStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 350, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);

			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the", 140, 100);
				g.drawString("excretory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the", 120, 100);
				g.drawString("excretory system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showUrin();
			
			}
		
		}
		
	}
	
	public class RenalArteryVein extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notRenalAVStart;
		
		public RenalArteryVein(){  //constructor
				
			System.out.println("Entered RenalArteryVein Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Renal Arteries and Veins");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();

			url = SPBStudy.class.getResource("renArtVeinDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notRenalAVStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notRenalAVStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("RenalArteryVeinStart")){
					
					notRenalAVStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 350, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);

			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the", 140, 100);
				g.drawString("excretory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the", 120, 100);
				g.drawString("excretory system page", 140, 110);
				
			}
			
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showUrin();
			
			}
		
		}
		
	}
							
	//START CIRC ORGANS
	
	public class Heart extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notHeartStart;
		
		public Heart(){  //constructor
				
			System.out.println("Entered Heart Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Heart");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();

			url = SPBStudy.class.getResource("heartPumpAnim.gif");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notHeartStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notHeartStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("HeartStart")){
					
					notHeartStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 575, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(0, 390, 700, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);

			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the", 140, 100);
				g.drawString("circulatory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the", 120, 100);
				g.drawString("circulatory system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showCirc();
			
			}
		
		}
		
	}
	
	public class Arteries extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notArteriesStart;
		
		public Arteries(){  //constructor
			
			System.out.println("Entered Arteries Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Arteries");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();

			url = SPBStudy.class.getResource("arteriesDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notArteriesStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notArteriesStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("ArteriesStart")){
					
					notArteriesStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			

			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the", 140, 100);
				g.drawString("circulatory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the", 120, 100);
				g.drawString("circulatory system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showCirc();
			
			}
		
		}
		
	}
	
	
	
	public class Veins extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notVeinStart;
		
		public Veins(){  //constructor
				
			System.out.println("Entered Veins Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Veins");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("veinsDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notVeinStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notVeinStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("VeinsStart")){
					
					notVeinStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);

			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the", 140, 100);
				g.drawString("circulatory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the", 120, 100);
				g.drawString("circulatory system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showCirc();
			
			}
		
		}
		
	}
	
	public class Capillaries extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notCapillariesStart;
		
		public Capillaries(){  //constructor
				
			System.out.println("Entered Capillaries Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Capillaries");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();

			url = SPBStudy.class.getResource("capillDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notCapillariesStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notCapillariesStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("CapillariesStart")){
					
					notCapillariesStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the", 140, 100);
				g.drawString("circulatory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the", 120, 100);
				g.drawString("circulatory system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showCirc();
			
			}
		
		}
		
	}
	
	public class Aorta extends JPanel implements ActionListener{
	
		JLabel title;  //declare components, variables
		JButton back;
		JLabel desc;
		Image photo;
		Image diag;
		boolean notAortaStart;
		
		public Aorta(){  //constructor
				
			System.out.println("Entered Aorta Constructor");  //test if it entered constructor (println)
			setLayout(null);  //setLayout
			title = new JLabel("Aorta");//instantiate components
			back = new JButton("Back");
			desc = new JLabel();
			url = SPBStudy.class.getResource("aortaDiag.png");
			diag = Toolkit.getDefaultToolkit().getImage(url);
			
			notAortaStart = true;//initialize variables
			
			readIt.close();
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("OrganDesc.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("OrganDesc.txt not found");  //to catch FileNotFoundException
			
			}
			
			while(notAortaStart){
			
				curr = readIt.nextLine();
				
				if(curr.equals("AortaStart")){
					
					notAortaStart = false;
					desc.setText(readIt.nextLine());
				
				}
				
			}
			
			title.setFont(new Font("Times", Font.BOLD, 15));
			title.setBounds(400, 50, 200, 100);
			back.setBounds(250, 550, 200, 50);
			back.addActionListener(this);
			desc.setFont(new Font("Times", Font.PLAIN, 15));
			desc.setBounds(150, 375, 400, 200);
			 
			//add components
			add(desc);
			add(title);
			add(back);
			
		}	
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(diag, 375, 200, 300, 200, this);
			
			if(marS && !peaS){
				
				g.drawImage(marTalk, 0, 0, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 160, 90);
				g.drawString("to go back to the", 140, 100);
				g.drawString("circulatory system page", 140, 110);
				
			}
			
			else if(!marS && peaS){
				
				g.drawImage(peaTalk, 0, 0, 100, 200, this);
				g.drawImage(speech, 100, 0, 200, 150, this);
				g.drawString("Click 'Back'", 140, 90);
				g.drawString("to go back to the", 120, 100);
				g.drawString("circulatory system page", 140, 110);
				
			}
				
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				
				ba.showCirc();
			
			}
		
		}
		
	}

}
