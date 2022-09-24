/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookStore;

import java.util.ArrayList;

/**
 *CDs class is a child class of Product and stores CDs
 * @author anurag
 */
public class CDs extends Product{
    private String artist;
    private ArrayList<CDs> inventory;
    
    /**
     *Constructor
     * @param name Name of the CD
     * @param artist Name of the Artist
     * @param price Price of the CD
     * @param quantity Stock
     */
    public CDs(String name, String artist, double price, int quantity) {
        super(name, price, quantity);
        this.artist = artist;
        inventory = new ArrayList();
    }

    /**
     *Array list to get Inventory
     * @return
     */
    public ArrayList<CDs> getInventory(){
        return inventory;
    }
    void addInventory(CDs cd) {
        inventory.add(cd);
    }

    /**
     *Method to get Artist
     * @return artist
     */
    public String getArtist() {
        return this.artist;
    }
    
    /**
     *Method to set Artist
     * @param artist to store Artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     *Display
     */
    @Override
    public void display() {
        System.out.println("Name: " + this.getName() + "\tArtist:  "
                + this.getArtist() + "\tPrice: " + this.getPrice());
        System.out.println("Quantity: " + this.getQuantity());
    }
}
