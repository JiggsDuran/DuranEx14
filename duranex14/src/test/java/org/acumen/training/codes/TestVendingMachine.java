package org.acumen.training.codes;

import org.acumen.training.codes.ItemF.Coin;
import org.acumen.training.codes.ItemF.VendingMachine;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVendingMachine {
	private VendingMachine vm;
	
	@BeforeEach
	public void setUp() {
		vm = new VendingMachine();
	}
	
	@AfterEach
	public void tearDown() {
		vm = null;
	}
	
	@Test
	public void testVendingMachine() {
		Coin penny = new Coin("PENNY");
		Coin nickel = new Coin("NICKEL");
		Coin silverDollar = new Coin("SilverDollar");
		Coin coin = new Coin("Peso");
		
		vm.insert(penny);
		vm.insert(nickel);
		vm.insert(silverDollar);
		vm.insert(coin);
		
		try {
			vm.vend();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		vm.returnCoins();
		
		try {
			vm.vend();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
