package mp6_bcherry;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters and Setters
 
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age &&
               name.equals(person.name) &&
               email.equals(person.email);
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Email: " + email;
    }
}

