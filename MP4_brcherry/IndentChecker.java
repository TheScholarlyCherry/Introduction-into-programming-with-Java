import java.util.Stack;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class BadIndentationException extends RuntimeException 
{
    private static final long serialVersionUID = 1L;

    BadIndentationException(String error) 
    {
        super(error);
    }
}

public class IndentChecker {
    Stack<Integer> indentStack = new Stack<Integer>();

    private int findFirstNonBlank(String line) 
    {
        for (int i = 0; i < line.length(); i++) {
            if (!Character.isWhitespace(line.charAt(i))) 
            {
                return i;
            }
        }
        return -1;
    }

    private void processLine(String line, int lineNumber) 
    {
        int index = findFirstNonBlank(line);

        if (index == -1) 
        {
            return;
        }

        if (indentStack.isEmpty()) 
        {
            indentStack.push(index);
            return;
        }

        if (index > indentStack.peek()) 
        {
            indentStack.push(index);
            return;
        }

        while (!indentStack.isEmpty() && index < indentStack.peek()) 
        {
            indentStack.pop();
        }

        if (indentStack.isEmpty() || index != indentStack.peek()) 
        {
            throw new BadIndentationException("Improperly indented at line " + lineNumber);
        }
    }

    public void checkIndentation(String fileName) 
    {
        indentStack.clear();
        boolean hasIndentationIssues = false;

        try {
            Scanner input = new Scanner(new File(fileName));
            int lineNumber = 0;

            while (input.hasNextLine()) 
            {
                String line = input.nextLine();
                lineNumber++;
                try {
                    processLine(line, lineNumber);
                } catch (BadIndentationException e) 
                {
                    hasIndentationIssues = true;
                    System.out.println(e.getMessage());
                }
            }
            input.close();

            if (!hasIndentationIssues) 
            {
                System.out.println(fileName + " has no indentation issues.");
            }
        } catch (FileNotFoundException e) 
        {
            System.out.println("Can't open file: " + fileName);
        }
    }

    public static void main(String[] args) 
    {
        IndentChecker indentChecker = new IndentChecker();

        for (String fileName : args) 
        {
            System.out.println("Processing file: " + fileName);
            indentChecker.checkIndentation(fileName);
        }
    }
}

