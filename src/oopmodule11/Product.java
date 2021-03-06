/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule11;

import oopmodule11.*;

/**
 *
 * @author Pinnacle F
 */
public class Product {

    protected static int lastItemID = 0;
    protected int itemID;
    protected final String itemName;
    protected double itemPrice;

    public Product(String itemName, double itemPrice) {
        this.itemID = ++lastItemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        if (itemPrice > 0) {
            this.itemPrice = itemPrice;
        }
    }

    public int getItemID() {
        return itemID;
    }

    /**
     * Retruns itemname 
     * @return itemName as string
     */
    public String getItemName() {
        return itemName;
    }
}
