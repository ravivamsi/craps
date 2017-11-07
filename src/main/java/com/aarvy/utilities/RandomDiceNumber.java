/**
 * 
 */
package com.aarvy.utilities;

import java.util.Random;

/**
 * @author Vamsi
 *
 */
public class RandomDiceNumber {

	public Integer randomDiceNumber(){
		
		Integer[] diceNumbers = {1,2,3,4,5,6};
		
		Random random = new Random();
		
		return diceNumbers[random.nextInt(diceNumbers.length)];
	}
	
}
