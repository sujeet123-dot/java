package project;

public class Company {
  public static void main(String[] args) {
    Employee emp = new Employee("Alice", 50000.0);
        Manager man = new Manager("Bob", 80000.0, "IT");
        
        // TODO: Print their details using getDetails()
        System.out.println(emp.getDetails());
        System.out.println(man.getDetails());
  }
}
