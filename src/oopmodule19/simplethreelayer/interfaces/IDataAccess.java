/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule19.simplethreelayer.interfaces;

import java.util.List;

/**
 *
 * @author Pinnacle F
 */
public interface IDataAccess {
    public List<String> load();
    
    public void save(List<String> data);
}
