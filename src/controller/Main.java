package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

import constants.Constants;
import model.Customer;
import populator.CustomerPopulator;
import populator.CustomerPopulatorImp;

public class Main {

	public static void main(String[] args) {
		CustomerPopulator cp = new CustomerPopulatorImp();
		List<Customer> customerList = new ArrayList<Customer>();
		
        for (Long i = 0L; i < Constants.N_CUSTOMER; i++) {
            Customer c = cp.generateCustomer(i);
            customerList.add(c);
        }
        
        // Sorting list by customer name
        System.out.println("-------- Sorting by name --------");
        Collections.sort(customerList, (Customer c1, Customer c2) -> c1.getName().compareTo(c2.getName()));
        customerList.forEach(customer -> System.out.println(customer));
        
        System.out.println();

        // Sorting list by customer birth date (from oldest to newest)
        System.out.println("-------- Sorting by birth date --------");
        Collections.sort(customerList, (Customer c1, Customer c2) -> c1.getBirthDate().compareTo(c2.getBirthDate()));
        customerList.forEach(customer -> System.out.println(customer));
        System.out.println("---------------------------------------");

        System.out.println();
        
        //Finding customers born after 1995
        System.out.println("-------- Customers born after 1995 --------");
        List<Customer> after1995 = customerList.stream()
        		.filter( c -> c.getBirthDate().after(new GregorianCalendar(1995,0,1).getTime()))
        		.collect(Collectors.toList());
        
        after1995.forEach(customer -> System.out.println(customer));
        System.out.println("-------------------------------------------");
        
	}

}
