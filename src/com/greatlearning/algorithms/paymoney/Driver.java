package com.greatlearning.algorithms.paymoney;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array: ");
		int sizeOfArray = sc.nextInt();
		double[] array = new double[sizeOfArray];  
		System.out.println("Enter the values of array: ");
		for(int i=0; i<sizeOfArray; i++)  
		{  
			array[i]=sc.nextDouble(); 
		}  
		System.out.println("Array elements are: ");  
		for (int i=0; i<sizeOfArray; i++)   
		{  
			System.out.println(array[i]);  
		}  

		System.out.println("Select option from below: ");
		System.out.println("1. Validate Daily Target" );
		System.out.println("2. exit");
		int option = sc.nextInt();

		switch(option) {

		case 1: 
			System.out.println("Enter the total no of targets that needs to be achieved: ");
			int totalNoOfTarget = sc.nextInt();
			while(option == 1) {
				System.out.println("Enter the value of target: ");
				double valueOfTarget = sc.nextDouble();
				Transaction t = new Transaction();
				t.validateTransaction(totalNoOfTarget, array, valueOfTarget);
			}
			break;

		case 2:
			System.out.println("application closed");
			break;
		}
		sc.close();		
	}

}


