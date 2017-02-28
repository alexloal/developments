package org.rps.demo.rps;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;
import org.rps.demo.business.Rps;
import org.rps.demo.constants.Const;
import org.rps.demo.constants.Enums.Result;
import org.rps.demo.model.ResultBoard;

/**
 * 
 * @author Alejandro Lopez Almodovar
 *
 */
public class RpsTest {

	@Test
	public void testResultBoardZero() {
		ResultBoard resultBoard = new ResultBoard();
		assertTrue("The number of total, won, draws and lose hands are equal to 0", resultBoard.getTotalHands() == 0
				&& resultBoard.getHandDraw() == 0 && resultBoard.getHandLose() == 0 && resultBoard.getHandWon() == 0);
	}

	@Test
	public void testResultBoardOneWonGame() {
		ResultBoard resultBoard = new ResultBoard();
		resultBoard.addHandResult(Result.PLAYER1);
		assertTrue("The number of won and total hand is equal to 1", resultBoard.getTotalHands() == 1
				&& resultBoard.getHandDraw() == 0 && resultBoard.getHandLose() == 0 && resultBoard.getHandWon() == 1);
	}

	@Test
	public void testResultBoardOneDrawGame() {
		ResultBoard resultBoard = new ResultBoard();
		resultBoard.addHandResult(Result.DRAWS);
		assertTrue("The number of draw and total hand is equal to 1", resultBoard.getTotalHands() == 1
				&& resultBoard.getHandDraw() == 1 && resultBoard.getHandLose() == 0 && resultBoard.getHandWon() == 0);
	}

	@Test
	public void testResultBoardOneLoseGame() {
		ResultBoard resultBoard = new ResultBoard();
		resultBoard.addHandResult(Result.PLAYER2);
		assertTrue("The number of lose and total hand is equal to 1", resultBoard.getTotalHands() == 1
				&& resultBoard.getHandDraw() == 0 && resultBoard.getHandLose() == 1 && resultBoard.getHandWon() == 0);
	}

	@Test
	public void testOneHundredGames() {
		ResultBoard resultBoard = Rps.giveMeOneHundredPlays();
		assertTrue("The total is equal to 100", resultBoard != null && resultBoard.getTotalHands() == 100);
	}

	@Test
	public void testSumWonBeatsLoseGames() {
		ResultBoard resultBoard = Rps.giveMeOneHundredPlays();
		assertTrue("The sum of won, draws and lose hands is equal to the total", resultBoard != null && resultBoard
				.getTotalHands() == resultBoard.getHandWon() + resultBoard.getHandDraw() + resultBoard.getHandLose());
	}

	@SuppressWarnings("resource")
	@Test
	public void testSumWonBeatsToString() {
		String toString = Rps.giveMeOneHundredPlays().toString();

		int total = 0;
		int won = 0;
		int draws = 0;

		if (toString != null && toString.length() > 0) {
			Scanner scanner = new Scanner(toString).useDelimiter(Const.DELIMITER);

			total = scanner.nextInt();
			won = scanner.nextInt();
			draws = scanner.nextInt();
		}

		assertTrue("The format ResultBoard toString method is correct",
				toString != null && toString.length() > 0 && total > 0 && won > 0 && draws > 0);
	}

}
