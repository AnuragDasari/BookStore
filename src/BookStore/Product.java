/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookStore;

/**
 *This class is parent class for Books, CDs and DVDs
 * @author anurag
 */
public abstract class Product implements Comparable<Product>{
    private String name;
    private double price;
    private int quantity;
    
    /**
     *Constructor
     * @param name name of product
     * @param price price of product
     * @param quantity total quantity
     */
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        
    }

    /**
     *Method to getName
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *Method to getPrice
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     *Method to get the inventory
     * @return inventory
     */
    public int getQuantity(){
        return quantity;
    }
    
    /**
     *Display
     */
    public abstract void display();{
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
    }
    
    /**
     *CompareTo method for Product class
     * @param o Product
     * @return quantity
     */
    public int compareTo(Product o) {
        int quantity = this.getQuantity();
        int oQuantity = o.getQuantity();
        System.out.println("The total quantity: "+ quantity + " and "
                + oQuantity);
        if(quantity > oQuantity)
            return 1;
        else if(quantity < oQuantity)
            return -1;
        else
            return 0;
    }
}
