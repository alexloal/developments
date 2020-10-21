package org.rps.demo.beats;

import static org.junit.Assert.assertSame;
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
		assertSame("Scissors vs Paper beats Scissors", Enums.Result.PLAYER1, result);
		
		result = Rps.whoBeats(Enums.Hands.PAPER, Enums.Hands.SCISSORS);
		assertSame("Paper vs Scissors beats Scissors", Enums.Result.PLAYER2, result);
	}

}
