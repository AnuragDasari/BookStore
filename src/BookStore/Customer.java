/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookStore;
import java.util.ArrayList;
import java.util.List;

/**
 *Class for Customer
 * 
 * @author anurag
 */
public class Customer {
    private List<ProductOrder> orderList = new ArrayList<>();
    boolean isPremium;
    boolean isDue = true;
    int ID = 0;
    int numCD = 0;
    int numDVD = 0;
    int numBook = 0;

    /**
     *Constructor to store parameters below
     * 
     * @param ID integer for ID number
     * @param numCD integer for CDs given by user
     * @param numDVD integer for DVDs given by user
     * @param numBook integer for Books given by user
     */
    public Customer(int ID, int numCD, int numDVD, int numBook){
        this.ID = ID;
        this.numCD = numCD;
        this.numDVD = numDVD;
        this.numBook = numBook;
    }

    /**
     *Method to add order to the list
     * 
     * @param newOrder
     * @return order added to list
     */
    public ProductOrder addOrder(ProductOrder newOrder){
        this.orderList.add(newOrder);
        return newOrder;
    }

    /**
     * Method adds Products to checkout
     */
    public void checkout(){
        for (ProductOrder order : orderList) {
            numCD += order.getCD();
            numDVD += order.getDVD();
            numBook += order.getBook();
        }  
        orderList.clear();
    }

    /**
     * Method to print Inventory 
     */
    public void printInventory(){
        System.out.println("Books : " + this.numBook);
        System.out.println("CDs : " + this.numCD);
        System.out.println("DVDs : " + this.numDVD);       
    }

    /**
     *Method to get Books given by user
     * 
     * @return number of books in list
     */
    public int getBook(){
        return numBook;
    }

    /**
     *Method that sets Books given by user
     * 
     * @param numBook integer that stores number Books
     */
    public void setBook(int numBook){
        this.numBook = numBook;
    }

    /**
     *Method to get CDs given by user
     * 
     * @return number of CDs given by user
     */
    public int getCD(){
        return numCD;
    }

    /**
     *Method that sets CDs given by user
     * 
     * @param numCD integer that stores number CDs
     */
    public void setCD(int numCD){
        this.numCD = numCD;
    }

    /**
     *Method to get DVDs given by user
     * 
     * @return number of DVDs given by user
     */
    public int getDVD(){
        return numDVD;
    }

    /**
     *Method to get Books given by user
     * 
     * @param numDVD integer that stores number DVDs
     */
    public void setDVD(int numDVD){
        this.numDVD = numDVD;
    }

    /**
     *Method to get total products and their total amount
     * 
     * @return total number of orders and their total price
     */
    public int getProductTotal(){
        //If isPremium true only then adds the $10 fee to premium members
        return getBook()*10 + getCD()*15 + getDVD()*20 + (this.isPremium?10:0);
    }

    /**
     *Method to get ID given by user
     * 
     * @return given ID
     */
    public int getID(){
        return ID;
    }
}
