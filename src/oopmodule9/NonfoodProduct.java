/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule9;

import com.sun.corba.se.impl.oa.toa.TOA;
import java.util.Arrays;

/**
 *
 * @author Pinnacle F
 */
public class NonfoodProduct extends Product {

    private String[] materialList;

    public NonfoodProduct(String itemName, double itemPrice, String[] materialList) {
        super(itemName, itemPrice);
        this.materialList = materialList.clone();
    }

    public String[] getMaterialList() {
        return materialList;
    }

    public void setMaterialList(String[] materialList) {
        this.materialList = materialList;
    }

    public boolean addToMaterialList(String material) {
        this.materialList = Arrays.copyOf(this.materialList, this.materialList.length + 1);
        this.materialList[this.materialList.length - 1] = material;
        return false;
    }

    public boolean removeFromMaterialList(String material) {
        int foundIndex = -1;
        for (int i = 0; i < this.materialList.length; i++) {
            if (material.toLowerCase() == null ? false : material.toLowerCase().equals(this.materialList[i].toLowerCase())) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            for (int i = foundIndex; i < this.materialList.length; i++) {
                this.materialList[i] = this.materialList[i + 1];
            }
            this.materialList = Arrays.copyOf(this.materialList, this.materialList.length);
        }
        return false;
    }

    public boolean containsMaterial(String material) {
        for (String _material : this.materialList) {
            if (_material.toLowerCase() == null ? false : _material.toLowerCase().equals(material.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String result = this.getItemName() + "%n";
        for (int i = 0; i < this.materialList.length; i++) {
            result = result + "* " + materialList[i] + (i == this.materialList.length - 1 ? "" : "%n");
        }
        return result;
    }

}