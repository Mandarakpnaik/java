package com.xworkz.person.external;

import com.xworkz.person.internal.Employee;
import com.xworkz.person.internal.Manager;

public class PersonRunner {
    public static void main(String[] args) {

        Employee employee= new Employee();
        employee.displayPerson();
        employee.displayEmployee();
        Manager manager= new Manager();
        manager.displayManager();
        manager.displayPerson();
    }
}
