/**
 * The super class for all buildings
 * This class can be used on its own, but is built with the primary purpose of being extended by other classes
 */
public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    /**
     * The constructor method for the building class. sets the following values and prints flavor text to the console
     * @param name a string of the name of the building
     * @param address a string that contains the address of the building
     * @param nFloors an int of how many floors the building has
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * An accessor for the building's name
     * @return returns the string of the building's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * An accessor for the building's address
     * @return returns the string of the building's address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * An accessor for the building's number of floors
     * @return returns the int of the building's total floors
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Overloads toString to return the building's name, address, and number of floors in a nicely formatted string
     * @return the string containing the above information
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
