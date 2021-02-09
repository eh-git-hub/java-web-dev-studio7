package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String name, int capacity, String content, String discType) {
        super(name, capacity, content, discType);
    }

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 00 rpm. \n");
    }

    @Override
    public void readData(boolean status) {
        System.out.println("Data has been read in: " + getName() + " CD");

        if(status){
            System.out.println("You're playing: " + getName() + "\n");
        } else {
            System.out.println("You had an error in: " + getDiscType() + "\n");
        }
    }

    @Override
    public void storeData() {
        System.out.println("Data has been stored");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
