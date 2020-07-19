
package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD aCD = new CD(
                "Bob Marley",
                "700mb",
                "Music",
                "CD");

        DVD aDVD = new DVD(
                "Rush Hour",
                "4.7gb",
                "Movie",
                "DVD");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        aDVD.spinDisc();
        aDVD.storeData();
        aDVD.readData();
        aDVD.writeData();

        aCD.spinDisc();
        aCD.storeData();
        aCD.readData();
        aCD.writeData();

    }
}