package com.greatlearning.algorithms.currencydenomination;

public class Services {

	int sum = 0;
	void validate(int array[], int amount, int size){
		if (amount > 0 ) {

			for(int i = size-1 ; i>=0 ; i--) {
				if(sum != amount) {
					int count = 0;
					while(sum < amount && sum != amount) {
						sum = sum + array[i];
						if(sum <= amount) {
							count++;
						}
						else {
							sum = sum - array[i];
							break;
						}
					}
					if(count > 0 ) {
						System.out.println(array[i]+":"+ count);
					}
					if(sum == amount) {
						break;
					}
					else {
						validate(array, amount,size-1);
					}
				}

			}
		}}
}
