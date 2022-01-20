package com.brainmentors.los.operation;

import com.brainmentors.los.customer.Customer;
import com.brainmentors.los.customer.LoanDetails;
import com.brainmentors.los.customer.PersonalInformation;
import com.brainmentors.los.utils.StageConstants;
import com.brainmentors.los.utils.Utility;

import static com.brainmentors.los.utils.Utility.scanner;
import static com.brainmentors.los.utils.Utility.serialCounter;

import java.util.ArrayList;

public class LOSProcess implements StageConstants{
	
	//private Customer customers[] = new Customer[100];
	
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public void sourcing()
	{
		Customer customer = new Customer();
		customer.setId(serialCounter);
		customer.setStage(SOURCING);
		
		System.out.println("Enter the First Name");
		String firstName = scanner.next();
		System.out.println("Enter the Last Name");
		String lastName = scanner.next();
		System.out.println("Enter your Age");
		int age = scanner.nextInt();
		System.out.println("Enter the Loan Type HL, PL, AL");
		String type = scanner.next();
		System.out.println("Enter the Amount");
		double amount = scanner.nextDouble();
		System.out.println("Duration of a Loan");
		int duration = scanner.nextInt();
		
		PersonalInformation pd = new PersonalInformation();
		pd.setFirstName(firstName);
		pd.setLastName(lastName);
		pd.setAge(age);
		customer.setPersonal(pd);
		
		LoanDetails loanDetails = new LoanDetails();
		loanDetails.setAmount(amount);
		loanDetails.setDuration(duration);
		loanDetails.setType(type);
		customer.setLoanDetails(loanDetails);
		
		customers.add(customer);
		
		serialCounter++;
		
		System.out.println("Sourcing Done...");
	}
	
	public void checkStage(int applicationNumber)
	{
		boolean isStageFound = false;
		
		if(customers != null && customers.size() > 0)
		{
			for(Customer customer : customers)
			{
				if(customer.getId() == applicationNumber)
				{
					System.out.println("You are on "+Utility.getStageName(customer.getStage()));
					isStageFound = true;
					break;
				}
			}
		}
		
		if(!isStageFound) {
			System.out.println("Invalid Application Number");
		}
	}

}
