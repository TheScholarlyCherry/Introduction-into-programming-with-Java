package mp4_bcherry;
import java.time.LocalDate;
public class Author 
	{
	
		// Variables
	
	    private String firstName;
	    private String lastName;
	    private LocalDate birthday;

	    // Author
	    
	    public Author(String firstName, String lastName, int year, int month, int day) 
	    {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.birthday = LocalDate.of(year, month, day);
	    }

	    // Getters and setters
	    
	    public String getFirstName()
	    {
	        return firstName;
	    }

	    public void setFirstName(String firstName)
	    {
	        this.firstName = firstName;
	    }

	    public String getLastName()
	    {
	        return lastName;
	    }

	    public void setLastName(String lastName)
	    {
	        this.lastName = lastName;
	    }

	    public LocalDate getBirthday()
	    {
	        return birthday;
	    }

	    public void setBirthday(LocalDate birthday)
	    {
	        this.birthday = birthday;
	    }

	    // toString method
	    
	    public String toString()
	    {
	        return firstName + " " + lastName + "(birthday: " + birthday + ")";
	    }
	    
	    // Book Demo
	   
	    public class BookDemo
	    {
	    	
	    	// Main method
	    	
	    	public static void main(String[] args)
	    	{
	    	        Author author1 = new Author("E.L ", "James ", 1963, 3, 7);
	    	        Author author2 = new Author("Christian Arts ", "Publishers ", 1974, 6, 26);

	    	        Book book1 = new Book("Fifty Shades of Grey]", author1, "0345803485", 3.99);
	    	        Book book2 = new Book("KJV Holy Bible]", author2, "143213387X", 89.99);

	    	        System.out.println(book1);
	    	        System.out.println(book2);
	    	        
	    	        // Compares books

	    	        if (book1.equals(book2))
	    	        {
	    	            System.out.println("They are the same book.");
	    	        } else {System.out.println("They are not the same book.");}
	    	    }
	    	}
	}
