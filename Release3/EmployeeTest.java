import java.util.Scanner;

public class EmployeeTest extends EmployeeFactory{

    public static void Employee() {
      //to get input from user
        Scanner scan2 = new Scanner(System.in);

        //set to null
        String name = "";

        System.out.print("Please enter your employee name: \n");

        name = scan2.next();
        System.out.print("You entered "+ name + "\n");

        AbstractEmployee Employee4 = EmployeeFactory.getEmployee(name);
        //displays happy message if they are an employee
        if(Employee4 instanceof RealEmployee) System.out.println("You are an employee!");
        System.out.println(Employee4.getName());

        //instance variables set to the employee names
        AbstractEmployee Employee1 = EmployeeFactory.getEmployee("Will");
        AbstractEmployee Employee2 = EmployeeFactory.getEmployee("Grace");
        AbstractEmployee Employee3 = EmployeeFactory.getEmployee("Leslye");

        //Showes the list of employees if they entered the wrong name 
        System.out.println("Employee list: ");
        System.out.println(Employee1.getName());
        System.out.println(Employee2.getName());
        System.out.println(Employee3.getName());

    }
}
