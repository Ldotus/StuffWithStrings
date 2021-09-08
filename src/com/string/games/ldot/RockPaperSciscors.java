package com.string.games.ldot;

import java.util.Random;
import java.util.Scanner;

public class RockPaperSciscors {

	String[] oppHands = { "rock", "paper", "scizor" };
	static String choice;
	static String result;
	static String oppHand;
	static int playerScore;
	static int oppScore;
	
	static boolean playing = true;

	enum hands {
		rock, paper, sciscors
	}

	// creates a random number between 0-2 and sets oppHand to a number
	// prints random number out and returns as a string
	String opponentHand() {
		Random rng = new Random();

		int randHand = rng.nextInt(3);

		String oppHand;

		if (randHand == 0) {
			oppHand = "rock";
		} else if (randHand == 1) {
			oppHand = "sciscors";
		} else {
			oppHand = "paper";
		}

		System.out.println("Opp Chose: " + oppHand);
		return oppHand;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		RockPaperSciscors rockPaperSciscors = new RockPaperSciscors();

		while (true) {
			System.out.println("Welcome to Rock Paper Sciscors, type a choice");

			String choice = sc.next();

			// TODO: attempt to create method that returns random enum

			// checks to see if the string entered is valid as a move against enum
			// attempted to do with an enum but currently can't achieve returning a random
			// enum

			if (choice.equals("quit")) {
				break;
			}
			
			if (choice.equals("score")) {
				if (playerScore > oppScore) {
					
					System.out.println("Score of games so far");
					System.out.println(playerScore + ":" + oppScore);
					System.out.println("You're in the lead");
					
				}
				else if (!(playerScore > oppScore)) {
					System.out.println("Score of games so far");
					System.out.println(playerScore + ":" + oppScore);
					System.out.println("You're Losing");
				
				}
				else {
					System.out.println("you're Drawing!");
				
					
				}	
				
			}
			//move is invalid if inputted string is not rock paper or sciscors 
			if (!choice.equals(hands.rock.toString()) && !choice.equals(hands.paper.toString())
					&& !choice.equals(hands.sciscors.toString()) && !choice.equals("score")) {

				System.out.println("invalid move");

			} else {

				oppHand = rockPaperSciscors.opponentHand();

			}
			if (choice.equals(oppHand)) {
				System.out.println("You Tied");
			}
			if (choice.equals("paper") && oppHand.equals("rock") 
					|| choice.equals("rock") && oppHand.equals("sciscors")
					|| choice.equals("sciscors") && oppHand.equals("paper")) {

				result = "You Win";
				playerScore++;
				System.out.println(result);
			}

			else {
				result = "Loser";
				oppScore++;
				System.out.println(result);
			}

		}

		System.out.println("Thanks See Ya");

	}
}
