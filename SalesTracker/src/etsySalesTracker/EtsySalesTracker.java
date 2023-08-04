package etsySalesTracker;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

	class Order implements Serializable {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String customerName;
	    private String email;
	    private String phoneNumber;
	    private String orderNumber;
	    private String orderDate;
	    private double amount;
	    private ArrayList<String> itemsPurchased;

	    public Order(String customerName, String email, String phoneNumber, String orderNumber, String orderDate, double amount, ArrayList<String> itemsPurchased) {
	        this.customerName = customerName;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	        this.orderNumber = orderNumber;
	        this.orderDate = orderDate;
	        this.amount = amount;
	        this.itemsPurchased = itemsPurchased;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public String getOrderNumber() {
	        return orderNumber;
	    }

	    public String getOrderDate() {
	        return orderDate;
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public ArrayList<String> getItemsPurchased() {
	        return itemsPurchased;
	    }
	}

	public class EtsySalesTracker {
	    private static ArrayList<Order> sales = new ArrayList<>();

	    public static void main(String[] args) {
	        loadData(); // Load previously stored data

	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Enter '1' to add new client information");
	            System.out.println("Enter '2' to search for past information");
	            System.out.println("Enter '3' to quit");

	            String choice = scanner.nextLine();
	            if (choice.equals("1")) {
	                addNewOrder(scanner);
	            } else if (choice.equals("2")) {
	                searchPastOrders(scanner);
	            } else if (choice.equals("3")) {
	                break;
	            } else {
	                System.out.println("Invalid choice. Please try again.");
	            }
	        }

	        saveData(); // Save the data before exiting
	        System.out.println("Sales data saved. Exiting the program.");
	    }

	    private static void addNewOrder(Scanner scanner) {
	        System.out.println("Enter customer name:");
	        String customerName = scanner.nextLine();

	        System.out.println("Enter customer email:");
	        String email = scanner.nextLine();

	        System.out.println("Enter customer phone number:");
	        String phoneNumber = scanner.nextLine();

	        System.out.println("Enter order number:");
	        String orderNumber = scanner.nextLine();

	        System.out.println("Enter order date:");
	        String orderDate = scanner.nextLine();

	        System.out.println("Enter order amount:");
	        double amount = scanner.nextDouble();
	        scanner.nextLine();

	        ArrayList<String> itemsPurchased = new ArrayList<>();
	        while (true) {
	            System.out.println("Enter item purchased (or 'q' to finish):");
	            String item = scanner.nextLine();
	            if (item.equalsIgnoreCase("q")) {
	                break;
	            }
	            itemsPurchased.add(item);
	        }

	        Order order = new Order(customerName, email, phoneNumber, orderNumber, orderDate, amount, itemsPurchased);
	        sales.add(order);

	        System.out.println("Order successfully added!");
	    }

	    private static void searchPastOrders(Scanner scanner) {
	        System.out.println("Enter customer email to search for past orders:");
	        String email = scanner.nextLine();

	        boolean found = false;
	        for (Order order : sales) {
	            if (order.getEmail().equalsIgnoreCase(email)) {
	                System.out.println("-------------------------");
	                System.out.println("Customer Name: " + order.getCustomerName());
	                System.out.println("Email: " + order.getEmail());
	                System.out.println("Phone Number: " + order.getPhoneNumber());
	                System.out.println("Order Number: " + order.getOrderNumber());
	                System.out.println("Order Date: " + order.getOrderDate());
	                System.out.println("Order Amount: $" + order.getAmount());
	                System.out.println("Items Purchased: " + order.getItemsPurchased());
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("No past orders found for the provided email.");
	        }
	    }

	    private static void saveData() {
	        FileOutputStream fileOut = new FileOutputStream("sales_data.ser");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(sales);
			objectOut.close();
			fileOut.close();
			System.out.println("Sales data saved successfully.");
	    }

	    private static void loadData() {
	        FileInputStream fileIn = new FileInputStream("sales_data.ser");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			sales = (ArrayList<Order>) objectIn.readObject();
			objectIn.close();
			fileIn.close();
			System.out.println("Sales data loaded successfully.");
	    }
	}
