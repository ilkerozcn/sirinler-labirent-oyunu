package sirinler;

import java.util.Random;

import javax.swing.ImageIcon;

public class alt�n extends Thread{
	
	
	public void alt�nyap()  throws InterruptedException{
		while(true) {
			Random rand = new Random();
			int rand1 = rand.nextInt(13); 
	        int rand2 = rand.nextInt(11);
	        if(sirinler.harita[rand2][rand1]==1) {
	        	sirinler.Lharita[rand2][rand1].setIcon(new ImageIcon("C:/Users/�lker/Desktop/Yazlab/images/allt�n.png"));
	        	System.out.print("eklendi");
	        	sirinler.alt�nlar[rand2][rand1]=5;
	        	break;
	        }
	        
		}
		
		
		
		
	}
	public void run() {
		
		while(true) {
		try {
			Thread.sleep(10000);
			alt�nyap();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}}
