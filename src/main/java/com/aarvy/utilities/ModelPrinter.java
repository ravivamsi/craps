/**
 * 
 */
package com.aarvy.utilities;

import com.aarvy.model.CrapsModel;

/**
 * @author Vamsi Ravi
 *
 */
public class ModelPrinter {
	
	public void printCrapsModel(CrapsModel crapsModel, Integer counter){
		System.out.println("Dice1: "+crapsModel.getDice1().toString()+";"+"Dice2: "+crapsModel.getDice2().toString()+";"+"CrapNumber: "+crapsModel.getCrapNumber().toString()+";"+"Fields: "+crapsModel.getFields().toString()+";"+"Counter: "+counter.toString());
	}
	
}
