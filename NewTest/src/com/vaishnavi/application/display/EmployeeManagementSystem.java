//Vaishnavi Sarode
package com.vaishnavi.application.display;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeManagementSystem {
	
	private ArrayList<Employee> employees;

	public EmployeeManagementSystem() {
		this.employees = new ArrayList<>();
	}
	
	public void displayMenu() {
		System.out.println("Please select the menu option:");
        System.out.println("1 - Accept Employee Details");
        System.out.println("2 - Display top 3 earners");
        System.out.println("3 - Exit");
	}
	
	public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Name of employee: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter the Designation: ");
        String designation = scanner.nextLine();
        
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        
        employees.add(new Employee(name, designation, salary));
    }
	
	public void displayTopEarners() {
		
        ArrayList<Employee> sortedEmployees = new ArrayList<>(employees);
        Collections.sort(sortedEmployees, new Comparator<Employee>() {
            
        	@Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o2.getSalary(), o1.getSalary());
            }
        });
        
        System.out.println("Top 3 earners in the department are:");
        for (int i = 0; i < 3 && i < sortedEmployees.size(); i++) {
            Employee employee = sortedEmployees.get(i);
            System.out.println(employee.getName() + " " + employee.getDesignation() + " " + employee.getSalary());
        }
    }
	
	public static void main(String[] args) {
		
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            system.displayMenu();
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    system.acceptDetails();
                    break;
                case 2:
                    system.displayTopEarners();
                    break;
                case 3:
                    System.out.println("--Application will exit--");
                    return;
                default:
                    System.out.println("Invalid option selected. Please try again.");
                    break;
            }
        }
    }
	

}
