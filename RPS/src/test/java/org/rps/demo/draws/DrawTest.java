package org.rps.demo.draws;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.rps.demo.business.Rps;
import org.rps.demo.constants.Enums;

/**
 * @author Alejandro Lopez Almodovar
 *
 */
public class DrawTest {

	@Test
	public final void testPaperDraws() {
		Enums.Result result = Rps.whoBeats(Enums.Hands.PAPER, Enums.Hands.PAPER);
		assertSame("Paper vs Paper is DRAW", Enums.Result.DRAWS, result);
	}

	@Test
	public final void testRockDraws() {
		Enums.Result result = Rps.whoBeats(Enums.Hands.ROCK, Enums.Hands.ROCK);
		assertSame("Rock vs Rock is DRAW", Enums.Result.DRAWS, result);
	}
	
	@Test
	public final void testScissorsDraws() {
		Enums.Result result = Rps.whoBeats(Enums.Hands.SCISSORS, Enums.Hands.SCISSORS);
		assertSame("Scissors vs Scissors is DRAW", Enums.Result.DRAWS, result);
	}
	
}
