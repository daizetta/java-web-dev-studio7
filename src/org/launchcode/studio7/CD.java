package org.launchcode.studio7;

import org.launchcode.studio7.BaseDisc;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String name, String capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    // TODO: Implement your custom interface.
    @Override
    public void spinDisc(){
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    };

    @Override
    public void storeData(){
        System.out.println("A CD can store 700mb of data.");
    };

    @Override
    public void readData(){
        System.out.println("CD is read by laser.");
    };

    @Override
    public void writeData(){
        System.out.println("Data is written on grooves encoded on spiral tracks.");
    };

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}