package mp6_bcherry;

public class Faculty extends Person {
    private String department;
    private String office;

    public Faculty(String name, int age, String email, String department, String office) {
        super(name, age, email);
        this.department = department;
        this.office = office;
    }

    // Getters and Setters
    
    public String getDepartment() {
  		return department;
  	}

  	public void setDepartment(String department) {
  		this.department = department;
  	}

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {  // Call the superclass implementation first
            return false;
        }
        if (obj instanceof Faculty) { // Then compare subclass-specific attributes
            Faculty faculty = (Faculty) obj;
            return department.equals(faculty.department) &&
                   office.equals(faculty.office);
        }
        return false;
    }

	public String toString() {
        return super.toString() + ", Department: " + department + ", Office: " + office;
    }
}
