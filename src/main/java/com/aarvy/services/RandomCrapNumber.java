/**
 * 
 */
package com.aarvy.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aarvy.model.CrapsModel;
import com.aarvy.utilities.RandomDiceNumber;

/**
 * @author Vamsi Ravi
 *
 */
@RestController
public class RandomCrapNumber {

	RandomDiceNumber randomDiceNumber = new RandomDiceNumber();
	
	@RequestMapping(value="craps",method=RequestMethod.GET)
	public CrapsModel getRandomDiceNumbers(){
		
		CrapsModel crapsModel = new CrapsModel();
		
		crapsModel.setDice1(randomDiceNumber.randomDiceNumber());
		crapsModel.setDice2(randomDiceNumber.randomDiceNumber());
		crapsModel.setCrapNumber(crapsModel.getDice1()+crapsModel.getDice2());
		
		if( (crapsModel.getCrapNumber()>=2 && crapsModel.getCrapNumber()<=4) || (crapsModel.getCrapNumber()>=9 && crapsModel.getCrapNumber()<=12)  ){
			crapsModel.setFields(true);
		}else{
			crapsModel.setFields(false);
		}
		
		return crapsModel;
	}
}
