import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Scanner;
import java.net.URL;
import java.io.*;

public class SPBQuiz{

	Base ba;
	
	EndoQuiz equiz;
	RespQuiz rquiz;
	DigQuiz dquiz;
	FemReproQuiz frquiz;
	MaleReproQuiz mrquiz;
	UrinQuiz uquiz;
	CircQuiz cquiz;
	URL url;
	
	Scanner readIt;

	public SPBQuiz(Base b){
	
		ba = b;
		
		System.out.println("Entered SPBQuiz Constructor");  //test if it entered constructor (println)
		
		equiz = new EndoQuiz();
		rquiz = new RespQuiz();
		dquiz = new DigQuiz();
		frquiz = new FemReproQuiz();
		mrquiz = new MaleReproQuiz();
		uquiz = new UrinQuiz();
		cquiz = new CircQuiz();
			
		try{  //use File IO to read a txt file and put it in info string
			
			readIt = new Scanner(new File("QuizPregunts.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
		}catch(FileNotFoundException e){
		
			System.err.println("QuizPregunts.txt not found");  //to catch FileNotFoundException
			
		}
		
	}
	
	class EndoQuiz extends JPanel implements ActionListener, MouseListener{
		
		JLabel al, bl, cl;
		JLabel ag, bg, cg;
		JRadioButton crb1, crb2, crb3;
		JRadioButton brb1, brb2, brb3;
		JButton submit, back;
		ButtonGroup bs, cs;
		JTextArea a1;
		String a, b, c;
		Image org;
		
		public EndoQuiz(){
			
			setLayout(null);
			addMouseListener(this);
			
			System.out.println("Entered EndoQuiz Constructor");
			
			a =	findLine("EndoA");
			b =	findLine("EndoB");
			c =	findLine("EndoC");
			
			al = new JLabel(a);
			bl = new JLabel(b);
			cl = new JLabel(c);
			cl.setBounds(50, 125, 300, 20);
			bl.setBounds(50, 300, 300, 20);
			al.setBounds(350, 125, 300, 50);
			crb1 = new JRadioButton("Digestive");
			crb2 = new JRadioButton("Male Reproductive");
			crb3 = new JRadioButton("Respiratory");
			crb1.setBounds(50, 150, 100, 20);
			crb2.setBounds(50, 175, 150, 20);
			crb3.setBounds(50, 200, 100, 20);
			cs = new ButtonGroup();
			brb1 = new JRadioButton();
			brb2 = new JRadioButton();
			brb3 = new JRadioButton();
			brb1.setBounds(20, 388, 20, 20);
			brb2.setBounds(280, 415, 20, 20);
			brb3.setBounds(36, 570, 20, 20);
			bs = new ButtonGroup();
			a1 = new JTextArea();
			a1.setLineWrap(true);
			a1.setBounds(350, 180, 300, 400);
			url = SPBHomeHelp.class.getResource("femEndoDiag.gif");
			org = Toolkit.getDefaultToolkit().getImage(url);
			submit = new JButton("Submit");
			submit.setBounds(500, 600, 100, 30);
			submit.addActionListener(this);
			back = new JButton("Back to Home");
			back.setBounds(500, 600, 150, 30);
			back.setVisible(false);
			back.addActionListener(this);
			ag = new JLabel("Incorrect");
			bg = new JLabel("Incorrect");
			cg = new JLabel("Incorrect");
			cg.setBounds(115, 236, 100, 20); 
			bg.setBounds(111, 611, 100, 20); 
			ag.setBounds(364, 587, 100, 20);
			cg.setVisible(false);
			bg.setVisible(false);
			ag.setVisible(false);
			
			cs.add(crb1);
			cs.add(crb2);
			cs.add(crb3);
			bs.add(brb1);
			bs.add(brb2);
			bs.add(brb3);
			add(cl);
			add(bl);
			add(al);
			add(crb1);
			add(crb2);
			add(crb3);
			add(brb1);
			add(brb2);
			add(brb3);
			add(a1);
			add(submit);
			add(back);
			add(ag);
			add(bg);
			add(cg);
			
		}
		
		public String findLine(String word){
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("QuizPregunts.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("QuizPregunts.txt not found");  //to catch FileNotFoundException
			
			}
			
			String temp = "";
			boolean notLine = true;
		
			while(notLine){
			
				String curr = readIt.nextLine();
				
				if(curr.equals(word)){
					
					notLine = false;
					temp = readIt.nextLine();
				
				}
				
			}
			
			return temp;
			
		}
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(org,45,320,200,275,this);
			g.drawLine(138, 420, 268, 420);
			g.drawLine(135, 393, 30, 393);
			g.drawLine(125, 470, 41, 566);
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == submit){
			submit.setVisible(false);
				back.setVisible(true);
				if(crb2.isSelected()){
				
					cg.setText("Correct");
					
				}	
				
				if(brb1.isSelected()){
					
					bg.setText("Correct");
				
				}
				
				if(a1.getText().contains("adrenal gland") && a1.getText().contains("adrenaline") && a1.getText().contains("heart rate")){
				
					ag.setText("Correct");
					
				}
				ag.setVisible(true);
				bg.setVisible(true);
				cg.setVisible(true);
			}
			if(e.getSource() == back){
			
				ba.showHome();
				
			}
		}
		
		public void mouseClicked(MouseEvent e){
			
			System.out.println(e.getX() + "," + e.getY());
			
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
		
	}
	
	class RespQuiz extends JPanel implements ActionListener, MouseListener{
		
		JLabel al, bl, cl;
		JLabel ag, bg, cg;
		JRadioButton crb1, crb2, crb3;
		JRadioButton brb1, brb2, brb3;
		JButton submit, back;
		ButtonGroup bs, cs;
		JTextArea a1;
		String a, b, c;
		Image org;
		
		public RespQuiz(){
		
			setLayout(null);
			addMouseListener(this);
			
			System.out.println("Entered RespQuiz Constructor");
			
			a =	findLine("RespA");
			b =	findLine("RespB");
			c =	findLine("RespC");
			
			al = new JLabel(a);
			bl = new JLabel(b);
			cl = new JLabel(c);
			cl.setBounds(50, 125, 300, 20);
			bl.setBounds(50, 280, 500, 40);
			al.setBounds(350, 125, 300, 70);
			crb1 = new JRadioButton("Trachea");
			crb2 = new JRadioButton("Lungs");
			crb3 = new JRadioButton("Larynx");
			crb1.setBounds(50, 150, 100, 20);
			crb2.setBounds(50, 175, 150, 20);
			crb3.setBounds(50, 200, 100, 20);
			cs = new ButtonGroup();
			brb1 = new JRadioButton();
			brb2 = new JRadioButton();
			brb3 = new JRadioButton();
			brb1.setBounds(20, 388, 20, 20);
			brb2.setBounds(280, 415, 20, 20);
			brb3.setBounds(36, 570, 20, 20);
			bs = new ButtonGroup();
			a1 = new JTextArea();
			a1.setLineWrap(true);
			a1.setBounds(350, 200, 300, 400);
			url = SPBHomeHelp.class.getResource("respDiag.jpg");
			org = Toolkit.getDefaultToolkit().getImage(url);
			submit = new JButton("Submit");
			submit.setBounds(500, 600, 100, 30);
			submit.addActionListener(this);
			back = new JButton("Back to Home");
			back.setBounds(500, 600, 150, 30);
			back.setVisible(false);
			back.addActionListener(this);
			ag = new JLabel("Incorrect");
			bg = new JLabel("Incorrect");
			cg = new JLabel("Incorrect");
			cg.setBounds(115, 236, 100, 20); 
			bg.setBounds(111, 611, 100, 20); 
			ag.setBounds(359, 612, 100, 20);
			cg.setVisible(false);
			bg.setVisible(false);
			ag.setVisible(false);
			
			cs.add(crb1);
			cs.add(crb2);
			cs.add(crb3);
			bs.add(brb1);
			bs.add(brb2);
			bs.add(brb3);
			add(cl);
			add(bl);
			add(al);
			add(crb1);
			add(crb2);
			add(crb3);
			add(brb1);
			add(brb2);
			add(brb3);
			add(a1);
			add(submit);
			add(back);
			add(ag);
			add(bg);
			add(cg);
			
		}
		
		public String findLine(String word){
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("QuizPregunts.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("QuizPregunts.txt not found");  //to catch FileNotFoundException
			
			}
			
			String temp = "";
			boolean notLine = true;
		
			while(notLine){
			
				String curr = readIt.nextLine();
				
				if(curr.equals(word)){
					
					notLine = false;
					temp = readIt.nextLine();
				
				}
				
			}
			
			return temp;
			
		}
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(org,45,320,200,275,this);
			g.drawLine(136, 426, 268, 420);
			g.drawLine(127, 488, 30, 393);
			g.drawLine(142, 534, 41, 566);
			
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == submit){
			submit.setVisible(false);
				back.setVisible(true);
				if(crb3.isSelected()){
				
					cg.setText("Correct");
					
				}	
				
				if(brb3.isSelected()){
					
					bg.setText("Correct");
				
				}
				
				if(a1.getText().contains("pressure") && a1.getText().contains("lung") && a1.getText().contains("exhale")){
				
					ag.setText("Correct");
					
				}
				ag.setVisible(true);
				bg.setVisible(true);
				cg.setVisible(true);
			}
			if(e.getSource() == back){
			
				ba.showHome();
				
			}
		}
		
		public void mouseClicked(MouseEvent e){
			System.out.println(e.getX() + "," + e.getY());
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
		
	}
	
	class DigQuiz extends JPanel implements ActionListener, MouseListener{
		
		JLabel al, bl, cl;
		
		JLabel ag, bg, cg;
		JRadioButton crb1, crb2, crb3;
		JRadioButton brb1, brb2, brb3;
		JButton submit, back;
		ButtonGroup bs, cs;
		JTextArea a1;
		String a, b, c;
		Image org;
		
		public DigQuiz(){
		
			setLayout(null);
			addMouseListener(this);
			
			System.out.println("Entered DigQuiz Constructor");
			
			a =	findLine("DigA");
			b =	findLine("DigB");
			c =	findLine("DigC");
			
			al = new JLabel(a);
			bl = new JLabel(b);
			cl = new JLabel(c);
			cl.setBounds(50, 125, 300, 20);
			bl.setBounds(50, 300, 300, 20);
			al.setBounds(350, 125, 300, 50);
			crb1 = new JRadioButton("It does get burned; it just grows back quickly");
			crb2 = new JRadioButton("Because of a layer of mucous");
			crb3 = new JRadioButton("Pepsinogen neutralizes the acid");
			crb1.setBounds(50, 150, 300, 20);
			crb2.setBounds(50, 175, 300, 20);
			crb3.setBounds(50, 200, 300, 20);
			cs = new ButtonGroup();
			brb1 = new JRadioButton();
			brb2 = new JRadioButton();
			brb3 = new JRadioButton();
			brb1.setBounds(20, 388, 20, 20);
			brb2.setBounds(280, 415, 20, 20);
			brb3.setBounds(36, 570, 20, 20);
			bs = new ButtonGroup();
			a1 = new JTextArea();
			a1.setLineWrap(true);
			a1.setBounds(350, 180, 300, 400);
			url = SPBHomeHelp.class.getResource("digDiag.jpg");
			org = Toolkit.getDefaultToolkit().getImage(url);
			submit = new JButton("Submit");
			submit.setBounds(500, 600, 100, 30);
			submit.addActionListener(this);
			back = new JButton("Back to Home");
			back.setBounds(500, 600, 150, 30);
			back.setVisible(false);
			back.addActionListener(this);
			ag = new JLabel("Incorrect");
			bg = new JLabel("Incorrect");
			cg = new JLabel("Incorrect");
			cg.setBounds(115, 236, 100, 20); 
			bg.setBounds(111, 611, 100, 20); 
			ag.setBounds(364, 587, 100, 20);
			cg.setVisible(false);
			bg.setVisible(false);
			ag.setVisible(false);
			
			cs.add(crb1);
			cs.add(crb2);
			cs.add(crb3);
			bs.add(brb1);
			bs.add(brb2);
			bs.add(brb3);
			add(cl);
			add(bl);
			add(al);
			add(crb1);
			add(crb2);
			add(crb3);
			add(brb1);
			add(brb2);
			add(brb3);
			add(a1);
			add(submit);
			add(back);
			add(ag);
			add(bg);
			add(cg);
			
		}
		
		public String findLine(String word){
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("QuizPregunts.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("QuizPregunts.txt not found");  //to catch FileNotFoundException
			
			}
			
			String temp = "";
			boolean notLine = true;
		
			while(notLine){
			
				String curr = readIt.nextLine();
				
				if(curr.equals(word)){
					
					notLine = false;
					temp = readIt.nextLine();
				
				}
				
			}
			
			return temp;
			
		}
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(org,45,320,200,275,this);
			g.drawLine(141, 487, 268, 420);
			g.drawLine(135, 393, 30, 393);
			g.drawLine(125, 470, 41, 566);
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == submit){
			submit.setVisible(false);
				back.setVisible(true);
				if(crb2.isSelected()){
				
					cg.setText("Correct");
					
				}	
				
				if(brb3.isSelected()){
					
					bg.setText("Correct");
				
				}
				
				if(a1.getText().contains("rectum") && a1.getText().contains("feces") && a1.getText().contains("water")){
				
					ag.setText("Correct");
					
				}
				ag.setVisible(true);
				bg.setVisible(true);
				cg.setVisible(true);
			}
			if(e.getSource() == back){
			
				ba.showHome();
				
			}
		}
		
		public void mouseClicked(MouseEvent e){
			System.out.println(e.getX() + "," + e.getY());
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
		
	}
	
	class FemReproQuiz extends JPanel implements ActionListener, MouseListener{
	
		JLabel al, bl, cl;
		JLabel ag, bg, cg;
		JRadioButton crb1, crb2, crb3;
		JRadioButton brb1, brb2, brb3;
		JButton submit, back;
		ButtonGroup bs, cs;
		JTextArea a1;
		String a, b, c;
		Image org;
	
		public FemReproQuiz(){
		
			setLayout(null);
			addMouseListener(this);
			
			System.out.println("Entered FemReproQuiz Constructor");
			
			a =	findLine("FemReproA");
			b =	findLine("FemReproB");
			c =	findLine("FemReproC");
			
			al = new JLabel(a);
			bl = new JLabel(b);
			cl = new JLabel(c);
			cl.setBounds(50, 105, 300, 40);
			bl.setBounds(50, 290, 300, 30);
			al.setBounds(350, 125, 300, 50);
			crb1 = new JRadioButton("Ovary");
			crb2 = new JRadioButton("Uterus");
			crb3 = new JRadioButton("Vagina");
			crb1.setBounds(50, 150, 100, 20);
			crb2.setBounds(50, 175, 150, 20);
			crb3.setBounds(50, 200, 100, 20);
			cs = new ButtonGroup();
			brb1 = new JRadioButton();
			brb2 = new JRadioButton();
			brb3 = new JRadioButton();
			brb1.setBounds(20, 388, 20, 20);
			brb2.setBounds(280, 415, 20, 20);
			brb3.setBounds(36, 570, 20, 20);
			bs = new ButtonGroup();
			a1 = new JTextArea();
			a1.setLineWrap(true);
			a1.setBounds(350, 180, 300, 400);
			url = SPBHomeHelp.class.getResource("femReproDiag.jpg");
			org = Toolkit.getDefaultToolkit().getImage(url);
			submit = new JButton("Submit");
			submit.setBounds(500, 600, 100, 30);
			submit.addActionListener(this);
			back = new JButton("Back to Home");
			back.setBounds(500, 600, 150, 30);
			back.setVisible(false);
			back.addActionListener(this);
			ag = new JLabel("Incorrect");
			bg = new JLabel("Incorrect");
			cg = new JLabel("Incorrect");
			cg.setBounds(115, 236, 100, 20); 
			bg.setBounds(111, 611, 100, 20); 
			ag.setBounds(364, 587, 100, 20);
			cg.setVisible(false);
			bg.setVisible(false);
			ag.setVisible(false);
			
			cs.add(crb1);
			cs.add(crb2);
			cs.add(crb3);
			bs.add(brb1);
			bs.add(brb2);
			bs.add(brb3);
			add(cl);
			add(bl);
			add(al);
			add(crb1);
			add(crb2);
			add(crb3);
			add(brb1);
			add(brb2);
			add(brb3);
			add(a1);
			add(submit);
			add(back);
			add(ag);
			add(bg);
			add(cg);
			
		}
		
		public String findLine(String word){
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("QuizPregunts.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("QuizPregunts.txt not found");  //to catch FileNotFoundException
			
			}
			
			String temp = "";
			boolean notLine = true;
		
			while(notLine){
			
				String curr = readIt.nextLine();
				
				if(curr.equals(word)){
					
					notLine = false;
					temp = readIt.nextLine();
				
				}
				
			}
			
			return temp;
			
		}
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(org,45,320,200,275,this);
			g.drawLine(138, 420, 268, 420);
			g.drawLine(61, 420, 30, 393);
			g.drawLine(138, 530, 41, 566);
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == submit){
			submit.setVisible(false);
				back.setVisible(true);
				if(crb1.isSelected()){
				
					cg.setText("Correct");
					
				}	
				
				if(brb2.isSelected()){
					
					bg.setText("Correct");
				
				}
				
				if(a1.getText().contains("uterus") && a1.getText().contains("sperm") && a1.getText().contains("fallopian tube")){
				
					ag.setText("Correct");
					
				}
				ag.setVisible(true);
				bg.setVisible(true);
				cg.setVisible(true);
			}
			if(e.getSource() == back){
			
				ba.showHome();
				
			}
		}
		
		public void mouseClicked(MouseEvent e){
			System.out.println(e.getX() + "," + e.getY());
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
		
	}
	
	class MaleReproQuiz extends JPanel implements ActionListener, MouseListener{
	
		JLabel al, bl, cl;
		JLabel ag, bg, cg;
		JRadioButton crb1, crb2, crb3;
		JRadioButton brb1, brb2, brb3;
		JButton submit, back;
		ButtonGroup bs, cs;
		JTextArea a1;
		String a, b, c;
		Image org;
	
		public MaleReproQuiz(){
		
			setLayout(null);
			addMouseListener(this);
			
			System.out.println("Entered MaleReproQuiz Constructor");
			
			a =	findLine("MaleReproA");
			b =	findLine("MaleReproB");
			c =	findLine("MaleReproC");
			
			al = new JLabel(a);
			bl = new JLabel(b);
			cl = new JLabel(c);
			cl.setBounds(40, 105, 300, 40);
			bl.setBounds(50, 300, 300, 20);
			al.setBounds(350, 115, 300, 70);
			crb1 = new JRadioButton("Testes");
			crb2 = new JRadioButton("Penis");
			crb3 = new JRadioButton("Prostate");
			crb1.setBounds(50, 150, 100, 20);
			crb2.setBounds(50, 175, 150, 20);
			crb3.setBounds(50, 200, 100, 20);
			cs = new ButtonGroup();
			brb1 = new JRadioButton();
			brb2 = new JRadioButton();
			brb3 = new JRadioButton();
			brb1.setBounds(20, 388, 20, 20);
			brb2.setBounds(280, 415, 20, 20);
			brb3.setBounds(36, 570, 20, 20);
			bs = new ButtonGroup();
			a1 = new JTextArea();
			a1.setLineWrap(true);
			a1.setBounds(360, 180, 300, 400);
			url = SPBHomeHelp.class.getResource("maleReproDiag.png");
			org = Toolkit.getDefaultToolkit().getImage(url);
			submit = new JButton("Submit");
			submit.setBounds(500, 600, 100, 30);
			submit.addActionListener(this);
			back = new JButton("Back to Home");
			back.setBounds(500, 600, 150, 30);
			back.setVisible(false);
			back.addActionListener(this);
			ag = new JLabel("Incorrect");
			bg = new JLabel("Incorrect");
			cg = new JLabel("Incorrect");
			cg.setBounds(115, 236, 100, 20); 
			bg.setBounds(111, 611, 100, 20); 
			ag.setBounds(364, 587, 100, 20);
			cg.setVisible(false);
			bg.setVisible(false);
			ag.setVisible(false);
			
			cs.add(crb1);
			cs.add(crb2);
			cs.add(crb3);
			bs.add(brb1);
			bs.add(brb2);
			bs.add(brb3);
			add(cl);
			add(bl);
			add(al);
			add(crb1);
			add(crb2);
			add(crb3);
			add(brb1);
			add(brb2);
			add(brb3);
			add(a1);
			add(submit);
			add(back);
			add(ag);
			add(bg);
			add(cg);
		}
		
		public String findLine(String word){
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("QuizPregunts.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("QuizPregunts.txt not found");  //to catch FileNotFoundException
			
			}
			
			String temp = "";
			boolean notLine = true;
		
			while(notLine){
			
				String curr = readIt.nextLine();
				
				if(curr.equals(word)){
					
					notLine = false;
					temp = readIt.nextLine();
				
				}
				
			}
			
			return temp;
			
		}
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(org,45,320,200,275,this);
			g.drawLine(133, 488, 268, 420);
			g.drawLine(56, 508, 30, 393);
			g.drawLine(100, 544, 41, 566);
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == submit){
			submit.setVisible(false);
				back.setVisible(true);
				if(crb2.isSelected()){
				
					cg.setText("Correct");
					
				}	
				
				if(brb3.isSelected()){
					
					bg.setText("Correct");
				
				}
				
				if(a1.getText().contains("temperature") && a1.getText().contains("sperm") && a1.getText().contains("away")){
				
					ag.setText("Correct");
					
				}
				ag.setVisible(true);
				bg.setVisible(true);
				cg.setVisible(true);
			}
			if(e.getSource() == back){
			
				ba.showHome();
				
			}
		}
		
		public void mouseClicked(MouseEvent e){
			System.out.println(e.getX() + "," + e.getY());
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
		
	}
	
	class UrinQuiz extends JPanel implements ActionListener, MouseListener{
	
		JLabel al, bl, cl;
		JLabel ag, bg, cg;
		JRadioButton crb1, crb2, crb3;
		JRadioButton brb1, brb2, brb3;
		JButton submit, back;
		ButtonGroup bs, cs;
		JTextArea a1;
		String a, b, c;
		Image org;
	
		public UrinQuiz(){
		
			setLayout(null);
			addMouseListener(this);
			
			System.out.println("Entered UrinQuiz Constructor");
			
			a =	findLine("UrinA");
			b =	findLine("UrinB");
			c =	findLine("UrinC");
			
			al = new JLabel(a);
			bl = new JLabel(b);
			cl = new JLabel(c);
			cl.setBounds(50, 125, 300, 20);
			bl.setBounds(50, 300, 300, 20);
			al.setBounds(350, 125, 300, 50);
			crb1 = new JRadioButton("Adrenal Glands");
			crb2 = new JRadioButton("All over the skin");
			crb3 = new JRadioButton("Stomach");
			crb1.setBounds(50, 150, 150, 20);
			crb2.setBounds(50, 175, 150, 20);
			crb3.setBounds(50, 200, 100, 20);
			cs = new ButtonGroup();
			brb1 = new JRadioButton();
			brb2 = new JRadioButton();
			brb3 = new JRadioButton();
			brb1.setBounds(20, 388, 20, 20);
			brb2.setBounds(280, 415, 20, 20);
			brb3.setBounds(36, 570, 20, 20);
			bs = new ButtonGroup();
			a1 = new JTextArea();
			a1.setLineWrap(true);
			a1.setBounds(350, 180, 300, 400);
			url = SPBHomeHelp.class.getResource("urinDiag.jpg");
			org = Toolkit.getDefaultToolkit().getImage(url);
			submit = new JButton("Submit");
			submit.setBounds(500, 600, 100, 30);
			submit.addActionListener(this);
			back = new JButton("Back to Home");
			back.setBounds(500, 600, 150, 30);
			back.setVisible(false);
			back.addActionListener(this);
			ag = new JLabel("Incorrect");
			bg = new JLabel("Incorrect");
			cg = new JLabel("Incorrect");
			cg.setBounds(115, 236, 100, 20); 
			bg.setBounds(111, 611, 100, 20); 
			ag.setBounds(364, 587, 100, 20);
			cg.setVisible(false);
			bg.setVisible(false);
			ag.setVisible(false);
			
			cs.add(crb1);
			cs.add(crb2);
			cs.add(crb3);
			bs.add(brb1);
			bs.add(brb2);
			bs.add(brb3);
			add(cl);
			add(bl);
			add(al);
			add(crb1);
			add(crb2);
			add(crb3);
			add(brb1);
			add(brb2);
			add(brb3);
			add(a1);
			add(submit);
			add(back);
			add(ag);
			add(bg);
			add(cg);
			
		}
		
		public String findLine(String word){
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("QuizPregunts.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("QuizPregunts.txt not found");  //to catch FileNotFoundException
			
			}
			
			String temp = "";
			boolean notLine = true;
		
			while(notLine){
			
				String curr = readIt.nextLine();
				
				if(curr.equals(word)){
					
					notLine = false;
					temp = readIt.nextLine();
				
				}
				
			}
			
			return temp;
			
		}
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(org,45,320,200,275,this);
			g.drawLine(138, 420, 268, 420);
			g.drawLine(164, 470, 30, 393);
			g.drawLine(152, 534, 41, 566);
			
			
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == submit){
			submit.setVisible(false);
				back.setVisible(true);
				if(crb2.isSelected()){
				
					cg.setText("Correct");
					
				}	
				
				if(brb2.isSelected()){
					
					bg.setText("Correct");
				
				}
				
				if(a1.getText().contains("bladder") && a1.getText().contains("ureter") && a1.getText().contains("kidney")){
				
					ag.setText("Correct");
					
				}
				ag.setVisible(true);
				bg.setVisible(true);
				cg.setVisible(true);
			}
			if(e.getSource() == back){
			
				ba.showHome();
				
			}
		}
		
		public void mouseClicked(MouseEvent e){
			System.out.println(e.getX() + "," + e.getY());
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
		
	}
	
	class CircQuiz extends JPanel implements ActionListener, MouseListener{
	
		JLabel al, bl, cl;
		JLabel ag, bg, cg;
		JRadioButton crb1, crb2, crb3;
		JRadioButton brb1, brb2;
		JButton submit, back;
		ButtonGroup bs, cs;
		JTextArea a1;
		String a, b, c;
		Image org;
	
		public CircQuiz(){
		
			setLayout(null);
			addMouseListener(this);
			
			System.out.println("Entered CircQuiz Constructor");
			
			a =	findLine("CircA");
			b =	findLine("CircB");
			c =	findLine("CircC");
			
			al = new JLabel(a);
			bl = new JLabel(b);
			cl = new JLabel(c);
			cl.setBounds(50, 125, 300, 20);
			bl.setBounds(50, 280, 300, 40);
			al.setBounds(350, 105, 300, 70);
			crb1 = new JRadioButton("From the heart to the rest of body");
			crb2 = new JRadioButton("From the brain to the limbs");
			crb3 = new JRadioButton("From all the body parts to the heart");
			crb1.setBounds(50, 150, 250, 20);
			crb2.setBounds(50, 175, 200, 20);
			crb3.setBounds(50, 200, 250, 20);
			cs = new ButtonGroup();
			brb1 = new JRadioButton();
			brb2 = new JRadioButton();
			brb1.setBounds(20, 388, 20, 20);
			brb2.setBounds(280, 415, 20, 20);
			bs = new ButtonGroup();
			a1 = new JTextArea();
			a1.setLineWrap(true);
			a1.setBounds(350, 180, 300, 400);
			url = SPBHomeHelp.class.getResource("circDiag.jpg");
			org = Toolkit.getDefaultToolkit().getImage(url);
			submit = new JButton("Submit");
			submit.setBounds(500, 600, 100, 30);
			submit.addActionListener(this);
			back = new JButton("Back to Home");
			back.setBounds(500, 600, 150, 30);
			back.setVisible(false);
			back.addActionListener(this);
			ag = new JLabel("Incorrect");
			bg = new JLabel("Incorrect");
			cg = new JLabel("Incorrect");
			cg.setBounds(115, 236, 100, 20); 
			bg.setBounds(111, 611, 100, 20); 
			ag.setBounds(364, 587, 100, 20);
			cg.setVisible(false);
			bg.setVisible(false);
			ag.setVisible(false); 
			
			cs.add(crb1);
			cs.add(crb2);
			cs.add(crb3);
			bs.add(brb1);
			bs.add(brb2);
			add(cl);
			add(bl);
			add(al);
			add(crb1);
			add(crb2);
			add(crb3);
			add(brb1);
			add(brb2);
			add(a1);
			add(submit);
			add(back);
			add(ag);
			add(bg);
			add(cg);
			
		}
		
		public String findLine(String word){
			
			try{  //use File IO to read a txt file and put it in info string
			
				readIt = new Scanner(new File("QuizPregunts.txt"));  //instantiate Scanner with parameter OrganDesc.txt in a try/catch block
		
			}catch(FileNotFoundException e){
		
				System.err.println("QuizPregunts.txt not found");  //to catch FileNotFoundException
			
			}
			
			String temp = "";
			boolean notLine = true;
		
			while(notLine){
			
				String curr = readIt.nextLine();
				
				if(curr.equals(word)){
					
					notLine = false;
					temp = readIt.nextLine();
				
				}
				
			}
			
			return temp;
			
		}
		
		public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			g.drawImage(org,45,320,200,275,this);
			g.drawLine(138, 400, 268, 420);
			g.drawLine(145, 468, 30, 393);
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == submit){
				
				submit.setVisible(false);
				back.setVisible(true);
				
				if(crb1.isSelected()){
				
					cg.setText("Correct");
					
				}	
				
				if(brb2.isSelected()){
					
					bg.setText("Correct");
				
				}
				
				if(a1.getText().contains("cholesterol") && a1.getText().contains("atherosclerosis") && a1.getText().contains("plaque")){
				
					ag.setText("Correct");
					
				}
				
				ag.setVisible(true);
				bg.setVisible(true);
				cg.setVisible(true);
				
			}
			
			if(e.getSource() == back){
			
				ba.showHome();
				
			}
			
		}
		
		public void mouseClicked(MouseEvent e){
			System.out.println(e.getX() + "," + e.getY());
		}
		
		public void mouseReleased(MouseEvent e){}
	
		public void mouseEntered(MouseEvent e){}
	
		public void mouseExited(MouseEvent e){}
	
		public void mousePressed(MouseEvent e){}
		
	}
	
}
