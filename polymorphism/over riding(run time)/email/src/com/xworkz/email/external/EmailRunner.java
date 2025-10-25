package com.xworkz.email.external;

import com.xworkz.email.internal.Gmail;

public class EmailRunner {
    public static void main(String [] ref)
    {
        Gmail mail = new Gmail();
        mail.displayProvider("Gmail");
        mail. displayUsers(15000);
        mail.displayServiceId(9087654323l);
        mail.displayUptime(99.9f);
        mail.displayRevenue(455345.7766);
        mail. displayPlan('P');
        mail.displaySecure(true);
    }
}
