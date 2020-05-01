//constructor class for if the employee is correct
import java.util.Scanner;
public class RealEmployee extends AbstractEmployee{
    public RealEmployee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean NotName() {
        return false;
    }
}
