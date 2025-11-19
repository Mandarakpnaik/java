package com.xworkz.reports.external;

import com.xworkz.reports.internal.Reports;

public class ReportsRunner {
    public static void main(String[] args) {
        Reports report=new Reports();
//        report.displayAmmount(78);
        report.displayAmmount(400);
//        report.displayBook(1);
        report.displayBook(8);
//        report.displayqulity(3.45f);
        report.displayqulity(7.6f);
//        report.displayimage(5);
        report.displayimage(10);
//        report.displayPages(30);
        report.displayPages(90);
    }
}
