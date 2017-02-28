package org.rps.demo.utils;

import java.util.Random;

import org.rps.demo.constants.Const;
import org.rps.demo.constants.Enums.Hands;

/**
 * 
 * @author Alejandro Lopez Almodovar
 *
 */
public class Utils {

	/**
	 * Get a random value between the min and max values indicates
	 * 
	 * @param min
	 *            value for the random
	 * @param max
	 *            value for the random
	 * @return a value between max and min
	 */
	protected static int getRandomRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	/**
	 * Returns a random rock, paper or scissors hand
	 * 
	 * @return a paper, rock or scissors hand
	 */
	public static Hands giveMeRandomHand() {
		int random = getRandomRange(Const.MIN_RANDOM, Const.MAX_RANDOM);

		if (Const.MIN_RANDOM == random) {
			return Hands.PAPER;
		} else if (Const.MAX_RANDOM == random) {
			return Hands.ROCK;
		} else {
			return Hands.SCISSORS;
		}
	}

}
