/**
 * 
 */
package com.aarvy.utilities;

import java.util.ArrayList;

import com.aarvy.model.CrapsModel;
import com.aarvy.services.RandomCrapNumber;

/**
 * @author Vamsi Ravi
 *
 */
public class Iterator {

	
	public ArrayList<CrapsModel> crapsIterator(Integer iterator){
	
		ArrayList<CrapsModel> crapsModelArrayList = new ArrayList<CrapsModel>();  
		
		RandomCrapNumber randomCrapNumber = new RandomCrapNumber();
		
		ModelPrinter printer = new ModelPrinter();
		
		Integer counter =0;
		
		for(Integer i =0; i < iterator; i++){
			
			CrapsModel crapsModel = randomCrapNumber.getRandomDiceNumbers();
			
			if(!crapsModel.getFields()){
				counter = counter+1;
			}else{
				counter = 0;
			}
			
			printer.printCrapsModel(crapsModel, counter);
			
			crapsModelArrayList.add(i, crapsModel);
			
		}
		 
		return crapsModelArrayList;
		
	}
	
	
}
