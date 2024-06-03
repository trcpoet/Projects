public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "VP", 89000.0);
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer", 67000.0);
        Employee employee3 = new Employee("Jay Rogers", 81774, "Manufacturing", "Engineer", 66000);
        System.out.println("Name \t\t\t ID Number \t\t\t Department \t\t\t Position \t\t\t Salary");
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println(employee1.getName()+"\t" + employee1.getIdNumber()+"\t\t\t\t"+employee1.getDepartment()+"\t\t\t\t"+employee1.getPosition()+"\t\t\t\t\t"+employee1.getSalary());
        System.out.println(employee2.getName()+"\t\t" + employee2.getIdNumber()+"\t\t\t\t"+employee2.getDepartment()+"\t\t\t\t\t\t"+employee2.getPosition()+"\t\t\t"+employee2.getSalary());
        System.out.println(employee3.getName()+"\t\t" + employee3.getIdNumber()+"\t\t\t\t"+employee3.getDepartment()+"\t\t\t"+employee3.getPosition()+"\t\t\t"+employee3.getSalary());
    }

    }