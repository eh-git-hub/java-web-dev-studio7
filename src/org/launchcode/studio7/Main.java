package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD tupacCD = new CD("All eyez on me", 50, "Rap", "CD");
        DVD avengersDVD = new DVD("Avengers", 50, "Action", "Blu-Ray");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        //avengersDVD.spinDisc();

        tupacCD.readData(true);
        avengersDVD.readData(true);

        System.out.println(avengersDVD.discInfo());

    }
}
