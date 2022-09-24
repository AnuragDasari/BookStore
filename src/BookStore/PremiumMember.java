/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookStore;

import java.util.ArrayList;

/**
 *This class stores Premium members and is a child class of Members
 * @author anurag
 */
public class PremiumMember extends Member{
    private boolean hasPaidDues;
    private ArrayList<PremiumMember> list;
    
    /**
     *Constructor for PremiumMember
     * @param name Name of premium member
     * @param numPurchases total purchases
     * @param hasPaidDues if membership is due or not
     */
    public PremiumMember(String name, int numPurchases, boolean hasPaidDues) {
        super(name, numPurchases);
        this.hasPaidDues = hasPaidDues;
        list = new ArrayList();
    }

    /**
     *Array List for PremiumMembers
     * @return list
     */
    public ArrayList<PremiumMember> getPremiumMember(){
        return list;
    }
    void addList(PremiumMember pMember) {
        list.add(pMember);
    } 

    /**
     *Method to determine if Fee is paid or not
     * @return true or false
     */
    public boolean hasPaidDues() {
        return this.hasPaidDues;
    }
    
    /**
     *Method to set Dues
     * @param hasPaidDues to display true or false
     */
    public void setPaidDues(boolean hasPaidDues) {
        this.hasPaidDues = hasPaidDues;
    }
    
    /**
     *Display
     */
    @Override
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Purchases: " + this.numPurchases);
        System.out.println("Due Amount: " + this.hasPaidDues);
    }
}
