package com.firstprogram.abc;

import java.util.Scanner;

class Guesser{
	int gnum;
	
	int guessNum(int low,int high) {
		System.out.println("Guesser! kindly guess a number between "+low+" to " +high);
		
		Scanner scan=new Scanner(System.in);
		gnum=scan.nextInt();
		
		if(gnum>=low && gnum<=high) {
			return gnum;
		}
		else {
			System.out.println("Please guess a valid number within the range specified");
			return guessNum(low,high);
		}
	}
}

class Player{
	int pnum;
	
	int predictNum(int low, int high) {
		System.out.println("Player! kindly predict a number between"+low+" to "+high);
		
		Scanner scan=new Scanner(System.in);
		pnum=scan.nextInt();
		
		if(pnum>=low && pnum<=high) {
			return pnum;
		}
		else {
			System.out.println("Please predict a valid number within the range specified");
			return predictNum(low,high);
		}
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser() {
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum(1,100);
		
	}
	
	void collectNumFromPlayers() {	
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.predictNum(1,100);
		numFromPlayer2=p2.predictNum(1,100);
		numFromPlayer3=p3.predictNum(1,100);
	}
	
	void compare() {
		if(numFromGuesser==numFromPlayer1) {
			System.out.println("Player1 Wins It");
		}
		else if(numFromGuesser==numFromPlayer2) {
			System.out.println("Player2 Wins It");
		}
		else if(numFromGuesser==numFromPlayer3) {
			System.out.println("Player3 Wins It");
		}
		else {
			System.out.println("Game Lost! Try Again");
		}
	}
}

public class GuesserGame {

	public static void main(String[] args) {
		 Umpire u=new Umpire();
		 u.collectNumFromGuesser();
		 u.collectNumFromPlayers();
		 u.compare();
	}

}
