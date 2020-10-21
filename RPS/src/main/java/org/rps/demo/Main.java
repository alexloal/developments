package org.rps.demo;

import org.rps.demo.business.Rps;
import org.rps.demo.model.ResultBoard;

import static java.lang.System.out;

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
		out.println("************** RPS demo **************");
		ResultBoard result = Rps.giveMeOneHundredPlays();
		out.println(result.toString());
		out.println("**************************************");

	}

}
