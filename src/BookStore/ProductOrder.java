/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookStore;

/**
 *Class for product orders
 * 
 * @author anurag
 */
public class ProductOrder {
    private int numBook = 0;
    private int numCD = 0;
    private int numDVD = 0;
    
    /**
     *Method to store product orders
     * 
     * @param numBook integer for Book
     * @param numCD integer for CD
     * @param numDVD integer for DVD
     */
    public ProductOrder(int numBook, int numCD, int numDVD){
     this.numBook = numBook;
     this.numCD = numCD;
     this.numDVD = numDVD;
    }

    /**
     *This method gets number of book in order
     * 
     * @return total number of books in order
     */
    public int getBook(){
        return numBook;
    }

    /**
     *This method sets number of books in order
     * 
     * @param numBook integer to store given number of books
     */
    public void setBook(int numBook){
        this.numBook = numBook;
    }

    /**
     *This method gets number of CDs in order
     * 
     * @return total number of CDs in order
     */
    public int getCD(){
        return numCD;
    }

    /**
     *This method sets number of CDs in order
     * 
     * @param numCD integer stores given number of CDs
     */
    public void setCD(int numCD){
        this.numCD = numCD;
    }

    /**
     *This method gets number of DVDs in order
     * 
     * @return total number of DVDs in order 
     */
    public int getDVD(){
        return numDVD;
    }
    /**
     *This method sets number of CDs in order
     * 
     * @param numDVD integer stores given number of DVDs
     */
    public void setDVD(int numDVD){
        this.numDVD = numDVD;
    }

    /**
     *This method gets the total number of Products
     * 
     * @return total number Products in an order
     */
    public int getProductTotal(){
        return getBook() + getCD() + getDVD();
    }
}
