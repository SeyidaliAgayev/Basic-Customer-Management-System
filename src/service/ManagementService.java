package service;

import model.Customer;
import util.MenuUtil;

public class ManagementService {
    public static void customerManagement() {
        CustomerService customerService = new CustomerService();

        while (true) {

          switch (MenuUtil.entryMenu()) {
              case 0:
                  System.out.println("Finish program!");
                  System.exit(-1);
                  break;
              case 1:
                  customerService.registerCustomer();
                  break;
              case 2:
                  break;
              default:
                  System.out.println("Invalid Option!");
          }
        }
    }
}
