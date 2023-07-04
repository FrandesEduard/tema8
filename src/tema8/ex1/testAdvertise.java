package tema8.ex1;

import tema8.ex1.email;
import tema8.ex1.facebook;
import tema8.ex1.print;

public class testAdvertise {
    public static void main(String[] args) {
        facebook facebook = new facebook("Kaufland");
        email email = new email();
        System.out.println(facebook.itemAdvertised("Apa Dorna"));
        System.out.println(email.itemAdvertised("Apa Dorna"));
        print print = new print();
        System.out.println(print.itemAdvertised("Aqua Carpatica"));
        System.out.println(facebook.getRetailerName());


    }
}
