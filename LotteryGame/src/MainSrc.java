/*
 * A simple program that demonstrates a lottery game 
 */

import java.util.Random;
import java.util.Scanner;

public class MainSrc {

	private static int MAX_N = 100;
	private static int MIN_N = 1;
	
	public static void main(String[] args) {
		System.out.println("Lottery Game by IasJem\n\n");
		int n=3, randomN;
		Scanner getN = new Scanner(System.in);
		
		System.out.print("Want to bet? \nFrom 1 to 100, What is the lucky number? ");
		n = getN.nextInt();
		
		while (n<1) {
			if (n < 1) {
				System.out.print("From 1 to 100, What is the lucky number? ");
				n = getN.nextInt();
			} 
		} 
		
		Random generateRandomN=new Random();
		
		randomN = generateRandomN.nextInt(MAX_N-MIN_N) +1; 
		
		winOrLose(n, randomN);
		getN.close();
	}
	
	public static void winOrLose(int n, int rn) {
		System.out.println("\n\nAnd the lucky number is... " + rn);
		
		if (rn == n) {
			System.out.println("Congratulations to our lucky winner!");
		} else {
			System.out.println("Better luck next time...");
		}
	}

}
