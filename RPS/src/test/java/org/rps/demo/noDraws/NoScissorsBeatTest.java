package org.rps.demo.noDraws;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.rps.demo.business.Rps;
import org.rps.demo.constants.Enums;

public class NoScissorsBeatTest {

	@Test
	public final void testNoScissorsBeatPaper() {
		Enums.Result result = Rps.whoBeats(Enums.Hands.SCISSORS, Enums.Hands.ROCK);
		assertTrue("Scissors vs Rock beats Rock", result != null && Enums.Result.PLAYER2 == result);
		
		result = Rps.whoBeats(Enums.Hands.ROCK, Enums.Hands.SCISSORS);
		assertTrue("Rock vs Scissors beats Rock", result != null && Enums.Result.PLAYER1 == result);
	}

}
