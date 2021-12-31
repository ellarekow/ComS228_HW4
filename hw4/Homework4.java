package hw4;

import java.io.*;
import java.util.*;

/**
 * 
 * @author Ella Rekow
 *
 */
public class Homework4 {
	
	public static void main(String[] args) throws IOException{
		//for the input from the user
		Scanner reader = new Scanner(System.in);
		String in = "";

		//gets the filename
		System.out.println("Please ente filename to decode: ");
		in = reader.next();
		
		File encoded = new File(in);
		
		//New scanner to read through file
		Scanner decoder = new Scanner(encoded);
		
		
		String input = decoder.next();
		//WHATEVER NEEDED TO OUTPUT THE MESSAGE 
		MsgTree msgTree = new MsgTree(input);
		String decoded = "";
		
		//Prints the output
		System.out.println("MESSAGE: ");
		
		//closes the scanners
		reader.close();
		decoder.close();
	}
}
