package org.acumen.training.codes.ItemF;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class VendingMachine {
	private static final Logger LOGGER = LogManager.getLogger("VENDINGMACHINELOGGER");
	private int totValue;
	private int currValue;
	private boolean enabled;
	private static final int COST = 75;

	public VendingMachine() {
		totValue = 0;
		currValue = 0;
		enabled = false;
	}

	public void insert(Coin coin) {
		LOGGER.info("Start of insert()");
		int value = coin.getValue();
		if (value == 0) {
			LOGGER.error("Illegal value.");
		} else {
			currValue += value;
			LOGGER.info("Current value = {}", currValue);
			if (currValue >= COST) {
				enabled = true;
				LOGGER.info("(sufficient credit)");
			} else
				LOGGER.info("");
		}
		LOGGER.info("End of insert()");
	}

	public void returnCoins() {
		LOGGER.info("Start of returnCoins()");
		if (currValue == 0) {
			LOGGER.error("No coins to return");
		} else {
			LOGGER.error("Take your coins");
			currValue = 0;

			enabled = false;
		}
		LOGGER.info("End of returnCoins()");
	}

	public void vend() throws Exception {
		LOGGER.info("Start of vend()");
		if (enabled) {
			LOGGER.info("Get your drink");
			totValue += COST;
			currValue -= COST;
			if (currValue == 0)
				enabled = false;
			LOGGER.info("Current value = {}", currValue);
		} else {
			int res = COST - currValue;
			LOGGER.info("Not enough credit: add {}", res);
		}
		if (currValue < 0) {
			LOGGER.error("Error: negative credits!");
			throw new Exception("Error: negative credit!");
		}
		
		LOGGER.info("End of vend()");
	}
}
