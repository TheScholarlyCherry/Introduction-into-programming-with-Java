package person_io;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PersonManager {
    private static final String FILE_NAME = "persons.dat";

    @SuppressWarnings("unchecked")
    private static List<Person> loadPersonsFromFile() 
    {
        List<Person> persons = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) 
        {
            Object obj = ois.readObject();
            if (obj instanceof List<?>) 
            {
                persons = (List<Person>) obj;
            }
        } catch (FileNotFoundException e) 
        {
            // Ignore if the file doesn't exist initially
        } catch (IOException | ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        return persons;
    }

    private static void savePersonsToFile(List<Person> persons) 
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) 
        {
            oos.writeObject(persons);
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) 
    {
        List<Person> persons = loadPersonsFromFile();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please choose an option:");
            System.out.println("0: quit");
            System.out.println("1: add");
            System.out.println("2: display");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) 
                {
                    case 1:
                        addPerson(persons, scanner);
                        break;
                    case 2:
                        displayPersons(persons);
                        break;
                    case 0:
                        System.out.println("Bye");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) 
            {
                System.out.println("Invalid input. Please enter a valid option.");
                scanner.nextLine(); // Consume invalid input
                choice = -1; // Reset choice to an invalid value to continue the loop
            }
        } while (choice != 0);

        savePersonsToFile(persons);
        scanner.close();
    }

    private static void addPerson(List<Person> persons, Scanner scanner) 
    {
        while (true) 
        {
            try 
            {
                System.out.println("Please enter the person's name:");
                String name = scanner.nextLine();

                System.out.println("Please enter the person's age:");
                int age = Integer.parseInt(scanner.nextLine());

                if (age < 0) 
                {
                    throw new IllegalArgumentException("Age must be a non-negative integer.");
                }

                Person person = new Person(name, age);
                persons.add(person);
                System.out.println("Person added: " + person);
                break; // Exit the loop if input is valid
            } catch (NumberFormatException e) 
            {
                System.out.println("Invalid age format. Please enter a valid integer.");
            } catch (IllegalArgumentException e) 
            {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void displayPersons(List<Person> persons) 
    {
        System.out.println("***********************");
        for (Person person : persons) 
        {
            System.out.println(person);
        }
        System.out.println("***********************");
    }
}
