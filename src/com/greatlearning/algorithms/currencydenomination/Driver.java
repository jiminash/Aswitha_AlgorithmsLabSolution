package com.greatlearning.algorithms.currencydenomination;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations: ");
		int sizeOfArray = sc.nextInt();
		int[] array = new int[sizeOfArray];  
		System.out.println("Enter the currency denominations value: ");
		for(int i=0; i<sizeOfArray; i++)  
		{  
			array[i]=sc.nextInt();  
		} 

		MergeSort m = new MergeSort();
		m.sortArray(array, 0, sizeOfArray-1);

		System.out.println("sorted currency denominations values are: ");
		for(int i=0; i<sizeOfArray; i++)  
		{  
			System.out.println(array[i]);
		} 

		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();

		Services s = new Services();
		s.validate(array, amount, sizeOfArray);
		sc.close();
	}
}



