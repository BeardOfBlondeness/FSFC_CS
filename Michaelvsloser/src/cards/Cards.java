package cards;

import java.util.Random;

public class Cards {

	
	
	public static void main(String argsp[]) {
		  
		String hearts[] = {"", "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String diamonds[] = {"", "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String clubs[] = {"", "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String spades[] = {"", "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		
		
		int use;
		
		Random rand = new Random();
		
		int  n = rand.nextInt(4) + 1;
		
		Random reRand = new Random();
		
		int reRandom = reRand.nextInt(13) + 1;
		
		if(n== 1) {
			System.out.println("Hearts, " + spades[reRandom]);
			
		}
		else if(n== 2) {
			System.out.println("Diamonds, " + spades[reRandom]);
		}
		else if(n== 3) {
			System.out.println("Clubs, " + spades[reRandom]);
		}
		else if(n== 4) {
			System.out.println("Spades, " + spades[reRandom]);
			
		}
		
		
		for(use =0; use >1000; use++) {
	}
	
	
}
