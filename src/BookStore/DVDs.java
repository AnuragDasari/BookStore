/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookStore;

import java.util.ArrayList;

/**
 *DVDs class is a child class of Product and stores DVDs
 * @author anurag
 */
public class DVDs extends Product {
    private String genre;
    private ArrayList<DVDs> inventory;
    
    /**
     *Constructor
     * @param name DVD name 
     * @param genre DVD genre
     * @param price DVD price
     * @param quantity DVD stock
     */
    public DVDs(String name, String genre, double price, int quantity) {
        super(name, price, quantity);
        this.genre = genre;
        inventory = new ArrayList();
    }

    /**
     *Array list to get DVD inventory
     * @return inventory
     */
    public ArrayList<DVDs> getInventory(){
        return inventory;
    }
    void addInventory(DVDs dvd) {
        inventory.add(dvd);
    }
    
    /**
     *Method to set Genre 
     * @return genre
     */
    public String getGenre() {
        return this.genre;
    }
    
    /**
     *Method to set Genre
     * @param genre Stores genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    /**
     *Display
     */
    @Override
    public void display() {
        System.out.println("Name: " + this.getName() + "\tCategory:  "
                + this.getGenre() + "\tPrice: " + this.getPrice());
        System.out.println("Quantity: " + this.getQuantity());
    }

}
