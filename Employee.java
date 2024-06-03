public class Employee {
    String name;
    int idNumber;
    String department;
    String position;
    double salary;

    // constructor that accepts name, idNumber, department, position, and salary as arguments
    public Employee(String name, int idNumber, String department, String position, double salary) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
        if (salary >= 0.0 && salary <= 90000.0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }
    }
    public Employee(String name, int idNumber) {
        this(name, idNumber, "", "", 0.0);
    }

    public Employee() {
        this("", 0, "", "", 0.0);
    }

    // mutator method for name
    public void setName(String name) {
        this.name = name;
    }

    // mutator method for idNumber
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    // mutator method for department
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        if (salary >= 0.0 && salary <= 90000.0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }
    }

    // accessor method for name
    public String getName() {
        return name;
    }

    // accessor method for idNumber
    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    // toString method to return information to the Employee object
    @Override
    public String toString() {
        return "Name: " + name + ", ID Number: " + idNumber + ", Department: " + department + ", Position: " + position + ", Salary: " + salary;
    }
}
