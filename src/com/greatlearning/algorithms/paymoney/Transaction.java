package com.greatlearning.algorithms.paymoney;

public class Transaction {

	
	void validateTransaction(int totalNoOfTarget, double array[] , double valueOfTarget){
		 int size = array.length;
		 if(totalNoOfTarget > 0) {
				double sum = 0 ;
				if(totalNoOfTarget <= size) {
					for(int i = 1; i<= totalNoOfTarget ; i++) {
						sum = sum +array[i-1];
						if(sum >= valueOfTarget) {
							System.out.println("Target achieved after "+ i +" transactions ");
							break;
						}
						else {
							System.out.println("Given target is not achieved");
						}
					}
				}
				else {
					System.out.println("total number of Target is not achieved");
				}
			}
	 }
}
