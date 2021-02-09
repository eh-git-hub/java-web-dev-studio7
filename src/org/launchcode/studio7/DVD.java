package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String name, int capacity, String content, String discType) {
        super(name, capacity, content, discType);
    }

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 00 rpm. \n");
    }

    @Override
    public void readData(boolean status) {
        System.out.println("Data has been read in: " + getName() + " DVD");
        if(status){
            System.out.println("You're playing: " + getName() + "\n");
        } else {
            System.out.println("You had an error: " + getDiscType() + "\n");
        }
    }

    @Override
    public void storeData() {

    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.



}
