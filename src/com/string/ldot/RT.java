package com.string.ldot;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RT {

	static int height;
	static int width;
	static int total;
	static Scanner sc = new Scanner(System.in);
	static boolean proceed = true;

	private ArrayList<String> pwList = new ArrayList<String>();


	public static class pwGen {

	}

	public static void rt() {

		int ans;
		String fName;
		String lName;
	

		while (proceed) {

			{
				System.out.println("------------Welcome to the String System------------");
				System.out.println();
				System.out.println("input #1 for Create a codename");
				System.out.println("input #2 for Password Generator");
				System.out.println("input #3 for Read Backwards");
				System.out.println("input #4 for secret message");

				ans = sc.nextInt();
			}
			if (ans == 1) {
				System.out.print("input your first name ");
				fName = sc.next();
				System.out.print("input your last name");
				lName = sc.next();
				System.out.print(fName.substring(0, 2) + lName.substring(0, 3));
				System.out.println();
				
				// input random number generator
			}
			if (ans == 2) {

				pwGen();
			}
			if (ans == 3) {
				readBackwards();
			}
		}
	}

	private static void pwGen() {

		int length;
		ArrayList<String> pwList = new ArrayList<String>();
		System.out.println("---------------Welcome to password generator-------------");
		System.out.println("how many characters do you want your password to be?");
		length = sc.nextInt();

		System.out.println(password(length));
		System.out.println("");
	}
	
	
	//TODO: get readBackwards working
	private static void readBackwards() {
		System.out.println("---------------Read Backwards-------------");
		System.out.println("Enter what you want to be read backwards");
		
	
		String input = sc.next();
		char[] ch = input.toCharArray();
		
		for (int i = ch.length-1; i >= 0; i--) {
			ch[i] = input.charAt(i);
			
		
		}
		String str = ch.toString();
		System.out.println(str);
	}
	
	private static char[] password(int len) {

		String Cap_Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String low_Chars = "abcdefghijklmnopqrstuvwxyz";
		String numbs = "0123456789";
		String syms = "!@#$%^&*_=+-/.?<>)";

		String values = Cap_Chars + low_Chars + numbs + syms;

		Random rng = new Random();
		char[] password = new char[len];

		for (int i = 0; i < len; i++) {
			password[i] = values.charAt(rng.nextInt(values.length()));

		}
		String stringpw = String.valueOf(password);
		System.out.println("do you want to save?");
		if (sc.next() == "y") {
			
			RT rt = new RT();
			rt.pwList.add(stringpw);
			System.out.print(stringpw);
			proceed = true;
		}

		return password;
	}

	public static void main(String[] args) {
		rt();
	}
}
