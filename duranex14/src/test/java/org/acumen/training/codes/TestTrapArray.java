package org.acumen.training.codes;

import org.acumen.training.codes.ItemD.BadIndexException;
import org.acumen.training.codes.ItemD.ElementCharException;
import org.acumen.training.codes.ItemD.ElementDecimalException;
import org.acumen.training.codes.ItemD.InvalidSizeException;
import org.acumen.training.codes.ItemD.LetterSizeException;
import org.acumen.training.codes.ItemD.TrapArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTrapArray {
	private TrapArray trapArr;
	
	@BeforeEach
	public void setUp() {
		trapArr = new TrapArray();
	}
	
	@AfterEach
	public void tearDown() {
		trapArr = null;
	}
	
	@Test
	public void testTrapArray() {
		try {
			trapArr.arrayTransact();
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		} catch (LetterSizeException e) {
			e.printStackTrace();
		} catch (InvalidSizeException e) {
			e.printStackTrace();
		} catch (ElementCharException e) {
			e.printStackTrace();
		} catch (ElementDecimalException e) {
			e.printStackTrace();
		} catch (BadIndexException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
