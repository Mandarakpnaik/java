package com.xworkz.computer.external;

import com.xworkz.computer.internal.Desktop;
import com.xworkz.computer.internal.Laptop;

public class ComputerRunner {
    public static void main(String[] args) {
        Desktop desktop =new Desktop();
desktop.displaDesktop();;
desktop.displayComputer();

        Laptop laptop = new Laptop();
        laptop.displayLaptop();
        laptop.displayComputer();
    }
}
