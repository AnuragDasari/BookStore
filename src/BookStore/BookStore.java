/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *This class is Main class for bookstore 
 *This application helps book vendor to keep track of inventory and members
 *It also helps completing purchases
 * 
 * @author anurag
 */
public class BookStore implements BookstoreSpecification{

    //Array List for members
    public List<Customer> memberList = new ArrayList<>(); 
    //Array List for orders
    private List<ProductOrder> orderList = new ArrayList<>(); 
    int numBooks = 100; //initial inventory of books set to 100
    int numCDs = 100; //initial inventory of CDs set to 100
    int numDVDs = 100; //initial inventory of DVDs set to 100
    private List<Product> productList = new ArrayList<>();
    /**
     *Main method
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        BookStore store = new BookStore();
        Scanner sc = new Scanner(System.in); //Scanner for user input
        int ID = 0;
        System.out.println("******Welcome To The Book Store******");
        while (store.getNumOrdersPending() != 0){
            // Menu for user input
            System.out.println("Please select from the following menu of"
                    + " options, by typing a number:");
            System.out.println("\t 1. Order Products");
            System.out.println("\t 2. Create member");
            System.out.println("\t 3. Check total money spent by member");
            System.out.println("\t 4. Checkout");
            System.out.println("\t 5. Check total members enrolled");
            System.out.println("\t 6. Store Information");
            System.out.println("\t 7. Exit");
            int num = sc.nextInt();
            switch (num) {
                //For purchasing products
                case 1:
                    System.out.println("How many books do you want? $10 each");
                    int book = sc.nextInt();
                    System.out.println("How many CDs do you want? $15 each");
                    int CD = sc.nextInt();
                    System.out.println("How many DVDs do you want? $20 each");
                    int DVD = sc.nextInt();
                    System.out.println("Enter your ID");
                    Customer selCustomer;
                    ID = sc.nextInt();
                    int foundCustomer = store.findCustomerID(ID);
                    //If else statements to add order to cart
                    if(foundCustomer >= 0){
                        selCustomer = store.memberList.get(foundCustomer);                       
                    }
                    else{
                      selCustomer = new Customer(ID, 0, 0, 0); 
                      store.memberList.add(selCustomer);
                    }
                    ProductOrder newOrder = new ProductOrder(book, CD, DVD);
                    store.orderList.add(newOrder); 
                    selCustomer.addOrder(newOrder);
                    break;
                //For crating a member
                case 2:
                    System.out.println("Do you want to enroll for Premium "
                            + "membership for an additional $10? (Y/N)");
                     
                    char letter = sc.next().charAt(0);
                     boolean isPremium = false;
                     //If else statements for user to enroll in membership
                     if (letter == 'Y' || letter == 'y') {
                     isPremium = true;
                     System.out.println("Thank you for enrolling as a "
                             + "Premium member");
                    }
                     else{
                         System.out.println("Thank you for enrolling in our"
                                 + "free membership");
                     }                    
                     System.out.println("Please choose a unique ID number: ");                   
                     ID = sc.nextInt();
                     selCustomer = new Customer(ID, 0, 0, 0); 
                     selCustomer.isPremium = isPremium;
                     store.memberList.add(selCustomer);
                     break;
                 //For checking total money spent   
                case 3:
                    System.out.println("Enter the customer ID to check money"
                            + "spent");
                    ID = sc.nextInt();                    
                    System.out.println("The total amount spent by the customer "
                        + "is: $"
                        + store.memberList.get(store.findCustomerID(ID)).getProductTotal());
                    break;
                //For Completing the purchase    
                case 4: 
                    System.out.println("Enter the ID for checkout");
                    ID = sc.nextInt();
                    int foundID = store.findCustomerID(ID);
                    //For total inventory
                    store.memberList.get(foundID).checkout();
                    store.memberList.get(foundID).printInventory();
                    System.out.println("******Total Inventory******");
                    store.printInventory();
                    //For total inventory after purchase
                    store.numBooks -= store.memberList.get(foundID).getBook();
                    store.numCDs -= store.memberList.get(foundID).getCD();
                    store.numDVDs -= store.memberList.get(foundID).getDVD();
                    System.out.println("******Inventory after purchase******");
                    store.printInventory();
                    //if statement for monthly due if not paid.
                    if(store.memberList.get(foundID).isPremium 
                        && store.memberList.get(foundID).isDue){
                            System.out.println("Monthly fee is due ");
                            store.memberList.get(foundID).isDue = false;
                    }
                    System.out.println("******PURCHASE COMPLETE******");
                    break;
                //To exit the application    
                case 5:
                    int totalMembers = store.findCustomerID(ID);
                    System.out.println("Total members enrolled in the store: "
                            + totalMembers);
                    break; 
                case 6:
                    System.out.println("******Store Information******");
                    System.out.println(" ");
                    //Adding new books
                    System.out.println("*****Books*****");
                    Books b1 = new Books("Quantum Computing: An Applied Approach",
                            "Jack D. Hidary", 10.99, 30);
                    Books b2 = new Books("Clean Code: A Handbook of Agile Software"
                            + " Craftsmanship","Robert C. Martin", 19.99, 50);
                    Books b3 = new Books("Learn to Earn: A Beginner's Guide to the Basics "
                            + "ofInvesting and Business","Peter Lynch, John Rothchild"
                            , 26.99, 20);
                    //Displaying books
                    b1.display();
                    b2.display();
                    b3.display();
                    System.out.println(" ");
                    //Adding CDs
                    System.out.println("*****CDs*****");
                    CDs c1 = new CDs("Blanco 5", "Millyz", 10.99, 45);
                    CDs c2 = new CDs("Montega", "French Montana", 14.99, 30);
                    CDs c3 = new CDs("Mr. Morale & The Big Steppers", "Kendrick Lamar", 
                            19.99, 25);
                    //Displaying CDs
                    c1.display();
                    c2.display();
                    c3.display();
                    System.out.println(" ");
                    //Adding DVDs
                    System.out.println("*****DVDs*****");
                    DVDs d1 = new DVDs("Jurassic World Dominion", "Adventure", 15.99, 20 );
                    DVDs d2 = new DVDs("The Gray Man", "Action", 17.99, 37 );
                    DVDs d3 = new DVDs("Paws of Fury: The Legend of Hank", "Animation",
                            14.99, 43 );
                    //Displaying DVDs
                    d1.display();
                    d2.display();
                    d3.display();
                    System.out.println(" ");
                    //Adding Members
                    System.out.println("*****Regular Members*****");
                    Member m1 = new Member("Luke Croft", 80);
                    Member m2 = new Member("Robert Atkins", 117);
                    Member m3 = new Member("Santiago Prada", 164);
                    //Displaying members
                    m1.display();
                    m2.display();
                    m3.display();
                    System.out.println(" ");
                    //Premium members
                    System.out.println("*****Premium Members*****");
                    PremiumMember p1 = new PremiumMember("Adam Cubric", 342, true);
                    PremiumMember p2 = new PremiumMember("Kevin Govia", 435, false);
                    PremiumMember p3 = new PremiumMember("Irene Smith", 213, true);
                    //Display
                    p1.display();
                    p2.display();
                    p3.display();
                    break;
                case 7:
                    System.exit(0);
                    break;    
            }
        }
    }

    /**
     *Prints inventory 
     */
    
    public void printInventory(){
        System.out.println("Inventory of Books : " + this.numBooks);
        System.out.println("Inventory of CDs : " + this.numCDs);
        System.out.println("Inventory of DVDs : " + this.numDVDs);
    }

    /**
     *This method stores Premium members
     * 
     * @return newCutomer added to memberList;
     */
    public Customer registerPremiumMember(){ 
        Customer newCustomer = new Customer(0, 0, 0, 0); // initial set to 0
        newCustomer.isPremium = true;
        memberList.add(newCustomer);
        return newCustomer;
    }

    /**
     *This method is used for menu looping
     * 
     * @return stored orders in order list
     */
    public int getNumOrdersPending(){
        return orderList.size();
    }

    /**
     *Method to store customer's orders
     */
    public BookStore(){
        Customer newCustomer = new Customer(0, 0, 0, 0); // initial set to 0
        ProductOrder newOrder = new ProductOrder(0, 0, 0); // initial set to 0
        orderList.add(newOrder);
        memberList.add(newCustomer);
        newCustomer.addOrder(newOrder);
    }

    /**
     *This method uses sequential search
     * 
     * @param ID integer for storing the ID number
     * @return if true return the number, else return -1
     */
    public int findCustomerID(int ID){
        //Searching for the order using a loop through the list 
        for(int i=0;i<this.memberList.size();i++){
            if(this.memberList.get(i).getID() == ID)
                return i;
        }
        return -1;
    }

    @Override
    public int restockProduct(int productId, int amount) {
        return amount;
    }

    @Override
    public double inventoryValue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    