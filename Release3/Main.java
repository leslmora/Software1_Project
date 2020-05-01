import java.util.Scanner;
public class Main
{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String user = "user";
        int pass = 0;
        int bank = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int choice = 0;

        System.out.print("Welcome to the Pet Store\n");

        System.out.print("Please create an account if you do not have one:\n");
        System.out.print("1: Create Account\n");
        System.out.print("2: Employee\n");
        System.out.print("3: Costumer purchase\n");
        System.out.print("4: Costumer return\n");
        System.out.print("5: Exit\n");
        num1 = scan.nextInt();

        switch(num1){
            case 1:

                createaccount ac = new createaccount(user,pass,bank);
                ac.input(); // calls the input
                break;

            case 2:
                //creates new object ot call employee class
               EmployeeTest en = new EmployeeTest();
                en.Employee();
                break;

            case 3:

                System.out.print("****Purchase Menu****\n\n");
                Purchase purchase = new Purchase();
                purchase.runPurchaseMenu();
                break;

            case 4:
                //Asks user how many different items th user will return
                System.out.println("How many differnt categorical items are you returning? (Ex: Dog Items) ");
                System.out.println("Please enter a number 1-5");
                num3 = scan.nextInt();

                //loops until i is equal to the number of catigorical items the user chose to return
                for(int i = 1; i <= num3; i++){
                  
                  //Spacing
                  System.out.println();
                  scan.nextLine();

                  //user input of information about returning item
                  System.out.println("What is the category of the item you are returning(Dog, Cat, Fish, Bird, or Reptile): ");
                  String category = scan.nextLine();

                  System.out.println("What is the name of the item you are returning: ");
                  String item = scan.nextLine();

                  System.out.println("What is the quantity you are returning: ");
                  String quantity = scan.nextLine();

                  System.out.println("What is the price of the item you are returning: ");
                  Double price = scan.nextDouble();

                  System.out.println();
                  
                  //temp instance of a class that is the composit of the tree
                  Return King = new Return("Animal Item","Infinate", 1000000.00);

                  //switch case that allows user to choose the differnt item categories which are the leaves
                  switch (category){
                    case "Dog":

                    System.out.println("You are in the Dog category ");

                    //creating a new instance of a class based off user input
                    Return D1 = new Return( item, quantity, price);
                    //sets composit as leaf because they are similar
                    King.itemreturn(D1);

                    //prints the receipt
                    System.out.println();
                    System.out.println("Your item(s) have been returned to inventory.");
                    System.out.println("Here is your receipt.");
                    System.out.println();

                    //loop that connects to other class and prints out the returned information of item
                    for(Return output : King.getreturn()){
                      System.out.println(output);
                    }
                    break;
                    
                    case "Cat":

                    System.out.println("You are in the Cat category ");
                    //creating a new instance of a class based off user input
                    Return C1 = new Return(item, quantity, price);
                    //sets composit as leaf because they are similar
                    King.itemreturn(C1);

                    //prints the receipt
                    System.out.println();
                    System.out.println("Your item(s) have been returned to inventory.");
                    System.out.println("Here is your receipt.");
                    System.out.println();

                    //loop that connects to other class and prints out the returned information of item
                    for(Return output : King.getreturn()){
                      System.out.println(output);
                    }
                    break;
                    
                    case "Fish":

                    System.out.println("You are in the Fish category ");
                    //creating a new instance of a class based off user input
                    Return F1 = new Return(item, quantity, price);
                    //sets composit as leaf because they are similar
                    King.itemreturn(F1);

                    //prints the receipt
                    System.out.println();
                    System.out.println("Your item(s) have been returned to inventory.");
                    System.out.println("Here is your receipt.");
                    System.out.println();

                    //loop that connects to other class and prints out the returned information of item
                    for(Return output : King.getreturn()){
                      System.out.println(output);
                    }
                    break;
                    
                    case "Bird":

                    System.out.println("You are in the Bird category ");   
                    //creating a new instance of a class based off user input
                    Return B1 = new Return(item, quantity, price);
                    //sets composit as leaf because they are similar
                    King.itemreturn(B1);

                    //prints the receipt
                    System.out.println();
                    System.out.println("Your item(s) have been returned to inventory.");
                    System.out.println("Here is your receipt.");
                    System.out.println();

                    //loop that connects to other class and prints out the returned information of item
                    for(Return output : King.getreturn()){
                      System.out.println(output);
                    }
                    break;
                    
                    case "Reptile":
                    System.out.println("You are in the Reptile category ");
                    //creating a new instance of a class based off user input
                    Return R1 = new Return(item, quantity, price);
                    //sets composit as leaf because they are similar
                    King.itemreturn(R1);

                    //prints the receipt
                    System.out.println();
                    System.out.println("Your item(s) have been returned to inventory.");
                    System.out.println("Here is your receipt.");
                    System.out.println();

                    //loop that connects to other class and prints out the returned information of item
                    for(Return output : King.getreturn()){
                      System.out.println(output);
                    }
                    break;
                  }
                }
                break;
            case 5:

                System.out.print("Goodbye!");
                break;
        }
    }
}
