/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookStore;

import java.util.ArrayList;

/**
 *This class is to store Members and is a parent class for Premium members
 * @author anurag
 */
public class Member {
    String name;
    int numPurchases;
    private ArrayList<Member> list;
    
    /**
     *Constructor for Member
     * @param name Name of the member
     * @param numPurchases total purchases done by member
     */
    public Member(String name, int numPurchases) {
        this.name = name;
        this.numPurchases = numPurchases;
        list = new ArrayList();
    }

    /**
     *Array list for MemberList
     * @return list
     */
    public ArrayList<Member> getList(){
        return list;
    }
    void addList(Member member) {
        list.add(member);
    }
    
    /**
     *Method to get Name
     * @return name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     *Method to set Name
     * @param name to store name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     *Method to get total purchases of a member
     * @return total purchases
     */
    public int getNumPurchases() {
        return this.numPurchases;
    }
    
    /**
     *Method to set the total number
     * @param numPurchases to store total purchases
     */
    public void setNumPurchases(int numPurchases) {
        this.numPurchases = numPurchases;
    }

    /**
     *Display
     */
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Number of Purchases: " + this.numPurchases);
    }
}
