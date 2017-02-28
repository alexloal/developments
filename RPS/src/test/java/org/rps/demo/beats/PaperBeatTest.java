package org.rps.demo.beats;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.rps.demo.business.Rps;
import org.rps.demo.constants.Enums;

/**
 * 
 * @author Alejandro Lopez Almodovar
 *
 */
public class PaperBeatTest {

	@Test
	public final void testPaperBeatRock() {
		Enums.Result result = Rps.whoBeats(Enums.Hands.PAPER, Enums.Hands.ROCK);
		assertTrue("Paper vs Rock beats Paper", result != null && Enums.Result.PLAYER1 == result);
		
		result = Rps.whoBeats(Enums.Hands.ROCK, Enums.Hands.PAPER);
		assertTrue("Rock vs Paper beats Paper", result != null && Enums.Result.PLAYER2 == result);
	}

}
