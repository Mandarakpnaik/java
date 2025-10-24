package com.xworkz.organization.external;

import com.xworkz.organization.internal.Departmant;
import com.xworkz.organization.internal.Employee;

public class OrganizationRunner {
    public static void main(String[] args) {
        Departmant departmant = new Departmant();
        departmant.displayDepartmant();
        departmant.displayOrganization();

        Employee employee = new Employee();
        employee.displayEmployee();;
        employee.displayOrganization();
    }
}
