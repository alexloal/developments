package org.rps.demo.business;

import org.rps.demo.constants.Enums;
import org.rps.demo.model.ResultBoard;
import org.rps.demo.utils.Utils;

/**
 * @author Alejandro Lopez Almodovar
 *
 */
public class Rps {

	/**
	 * Given two hands, returns the game result
	 * 
	 * @param handPlayer1
	 *            hand of the player 1
	 * @param handPlayer2
	 *            hand of the player 2
	 * @return the result of the game
	 */
	public static synchronized Enums.Result whoBeats(final Enums.Hands handPlayer1, final Enums.Hands handPlayer2) {
		Enums.Result result = Enums.Result.DRAWS;

		if (handPlayer1 != handPlayer2) {
			if (handPlayer1 == Enums.Hands.PAPER) {
				if (handPlayer2 == Enums.Hands.ROCK) {
					result = Enums.Result.PLAYER1;
				} else {
					result = Enums.Result.PLAYER2;
				}
			} else if (handPlayer1 == Enums.Hands.ROCK) {
				if (handPlayer2 == Enums.Hands.SCISSORS) {
					result = Enums.Result.PLAYER1;
				} else {
					result = Enums.Result.PLAYER2;
				}
			} else {
				if (handPlayer2 == Enums.Hands.PAPER) {
					result = Enums.Result.PLAYER1;
				} else {
					result = Enums.Result.PLAYER2;
				}
			}
		}

		return result;
	}

	/**
	 * Execute the game 100 times and stores the results in the ResultBoard
	 * 
	 * @return the ResultBoard with the results of the game
	 */
	public static ResultBoard giveMeOneHundredPlays() {
		ResultBoard result = new ResultBoard();
		for (int i = 0; i <= 99; i++) {
			result.addHandResult(whoBeats(Utils.giveMeRandomHand(), Enums.Hands.ROCK));
		}
		return result;
	}

}
