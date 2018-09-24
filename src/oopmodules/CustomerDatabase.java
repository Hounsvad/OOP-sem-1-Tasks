/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodules;

/**
 *
 * @author Pinnacle F
 */
public class CustomerDatabase {

    Customer[] customers = new Customer[200];

    public CustomerDatabase() {
    }

    public boolean addCustomer(Customer _customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = _customer;
                return false;
            }
        }
        System.out.println("There were an issue adding the customer to the database");
        return true;
    }

    public boolean removeCustomer(int _id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].id == _id) {
                customers[i] = null;
                return false;
            }
        }
        System.out.println("There were an issue removing the customer from the database");
        return true;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void printCustomerNames() {
        for (Customer customer : customers) {
            if (customer != null) {
                System.out.println(customer.name);
            }
        }
    }

}
