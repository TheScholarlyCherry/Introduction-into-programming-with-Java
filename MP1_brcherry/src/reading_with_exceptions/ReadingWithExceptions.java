package reading_with_exceptions;

import java.io.*;
import java.util.*;

public class ReadingWithExceptions {
	   public void process(String inputFilename){
	       try {
	           BufferedReader reader = new BufferedReader(new FileReader(inputFilename));
	           // Read the first line for outputFilename and number_to_read
	           String firstLine = reader.readLine();
	           if (firstLine == null) 
	           {
	               System.out.println("Input file is empty. :(");
	               reader.close();
	               return;
	           }

	            StringTokenizer tokenizer = new StringTokenizer(firstLine);
	            if (!tokenizer.hasMoreTokens()) 
	            {
	                System.out.println("Invalid input format. Missing output filename. >:(");
	                reader.close();
	                return;
	            }

	            String outputFilename = tokenizer.nextToken();
	            int numberToRead;
	            try {
	                numberToRead = Integer.parseInt(tokenizer.nextToken());
	            } catch (NumberFormatException e) 
	            {
	                System.out.println("Invalid input format. Invalid number to read. T_T");
	                reader.close();
	                return;
	            }

	            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename));
	            int numbersRead = 0;

	            String line;
	            while ((line = reader.readLine()) != null && numbersRead < numberToRead) 
	            {
	                tokenizer = new StringTokenizer(line);
	                while (tokenizer.hasMoreTokens() && numbersRead < numberToRead) 
	                {
	                    try 
	                    {
	                        int number = Integer.parseInt(tokenizer.nextToken());
	                        writer.write(Integer.toString(number) + " ");
	                        numbersRead++;
	                        if (numbersRead % 10 == 0) 
	                        {
	                            writer.newLine();
	                        }
	                    } catch (NumberFormatException e) 
	                    {
	                        System.out.println("Skipping invalid number: " + e.getMessage());
	                    }
	                }
	            }
	            writer.close();
	            reader.close();
	            System.out.println(outputFilename + " created with the following output. UwU");
	            printFileContents(outputFilename);
	        } catch (IOException e) 
	        {
	            System.out.println("An error occurred: " + e.getMessage());
	       }
	    }

	    private void printFileContents(String filename) throws IOException 
	    {
	        BufferedReader reader = new BufferedReader(new FileReader(filename));
	        String line;
	        while ((line = reader.readLine()) != null) 
	        {
	            System.out.println(line);
	        }
	        reader.close();
	    }

	    public static void main(String[] args) 
	    {
	        ReadingWithExceptions reader = new ReadingWithExceptions();
	        for (String filename : args) 
	        {
	            reader.process(filename);
	        }
	    }
	}