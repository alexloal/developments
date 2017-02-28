package org.rps.demo.model;

import java.io.Serializable;

import org.rps.demo.constants.Enums;

/**
 * 
 * @author Alejandro Lopez Almodovar
 *
 */
public class ResultBoard implements Serializable {

	/** Serial Version UID Generated */
	private static final long serialVersionUID = 942713950720142069L;
	/** Hands beats by the player */
	private int handWon;
	/** Hands draws by the player */
	private int handDraw;
	/** Hands lose by the player */
	private int handLose;
	/** Total hands */
	private int totalHands;

	/**
	 * Constructor
	 */
	public ResultBoard() {
		this.handDraw = 0;
		this.handWon = 0;
		this.handLose = 0;
		this.totalHands = 0;
	}

	/**
	 * Add the result to the result board
	 * 
	 * @param handResult
	 *            to process
	 */
	public void addHandResult(final Enums.Result handResult) {
		if (Enums.Result.DRAWS == handResult) {
			addHandDraw();
		} else if (Enums.Result.PLAYER1 == handResult) {
			addHandWon();
		} else {
			addHandLose();
		}
	}

	/**
	 * Add a new hand won to the results
	 */
	private void addHandWon() {
		this.handWon++;
		this.totalHands++;
	}

	/**
	 * Add a new hand draw to the results
	 */
	private void addHandDraw() {
		this.handDraw++;
		this.totalHands++;
	}

	/**
	 * Add a new hand lose to the results
	 */
	private void addHandLose() {
		this.handLose++;
		this.totalHands++;
	}

	/**
	 * @return the handWon
	 */
	public int getHandWon() {
		return handWon;
	}

	/**
	 * @return the handDraw
	 */
	public int getHandDraw() {
		return handDraw;
	}

	/**
	 * @return the totalHands
	 */
	public int getTotalHands() {
		return totalHands;
	}

	/**
	 * @return the handLose
	 */
	public int getHandLose() {
		return handLose;
	}

	/**
	 * @param handLose
	 *            the handLose to set
	 */
	public void setHandLose(int handLose) {
		this.handLose = handLose;
	}

	/**
	 * Returns the information of the results
	 */
	@Override
	public String toString() {
		return "Total hands: " + this.totalHands + " won: " + this.handWon + " and draws: " + this.handDraw;
	}

}
