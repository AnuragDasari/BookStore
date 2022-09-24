/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookStore;

import java.util.ArrayList;

/**
 *Books class is a child class of Product and stores books
 * @author anurag
 */
public class Books extends Product{
    private String author;
    private ArrayList<Books> inventory;
    
    /**
     *Constructor
     * @param name name of the book
     * @param author author of the book
     * @param price price of the book
     * @param quantity stock of the book
     */
    public Books(String name, String author, double price, int quantity) {
        super(name, price, quantity);
        this.author = author;
        inventory = new ArrayList();
    }

    /**
     *Array list for inventory
     * @return inventory
     */
    public ArrayList<Books> getInventory(){
        return inventory;
    }
    void addInventory(Books books) {
        inventory.add(books);
    }
    
    /**
     *Method for Author
     * @return author
     */
    public String getAuthor() {
        return this.author;
    }
    
    /**
     *Method to set Author
     * @param author stores author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *Display
     */
    @Override
    public void display() {
        System.out.println("Name: " + this.getName() + "\tAuthor:  "
                + this.getAuthor() + "\tPrice: $" + this.getPrice());
        System.out.println("Quantity: " + this.getQuantity());
    }
}
