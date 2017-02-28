package org.rps.demo;

import org.rps.demo.business.Rps;
import org.rps.demo.model.ResultBoard;

/**
 * 
 * @author Alejandro Lopez Almdovar
 *
 */
public class Main {

	/**
	 * Main method
	 * 
	 * @param args
	 *            for the main method
	 */
	public static void main(String[] args) {
		System.out.println("************** RPS demo **************");
		ResultBoard result = Rps.giveMeOneHundredPlays();
		System.out.println(result.toString());
		System.out.println("**************************************");

	}

}
