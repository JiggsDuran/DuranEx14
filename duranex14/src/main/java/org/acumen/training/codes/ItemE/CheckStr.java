package org.acumen.training.codes.ItemE;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CheckStr {
	private static final Logger LOGGER = LogManager.getLogger("CHECKSTRLOGGER");
	
	public CheckStr() {
		LOGGER.info("Instantiating a CheckStr object.");
	}
	
	public String convert(String str) {
		LOGGER.info("Start of convert");
		
		String res = binarise(total(str));
		LOGGER.info("Result: {}", res);
		LOGGER.info("End of convert");
		return res;
	}
	
	public int total(String str) {
		LOGGER.info("Start of total");
		if(str == "") {
			LOGGER.info("Result: {}", 0);
			return 0;
		}
		
		if(str.length() == 1) {
			int res = ((int)(str.charAt(0)));
			LOGGER.info("Result: {}", res);
			return res;
		}
		
		int res = ((int)(str.charAt(0))) + total(str.substring(1));
		LOGGER.info(res);
		LOGGER.info("End of total");
		return res;
	}
	
	public String binarise(int givenstrvalue) {
		LOGGER.info("Start of binarise");
		if(givenstrvalue == 0) {
			LOGGER.info("");
			LOGGER.info("End of binarise");
			return "";
		}
		
		if(givenstrvalue % 2 == 1) {
			String res = binarise(givenstrvalue / 2);
			LOGGER.info("1{}", res);
			LOGGER.info("End of binarise");
			return "1%s".formatted(res);
		}
		
		String res = binarise(givenstrvalue / 2);
		LOGGER.info("0{}", res);
		LOGGER.info("End of binarise");
		return "0%s".formatted(res);
	}
}
