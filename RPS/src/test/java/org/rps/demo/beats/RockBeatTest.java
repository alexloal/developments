package org.rps.demo.beats;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.rps.demo.business.Rps;
import org.rps.demo.constants.Enums;

/**
 * @author Alejandro Lopez Almodovar
 *
 */
public class RockBeatTest {

	@Test
	public final void testRockBeatScissors() {
		Enums.Result result = Rps.whoBeats(Enums.Hands.ROCK, Enums.Hands.SCISSORS);
		assertSame("Rock vs Scissors beats ROCK", Enums.Result.PLAYER1, result);
		
		result = Rps.whoBeats(Enums.Hands.SCISSORS, Enums.Hands.ROCK);
		assertSame("Scissors vs Rock beats ROCK", Enums.Result.PLAYER2, result);
	}
}
