package org.rps.demo.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.rps.demo.constants.Const;
import org.rps.demo.constants.Enums.Hands;

/**
 * @author Alejandro Lopez Almodovar
 *
 */
public class UtilsTest {

	@Test
	public void testRandomRange() {
		int value = Utils.getRandomRange(Const.MIN_RANDOM, Const.MAX_RANDOM);
		assertTrue("The value is an int random value between MIN and MAX",
				value == Const.MIN_RANDOM || value == Const.MAX_RANDOM || value == Const.TWO);
	}

	@Test
	public void testNegativeValues() {
		for (int i = 0; i <= 999; i++) {
			int value = Utils.getRandomRange(-Const.MAX_RANDOM, -Const.MIN_RANDOM);
			assertTrue("The value is a negative int value", value < 0);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCrossMinMax() {
		Utils.getRandomRange(Const.MAX_RANDOM, Const.MIN_RANDOM);
	}

	@Test
	public void test1000RandomRange() {
		for (int i = 0; i <= 999; i++) {
			int value = Utils.getRandomRange(Const.MIN_RANDOM, Const.MAX_RANDOM);
			assertTrue("All values are an int random value between MIN and MAX",
					value == Const.MIN_RANDOM || value == Const.MAX_RANDOM || value == Const.TWO);
		}
	}

	@Test
	public void testRandomHand() {
		Hands hand = Utils.giveMeRandomHand();
		assertTrue("The hand is Paper, Rock o Scissors",
				hand != null && (hand == Hands.PAPER || hand == Hands.ROCK || hand == Hands.SCISSORS));
	}

	@Test
	public void test1000Hand() {
		for (int i = 0; i <= 999; i++) {
			Hands hand = Utils.giveMeRandomHand();
			assertTrue("All the hands are Paper, Rock o Scissors",
					hand != null && (hand == Hands.PAPER || hand == Hands.ROCK || hand == Hands.SCISSORS));
		}
	}

}
