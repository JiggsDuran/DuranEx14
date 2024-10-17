package org.acumen.training.codes.ItemD;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TrapArray {
	private static final Logger LOGGER = LogManager.getLogger("TRAPARRAYLOGGER");
	int[] arr;
		
	public void arrayTransact() throws LetterSizeException, InvalidSizeException, 
		ElementCharException, ElementDecimalException, BadIndexException,
		NegativeArraySizeException, Exception {
		LOGGER.info("TrapArray starts.");
		Scanner scan = new Scanner(System.in);
		String userInput = "";
				
		getArrSize(userInput, scan);
		getArrValue(userInput, scan);
		displayArrValue(userInput, scan);
	}
	
	private void getArrSize(String userInput, Scanner scan) throws 
		LetterSizeException, InvalidSizeException, NegativeArraySizeException, 
		Exception {
		while(true){
			System.out.print("Enter the array size: ");
			try{
				userInput = scan.nextLine();
				if(userInput.equalsIgnoreCase("e")) {
					System.err.println("Good Bye");
					scan.close();
					System.exit(0);
				}
				checkSizeInput(userInput);
				arr = new int[Integer.parseInt(userInput)];
				break;
			} catch (LetterSizeException e) {
				LOGGER.error("Letter size exception.");
			} catch (InvalidSizeException e) {
				LOGGER.error("Invalid size exception.");
			} catch (NegativeArraySizeException e) {
				LOGGER.error("Negative array size exception.");
			} catch (Exception e) {
				LOGGER.error("Letter size exception.");
			}
		} 			
	}
	
	private void getArrValue(String userInput, Scanner scan) throws 
		ElementCharException, ElementDecimalException, BadIndexException, 
		Exception{
		int index = 0;
		while(index < arr.length) {
			System.out.print("Enter the value: ");
			try{
				userInput = scan.nextLine();
				if(userInput.equalsIgnoreCase("e")) {
					System.err.println("Good Bye");
					scan.close();
					System.exit(0);
				}
				checkDecimalInput(userInput);
				checkCharStringInput(userInput);
				arr[index++] = Integer.parseInt(userInput);
			} catch (ElementCharException e) {
				LOGGER.error("Element char exception.");
			} catch (ElementDecimalException e) {
				LOGGER.error("Element decimal exception.");
			} catch (NegativeArraySizeException e) {
				LOGGER.error("Negative array size exception.");
			} catch (BadIndexException e) {
				LOGGER.error("Bad index exception.");
			}
		} 
		LOGGER.info("Array of {} integers created.", arr.length);
	}
	
	private void displayArrValue(String userInput, Scanner scan) throws 
		BadIndexException, ElementCharException, ElementDecimalException,
		Exception{
		while(true){
			System.out.print("Enter the index that you want to view: ");
			try{
				userInput = scan.nextLine();
				if(userInput.equalsIgnoreCase("e")) {
					System.err.println("Good Bye");
					scan.close();
					System.exit(0);
				}
				checkDecimalInput(userInput);
				checkCharStringInput(userInput);
				getArrIndex(Integer.parseInt(userInput));
			} catch(BadIndexException e) {
				LOGGER.error("Bad index exception.");
			} catch (ElementCharException e) {
				LOGGER.error("Element char exception.");
			} catch (ElementDecimalException e) {
				LOGGER.error("Element decimal exception.");
			} catch (Exception e) {
				LOGGER.error("Exception");
			}
		}
	}
	
	private void getArrIndex(int index) throws BadIndexException, Exception{
		if(index > arr.length-1) {
			throw new BadIndexException();
		}
		System.out.println("The value in index %d is %d".formatted(index, arr[index]));
	}
	
	private void checkCharStringInput(String arrValue) throws ElementCharException, 
		Exception {
		if(arrValue.length() == 1 && !arrValue.matches("\\d")) {
			throw new ElementCharException("Invalid element value: [character]");
		} else if(arrValue.length() > 1 && !arrValue.matches("\\d+")) {
			throw new ElementCharException("Invalid element value: [String]");
		} 
	}

	private void checkDecimalInput(String arrValue) throws ElementDecimalException, 
		NegativeArraySizeException, BadIndexException, Exception {
		if(arrValue.matches("-?\\d*\\.\\d+")) {
			throw new ElementDecimalException("Invalid element value: [floating-point]");
		} else if(arrValue.matches("-\\d+") && Integer.parseInt(arrValue) < 0) {
			throw new BadIndexException();
		}
	}
	
	private void checkSizeInput(String arrSize) throws NegativeArraySizeException, 
		LetterSizeException, InvalidSizeException, Exception {
		if(arrSize.matches("[-]*[\\d\\.]")) {
			if(Integer.parseInt(arrSize) < 0) {
				throw new NegativeArraySizeException();
			}
		} else if(arrSize.matches("\\w+")){
			throw new LetterSizeException();
		} else {
			throw new InvalidSizeException();
		}
	}
}