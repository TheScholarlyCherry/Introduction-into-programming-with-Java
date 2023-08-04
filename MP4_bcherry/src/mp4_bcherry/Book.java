package mp4_bcherry;

public class Book {
	
	// Declaration of variables
	
	private String name;
    private Author author;
    private String ISBN;
    private double price;
    
    // Book

    public Book(String name, Author author, String ISBN, double price) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    // Getters and setters
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method
    public String toString() {
        return "Book [" +
                name + " by " +
                author + " " +
                "isbn=" + ISBN +
                ", price=" + price +
                "]";
    }

    // equals method
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return ISBN.equals(other.ISBN);
    }
}