/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BookStore;

/**
 *This class is an interface class
 * @author anurag
 */
public interface BookstoreSpecification {
    /**
     * given a product id and a product quantity, update
     * stock by adding amount to existing product quantity
     * 
     * @param productId Using product ID for restock
     * @param amount Using amount for restock
     * @return restock number
     */
    public int restockProduct (int productId, int amount);
    
    /**
     * calculate and return dollar amount for current inventory of products
     * that is in stock
     * 
     * @return  inventory
     */
    public double inventoryValue();
}
