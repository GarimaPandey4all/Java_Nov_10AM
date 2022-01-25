package com.brainmentors.los.operation;

import java.util.ArrayList;

import com.brainmentors.los.customer.Customer;
import com.brainmentors.los.customer.PersonalInformation;

public interface DB {
	
	public static ArrayList<Customer> getNegativeCustomers()
	{
		ArrayList<Customer> negativeCustomers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setId(1010);
		PersonalInformation pd = new PersonalInformation();
		pd.setFirstName("Tim");
		pd.setLastName("Jackson");
		pd.setPhone("8329649083");
		pd.setPanCard("87324687");
		pd.setVoterId("8732468");
		pd.setEmail("tim@gmail.com");
		customer.setPersonal(pd);
		negativeCustomers.add(customer);
		
		customer = new Customer();
		
		customer.setId(1011);
		pd = new PersonalInformation();
		pd.setFirstName("Tom");
		pd.setLastName("Dahl");
		pd.setPhone("8732467398");
		pd.setPanCard("BW3u5484");
		pd.setVoterId("hl32468");
		pd.setEmail("tom@gmail.com");
		customer.setPersonal(pd);
		negativeCustomers.add(customer);
		
		return negativeCustomers;
	}

}
