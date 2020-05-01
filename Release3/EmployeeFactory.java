
public class EmployeeFactory {
  //this is the known list of employees
    public static final String[] Employee = {"Grace", "Will", "Leslye"};
    //compares what the user entered to the list and goes to 
    //not employee if not and realemployee if so
    public static AbstractEmployee getEmployee(String name){
          for (int i = 0; i < Employee.length; i++){
            if (Employee[i].equalsIgnoreCase(name)){
                return new RealEmployee(name);
            }
        }
        return new NotEmployee();
    }
}
