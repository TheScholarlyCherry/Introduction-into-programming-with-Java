package mp3_brcherry;

public class Comparable_Interface implements Comparable<Comparable_Interface> {
    private static int currentMaxStudentID = 0;

    private int studentID;
    private String name;
    private double gpa;

    // Constructor to create a student with a unique ID
    public Comparable_Interface(String name, double gpa) 
    {
        this.name = name;
        this.gpa = gpa;
        this.studentID = ++currentMaxStudentID; // Auto-generate studentID
    }

    // getters
    public int getStudentID() 
    {
        return studentID;
    }

    public String getName() 
    {
        return name;
    }

    public double getGPA() 
    {
        return gpa;
    }

    // setters
    public void setName(String name) 
    {
        this.name = name;
    }

    public void setGPA(double gpa) 
    {
        this.gpa = gpa;
    }

    // compareTo method for comparing based on studentID
    
    public int compareTo(Comparable_Interface other) 
    {
        return Integer.compare(this.studentID, other.studentID);
    }

    public static void main(String[] args) 
    {
        // Testing the MySelectionSort class
        Comparable_Interface[] students = 
        	{
                new Comparable_Interface("Alice", 3.8),
                new Comparable_Interface("Bob", 3.5),
                new Comparable_Interface("Charlie", 3.9),
                new Comparable_Interface("David", 3.2)
        };

        // Sort by studentID
        MySelectionSort.sort(students);
        System.out.println("Sorted by studentID:");
        printStudents(students);
        
        // Sort by name
        MySelectionSort.sort(students);
        System.out.println("\nSorted by name:");
        printStudents(students);
    }

    private static void printStudents(Comparable_Interface[] students) 
    {
        for (Comparable_Interface student : students) 
        {
            System.out.println("ID: " + student.getStudentID() +
                    ", Name: " + student.getName() +
                    ", GPA: " + student.getGPA());
        }
    }
}

class MySelectionSort 
{
    // Generic method to sort an array of Comparable objects
    public static <T extends Comparable<T>> void sort(T[] arr) 
    {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[j].compareTo(arr[minIndex]) < 0) 
                {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            T temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

