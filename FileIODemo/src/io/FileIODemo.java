package io;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIODemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scannerIO = null;
		FileWriter fileOut = null;
		FileReader fileIO = null;
		PrintWriter printOut = null;
		int c;
		
		try {
		fileIO = new FileReader("input.txt");
		fileOut = new FileWriter("output.txt");
		scannerIO = new Scanner(new FileInputStream("input.txt"));
		printOut = new PrintWriter(new FileOutputStream("other_output.txt"));
		c = fileIO.read();
		while (c != -1) {
			System.out.println((char)c);
			fileOut.write(c);
			c = fileIO.read();
		}
		while(scannerIO.hasNext()) {
			//System.out.println(scannerIO.next());
			printOut.println(scannerIO.next());
		}
		} catch(FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(fileIO != null) {fileIO.close();}
			scannerIO.close();
			fileOut.close();
		}
	}
}
