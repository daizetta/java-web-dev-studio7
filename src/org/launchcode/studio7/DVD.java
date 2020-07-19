package org.launchcode.studio7;

import org.launchcode.studio7.BaseDisc;

public class DVD extends BaseDisc implements OpticalDisc{

    // TODO: Implement your custom interface.
    public DVD(String name, String capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    // TODO: Implement your custom interface.
    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    };

    @Override
    public void storeData(){
        System.out.println("A DVD stores 4.7 gb.");
    };

    @Override
    public void readData(){
        System.out.println("DVDs are read by a laser.");
    };

    @Override
    public void writeData(){
        System.out.println("Analog information is converted into digital information, which is then encoded onto the disc from the inside edge out.");
    };

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
