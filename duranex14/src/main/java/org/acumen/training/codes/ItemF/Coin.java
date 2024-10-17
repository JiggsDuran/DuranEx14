package org.acumen.training.codes.ItemF;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Coin {
	private static final Logger LOGGER = LogManager.getLogger("VENDINGMACHINELOGGER");
	public static final int PENNY = 1;
	public static final int NICKEL = 5;
	public static final int DIME = 10;
	public static final int QUARTER = 25;
	public static final int HALFDOLLAR = 50;
	public static final int SILVERDOLLAR = 100;
	public static final int INVALID = 0;
	private int value;

	public Coin(String coin) {
		String toUpperCoin = coin.toUpperCase();
		if (toUpperCoin.equals("PENNY")) {
			value = PENNY;
			LOGGER.info("Added a Penny.");
		} else if (toUpperCoin.equals("NICKEL")) {
			value = NICKEL;
			LOGGER.info("Added a Nickel.");
		} else if (toUpperCoin.equals("DIME")) {
			value = DIME;
			LOGGER.info("Added a Dime.");
		} else if (toUpperCoin.equals("QUARTER")) {
			value = QUARTER;
			LOGGER.info("Added a Quarter.");
		} else if (toUpperCoin.equals("HALFDOLLAR")) {
			value = HALFDOLLAR;
			LOGGER.info("Added a HalfDollar.");
		} else if (toUpperCoin.equals("SILVERDOLLAR")) {
			value = SILVERDOLLAR;
			LOGGER.info("Added a SilverDollar.");
		} else {
			value = INVALID;
			LOGGER.info("Added an invalid coin.");
		}
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return new String(Integer.toString(value));
	}
}
