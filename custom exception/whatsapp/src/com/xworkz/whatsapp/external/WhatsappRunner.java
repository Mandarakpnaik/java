package com.xworkz.whatsapp.external;

import com.xworkz.whatsapp.internal.Whatsapp;

public class WhatsappRunner {
    public static void main(String[] args) {
        Whatsapp whatsapp= new Whatsapp();
        whatsapp.checkAge(40);
//        whatsapp.checkAge(10);
        whatsapp.email(".com");
//        whatsapp.email("com");
        whatsapp.nameCheck("Jaanu");
//        whatsapp.nameCheck("jj");

        whatsapp.passwordCheck("Mandara@123");
//        whatsapp.passwordCheck("mandara");
         whatsapp.numberOutOfUsers(7000);
//         whatsapp.numberOutOfUsers(5000);
    }
}
