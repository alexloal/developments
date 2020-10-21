package org.rps.demo.noDraws;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.rps.demo.business.Rps;
import org.rps.demo.constants.Enums;

/**
 * 
 * @author Alejandro Lopez Almodovar
 *
 */
public class NoRockBeatTest {

	@Test
	public final void testNoRockBeatScissors() {
		Enums.Result result = Rps.whoBeats(Enums.Hands.ROCK, Enums.Hands.PAPER);
		assertSame("Rock vs Paper beats Paper", Enums.Result.PLAYER2, result);
		
		result = Rps.whoBeats(Enums.Hands.PAPER, Enums.Hands.ROCK);
		assertSame("Paper vs Rock beats Paper", Enums.Result.PLAYER1, result);
	}

}
