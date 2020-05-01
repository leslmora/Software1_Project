//class for when the employee is not correct
public class NotEmployee extends AbstractEmployee{
    public String getName(){
      //display sad message
        return "You are not an employee!";
    }
    //else case
    public boolean NotName(){
        return true;
    }
}
