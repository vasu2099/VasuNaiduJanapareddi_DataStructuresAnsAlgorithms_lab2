package com.gliitfsd.dsalab1_denominationcalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("enter the total number of currency denominations");
		Scanner sc=new Scanner(System.in);
		int size =sc.nextInt();
		int[] denominations = new int[size];
		System.out.println("enter the denominations");
		for(int i=0;i<size;i++) {
			denominations[i]=sc.nextInt();
			
		}
		System.out.println("enter the amount have to be paid");
		int amount =sc.nextInt();
		
		DenominationCalculator denominator=new DenominationCalculator(denominations,amount);
		denominator.calculate();
		if(sc !=null) {
			sc.close();
		}
	}

}
