package org.rps.demo.noDraws;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.rps.demo.business.Rps;
import org.rps.demo.constants.Enums;

public class NoScissorsBeatTest {

	@Test
	public final void testNoScissorsBeatPaper() {
		Enums.Result result = Rps.whoBeats(Enums.Hands.SCISSORS, Enums.Hands.ROCK);
		assertSame("Scissors vs Rock beats Rock", Enums.Result.PLAYER2, result);
		
		result = Rps.whoBeats(Enums.Hands.ROCK, Enums.Hands.SCISSORS);
		assertSame("Rock vs Scissors beats Rock", Enums.Result.PLAYER1, result);
	}

}
