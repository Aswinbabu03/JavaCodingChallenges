package com.hexaware.view;

import java.util.Scanner;

import com.hexaware.controller.JobController;
import com.hexaware.controller.JobInterface;

public class CareerHubMain {
	public static void main(String args[]) {
		JobInterface jc = new JobController();
		try (Scanner sc = new Scanner(System.in)) {
			String c = null;
			do {
				System.out.println("1.Create JobListing");
				System.out.println("2.Create Company");
				System.out.println("3.Create Applicant");
				System.out.println("4.Create JobApplication");
				System.out.println("5.Details Job");
				System.out.println("6.Details Company");
				System.out.println("7.Details Applicant");
				System.out.println("8.Details JobApplication");
				int choice = sc.nextInt();
				switch (choice) {
				case 1: {
					jc.addJob();
					break;
				}
				case 2: {
					jc.addCompany();
					break;
				}
				case 3: {
					jc.addApplicant();
					break;
				}
				case 4: {
					jc.addJobApplication();
					break;
				}
				case 5: {
			         jc.retrieveJobListing();
			         break;
				}
				case 6: {
			          jc.retrieveCompany();
			          break;
				}
				case 7: {
			          jc.retrieveApplicant();
			          break;
				}   
				case 8: {
			          jc.retrieveJobApplication();
			          break;
				}
				default: {
					System.out.println("Enter the Correct choice. ");
				}
				}
				System.out.println("Do you want to continue? Yes or yes");
				c = sc.next();
			} while (c.equals("Yes") || c.equals("yes"));
		}
		System.out.println("Thank You !!!");
		System.exit(0);

	}
}
