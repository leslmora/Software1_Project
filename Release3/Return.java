import java.util.List; // import just the List interface
import java.util.ArrayList; // import just the ArrayList class
import java.util.Scanner;// import to scan in user imput

public class Return{

  //declaring new variables
  private String item;
  private String quantity;
  private double price;
  private List<Return> returninginfo;

  //constructor
  public Return(String item, String quantity, double price){
    
    this.item = item;
    this.quantity = quantity;
    this.price = price;
    returninginfo = new ArrayList<Return>();
  }

  //function that sets composite to leaf information
  public void itemreturn(Return i){
    returninginfo.add(i);
  }

  //function used in main to call upon return infortion
  public List<Return> getreturn(){
    return returninginfo;
  }

  //function that return printed information of returned item
  public String toString()
  {
    return ("Receipt:" + "\n" + "Item Name: " + item + "\n" + "Quantity: " + quantity + "\n" + "Price: " + price + "\n" );
  }
}
