package service;

import data.CustomerData;
import model.Customer;
import util.InputUtil;

public class CustomerService {
    public void registerCustomer() {
        int registerCount = InputUtil.inputRequiredInt("How many customer will register: ");
        if (CustomerData.customers == null) {

            CustomerData.customers = new Customer[registerCount];
            for (int i = 0; i < CustomerData.customers.length; i++) {
                System.out.println("--------------------");
                int id = InputUtil.inputRequiredInt("Enter id: ");
                String name = InputUtil.inputRequiredString("Enter name: ");
                int age = InputUtil.inputRequiredInt("Enter age: ");
                int salary = InputUtil.inputRequiredInt("Enter salary: ");
                CustomerData.customers[i] = new Customer(id,name,age,salary);
            }
        } else {
            Customer[] tempCustomers = CustomerData.customers;
            CustomerData.customers = new Customer[CustomerData.customers.length + registerCount];
            for (int i = 0; i < CustomerData.customers.length; i++) {
                if (tempCustomers.length > i) {
                    CustomerData.customers[i] = tempCustomers[i];
                } else {
                    System.out.println("--------------------");
                    int id = InputUtil.inputRequiredInt("Enter id: ");
                    String name = InputUtil.inputRequiredString("Enter name: ");
                    int age = InputUtil.inputRequiredInt("Enter age: ");
                    int salary = InputUtil.inputRequiredInt("Enter salary: ");
                    CustomerData.customers[i] = new Customer(id,name,age,salary);

                }
            }

        }
    }
}
