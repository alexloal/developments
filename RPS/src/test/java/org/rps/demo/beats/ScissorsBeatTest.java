package org.rps.demo.beats;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.rps.demo.business.Rps;
import org.rps.demo.constants.Enums;

/**
 * @author alalmodovar
 *
 */
public class ScissorsBeatTest {

	@Test
	public final void testScissorsBeatPaper() {
		Enums.Result result = Rps.whoBeats(Enums.Hands.SCISSORS, Enums.Hands.PAPER);
		assertTrue("Scissors vs Paper beats Scissors", result != null && Enums.Result.PLAYER1 == result);
		
		result = Rps.whoBeats(Enums.Hands.PAPER, Enums.Hands.SCISSORS);
		assertTrue("Paper vs Scissors beats Scissors", result != null && Enums.Result.PLAYER2 == result);
	}

}
