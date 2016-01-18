/*
 * Neel Chaudhari, Jay Ray
 * Per. 6, 3
 * 4/20/15
 * Super Physio Bros.
 * Game in 5 Weeks project
 * SuperPhysio.java
 * Main file that has the JFrame and JPanel with CardLayout
 */

import java.awt.*;  //import libraries
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SuperPhysio extends JFrame{  //SuperPhysio class header extends JFrame
	
	Base base;  //declare global variables
	
	public static void main(String [] args){  //main() header
		
		SuperPhysio sp = new SuperPhysio();  //declare and initialize SuperPhysio to run constructor
		
	}
	
	public SuperPhysio(){  //constructor header
		
		super("Super Physio Bros");
		System.out.println("Entered SuperPhysio Constructor");
		setSize(700, 700);  //setSize
		setLocation(17, 17);  //setLocation
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		base = new Base(this);  //create Main JPanel instance
		setContentPane(base);  //setContentPane
		setResizable(true);  //setResizable false
		setVisible(true);  //setVisible
		Container c = getContentPane();
		BufferedImage im = new BufferedImage(c.getWidth(), c.getHeight(), BufferedImage.TYPE_INT_ARGB);
		c.paint(im.getGraphics());
		ImageIO.write(im, "PNG", new File("shot.png"));
	}
	
}

class Base extends JPanel{  //Main class header extends JPanel
	
	CardLayout cards;  //declare objects, variables
	
	SuperPhysio a;
	
	SPBHomeHelp homeHelp;
	SPBStudy study;
	SPBQuiz quiz;
	SPBEnd end;
	
	SPBHomeHelp.Home home;
	SPBHomeHelp.Help help;
	SPBStudy.ChooseYoSystem chooseSys;
	SPBStudy.StudyYoEndo endo;
	SPBStudy.StudyYoResp resp;
	SPBStudy.StudyYoDig dig;
	SPBStudy.StudyYoFemRepro femrepro;
	SPBStudy.StudyYoMaleRepro malerepro;
	SPBStudy.StudyYoUrin urin;
	SPBStudy.StudyYoCirc circ;
	SPBStudy.ThymusGlands thymGlan;
	SPBStudy.AdrenalGlands adrenGlan;
	SPBStudy.SweatGlands sweatGlan;
	SPBStudy.Kidneys kidneys;
	SPBStudy.Ureters ureters;
	SPBStudy.Aorta aorta;
	SPBStudy.Arteries arteries;
	SPBStudy.Bladder bladder;
	SPBStudy.Bronchi bronchi;
	SPBStudy.Capillaries capillaries;
	SPBStudy.Cervix cervix;
	SPBStudy.Diaphragm diaphragm;
	SPBStudy.FallopianTubes fallopian;
	SPBStudy.Heart heart;
	SPBStudy.LargeIntestine lintestine;
	SPBStudy.Larynx larynx;
	SPBStudy.Liver liver;
	SPBStudy.Lungs lungs;
	SPBStudy.Ovaries ovaries;
	SPBStudy.Pancreas pancreas;
	SPBStudy.Penis penis;
	SPBStudy.PituitaryGland pitGlan;
	SPBStudy.Prostate prostate;
	SPBStudy.RenalArteryVein renalAV;
	SPBStudy.Scrotum scrotum;
	SPBStudy.SmallIntestine sintestine;
	SPBStudy.Stomach stomach;
	SPBStudy.Testes testes;
	SPBStudy.ThyroidGland thyGlan;
	SPBStudy.Trachea trachea;
	SPBStudy.Uterus uterus;
	SPBStudy.Vagina vagina;
	SPBStudy.VasDeferens vasDef;
	SPBStudy.Veins veins;
	SPBQuiz.EndoQuiz equiz;
	SPBQuiz.RespQuiz rquiz;
	SPBQuiz.DigQuiz dquiz;
	SPBQuiz.FemReproQuiz frquiz;
	SPBQuiz.MaleReproQuiz mrquiz;
	SPBQuiz.UrinQuiz uquiz;
	SPBQuiz.CircQuiz cquiz;

	public Base(SuperPhysio p){  //constructor header
		
		System.out.println("Entered Base Constructor");
		
		a = p;
		cards = new CardLayout();  //instantiate objects	
		setLayout(cards);  //setLayout to CardLayout
		
		//initialize variables
		
		homeHelp = new SPBHomeHelp(this);  //add cards
		study = new SPBStudy(this);
		quiz = new SPBQuiz(this);
		end = new SPBEnd(this);
				
		home = homeHelp.h;
		help = homeHelp.he;
		chooseSys = study.cys;
		endo = study.sendo;
		resp = study.sresp;
		dig = study.sdig;
		femrepro = study.sfemrepro;
		malerepro = study.smalerepro;
		urin = study.surin;
		circ = study.scirc;
		thymGlan = study.thymGlan;
		adrenGlan = study.adrenGlan;
		sweatGlan = study.sweatGlan;
		kidneys = study.kidneys;
		ureters = study.ureters;
		aorta = study.aorta;
		arteries = study.arteries;
		bladder = study.bladder;
		bronchi = study.bronchi;
		capillaries = study.capillaries;
		cervix = study.cervix;
		diaphragm = study.diaphragm;
		fallopian = study.fallopian;
		heart = study.heart;
		lintestine = study.lintestine;
		larynx = study.larynx;
		liver = study.liver;
		lungs = study.lungs;
		ovaries = study.ovaries;
		pancreas = study.pancreas;
		penis = study.penis;
		pitGlan = study.pitGlan;
		prostate = study.prostate;
		renalAV = study.renalAV;
		scrotum = study.scrotum;
		sintestine = study.sintestine;
		stomach = study.stomach;
		testes = study.testes;
		thyGlan = study.thyGlan;
		trachea = study.trachea;
		uterus = study.uterus;
		vagina = study.vagina;
		vasDef = study.vasDef;
		veins = study.veins;
		equiz = quiz.equiz;
		rquiz = quiz.rquiz;
		dquiz = quiz.dquiz;
		frquiz = quiz.frquiz;
		mrquiz = quiz.mrquiz;
		uquiz = quiz.uquiz;
		cquiz = quiz.cquiz;		
		
		add(home, "home");  //add home
		add(help, "help");  //add help
		add(chooseSys, "choose sys");  //add choose systems
		add(endo, "endo");  //add all body system panels
		add(resp, "resp");
		add(dig, "dig");
		add(femrepro, "femrepro");
		add(malerepro, "malerepro");
		add(urin, "urin");
		add(circ, "circ");
		add(thymGlan, "thymus glands");  //add all organ description panels
		add(adrenGlan, "adrenal glands");
		add(sweatGlan, "sweat glands");
		add(kidneys, "kidneys");
		add(ureters, "ureters");
		add(aorta, "aorta");
		add(arteries, "arteries");
		add(bladder, "bladder");
		add(bronchi, "bronchi");
		add(capillaries, "capillaries");
		add(cervix, "cervix");
		add(diaphragm, "diaphragm");
		add(fallopian, "fallopian");
		add(heart, "heart");
		add(lintestine, "lintestine");
		add(larynx, "larynx");
		add(liver, "liver");
		add(lungs, "lungs");
		add(ovaries, "ovaries");
		add(pancreas, "pancreas");
		add(penis, "penis");
		add(pitGlan, "pitGlan");
		add(prostate, "prostate");
		add(renalAV, "renalAV");
		add(scrotum, "scrotum");
		add(sintestine, "sintestine");
		add(stomach, "stomach");
		add(testes, "testes");
		add(thyGlan, "thyGlan");
		add(trachea, "trachea");
		add(uterus, "uterus");
		add(vagina, "vagina");
		add(vasDef, "vasDef");
		add(veins, "veins");
		add(end, "end");  //add end panel
		add(equiz, "equiz");
		add(rquiz, "rquiz");
		add(dquiz, "dquiz");
		add(frquiz, "frquiz");
		add(mrquiz, "mrquiz");
		add(uquiz, "uquiz");
		add(cquiz, "cquiz");
		
		cards.show(this, "home");
		
	}
	
	public void showEnd(boolean ms, boolean ps, int punts, int wl, int secs){
		
		String chars;
		
		cards.show(this, "end");
		
		end.marS = ms;
		end.peaS = ps;
		end.points = punts;
		end.seconds = secs;
		
		if(ms){
		
			chars = "Mario";
			
		}
		
		else{
			
			chars = "Peach";
			
		}
		
		end.info.setText("<html><p>Time taken: " + secs + "<br>Character played as: " + chars + "<br>Points: " + punts + "</p></html>");
		
		a.repaint();
		
	}
	
	public void showUreters(){
	
		cards.show(this, "ureters");
		a.repaint();
		
	}
	
	public void showKidneys(){
	
		cards.show(this, "kidneys");
		a.repaint();
		
	}
	
	public void showSweatGlands(){
	
		cards.show(this, "sweat glands");
		a.repaint();
		
	}
	
	public void showThymGlands(){
	
		cards.show(this, "thymus glands");
		a.repaint();
		
	}
	
	public void showAdrenGlands(){
	
		cards.show(this, "adrenal glands");
		a.repaint();
		
	}
	
	public void showAorta(){
	
		cards.show(this, "aorta");
		a.repaint();
		
	}
	public void showArteries(){
	
		cards.show(this, "arteries");
		a.repaint();
		
	}
	public void showBladder(){
	
		cards.show(this, "bladder");
		a.repaint();
		
	}
	public void showBronchi(){
	
		cards.show(this, "bronchi");
		a.repaint();
		
	}
	public void showCapillaries(){
	
		cards.show(this, "capillaries");
		a.repaint();
		
	}
	public void showCervix(){
	
		cards.show(this, "cervix");
		a.repaint();
		
	}
	public void showDiaphragm(){
	
		cards.show(this, "diaphragm");
		a.repaint();
		
	}
	public void showFallopian(){
	
		cards.show(this, "fallopian");
		a.repaint();
		
	}
	public void showHeart(){
	
		cards.show(this, "heart");
		a.repaint();
		
	}
	public void showLIntestine(){
	
		cards.show(this, "lintestine");
		a.repaint();
		
	}
	public void showLarynx(){
	
		cards.show(this, "larynx");
		a.repaint();
		
	}
	public void showLiver(){
	
		cards.show(this, "liver");
		a.repaint();
		
	}
	public void showLungs(){
	
		cards.show(this, "lungs");
		a.repaint();
		
	}
	public void showOvaries(){
	
		cards.show(this, "ovaries");
		a.repaint();
		
	}
	public void showPancreas(){
	
		cards.show(this, "pancreas");
		a.repaint();
		
	}
	public void showPenis(){
	
		cards.show(this, "penis");
		a.repaint();
		
	}
	public void showPitGlan(){
	
		cards.show(this, "pitGlan");
		a.repaint();
		
	}
	public void showProstate(){
	
		cards.show(this, "prostate");
		a.repaint();
		
	}
	public void showRenalAV(){
	
		cards.show(this, "renalAV");
		a.repaint();
		
	}
	public void showScrotum(){
	
		cards.show(this, "scrotum");
		a.repaint();
		
	}
	public void showSIntestine(){
	
		cards.show(this, "sintestine");
		a.repaint();
		
	}
	public void showStomach(){
	
		cards.show(this, "stomach");
		a.repaint();
		
	}
	public void showTestes(){
	
		cards.show(this, "testes");
		a.repaint();
		
	}
	public void showThyGlan(){
	
		cards.show(this, "thyGlan");
		a.repaint();
		
	}
	public void showTrachea(){
	
		cards.show(this, "trachea");
		a.repaint();
		
	}
	public void showUterus(){
	
		cards.show(this, "uterus");
		a.repaint();
		
	}
	public void showVagina(){
	
		cards.show(this, "vagina");
		a.repaint();
		
	}
	public void showVasDef(){
	
		cards.show(this, "vasDef");
		a.repaint();
		
	}
	public void showVeins(){
	
		cards.show(this, "veins");
		a.repaint();
		
	}
	
	public void showHome(){  //showHome method to switch cards to home
	
		cards.show(this, "home");
		a.repaint();
		
	}
	
	public void showHelp(){  //showHelp method to switch cards to help
	
		cards.show(this, "help");
		a.repaint();
			
	}
	
	public void showChooseSystem(boolean ms, boolean ps){  //showChooseSystems method to switch cards to choose systems0
		
	    cards.show(this, "choose sys");
	    study.marS = ms;
	    study.peaS = ps;
			
	    if(ms && !ps){
			
			chooseSys.repro.setText("Male Reproductive System");
				
		}
			
		else if(!ms && ps){
			
			chooseSys.repro.setText("Female Reproductive System");
				
		}
			
		a.repaint();
		
	}
	
	public void showStudy(){
		
		cards.show(this, "study");
		a.repaint();
		
	}
	
	public void showEndo(){
	
		cards.show(this, "endo");
		a.repaint();
	
	}
	
	public void showCirc(){
	
		cards.show(this, "circ");
		a.repaint();
		
	}
	
	public void showResp(){
	
		cards.show(this, "resp");
		a.repaint();
		
	}
	
	public void showDig(){
	
		cards.show(this, "dig");
		a.repaint();
	 
	}
	
	public void showFemRepro(){
	
		cards.show(this, "femrepro");
		a.repaint();
		
	}
	
	public void showMaleRepro(){
	
		cards.show(this, "malerepro");
		a.repaint();
		
	}
	
	public void showUrin(){
	
		cards.show(this, "urin");
		a.repaint();

	}
	
	public void showEQuiz(){
	
		cards.show(this, "equiz");
		a.repaint();
		
	}
	public void showRQuiz(){
	
		cards.show(this, "rquiz");
		a.repaint();
		
	}
	public void showDQuiz(){
	
		cards.show(this, "dquiz");
		a.repaint();
		
	}
	public void showFRQuiz(){
	
		cards.show(this, "frquiz");
		a.repaint();
		
	}
	public void showMRQuiz(){
	
		cards.show(this, "mrquiz");
		a.repaint();
		
	}
	public void showUQuiz(){
	
		cards.show(this, "uquiz");
		a.repaint();
		
	}
	public void showCQuiz(){
	
		cards.show(this, "cquiz");
		a.repaint();
		
	}

}
