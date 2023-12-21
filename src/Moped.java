

import java.util.Arrays;
import java.util.Random;

/**
 * A virtual moped, roaming the streets of New York.
 * The signatures of a few methods are given and must be completed and used as indicated.
 * Create as many additional properties or methods as you want, as long as the given methods behave as indicated in the instructions.
 * Follow good object-oriented design, especially the principles of abstraction (i.e. the black box metaphor) and encapsulation (i.e. methods and properties belonging to specific objects), as we have learned them.
 * The rest is up to you.
 */
public class Moped {
    private String orientation; 
    private int gasLevel;
    private int[] location;

    private String dorientation;
    private int drunkgasLevel;
    private int[] dlocation;
    private boolean drunktrue;
    
    private String d2orientation;
    private int drunk2gasLevel;
    private int[] d2location;
    private boolean d2true;

    public Moped(boolean drunktrue){
        this.dorientation = "south";
        this.drunkgasLevel = 100;
        this.dlocation = new int[]{20,8};
        this.drunktrue = true;
    }
    public Moped(boolean d2true,int drunk2gasLevel){
        this.d2orientation = "east";
        this.drunk2gasLevel = 100;
        this.d2location = new int[]{15,3};
        this.d2true = true;
    }
    public Moped(){
        this.orientation = "south";
        this.gasLevel = 100;
        this.location = new int[]{10,5};
    }

    /**
     * Sets the orientation of the moped to a particular cardinal direction.
     * @param orientation A string representing which cardinal direction at which to set the orientation of the moped.  E.g. "north", "south", "east", or "west".
     */
    public void setOrientation(String orientation) {

        if (orientation.equals("north")) {
            this.orientation = "north";
        } else if (orientation.equals("south")) {
            this.orientation = "south";
        } else if (orientation.equals("east")) {
            this.orientation = "east";
        } else if (orientation.equals("west")) {
            this.orientation = "west";
        } else {
            System.out.println("Invalid orientation input: " + orientation);
        }
        System.out.println("Current orientation: " + this.orientation);
    }
    ////#1
    public void setdrunkOrientation(String dorientation){
        if (dorientation.equals("north")) {
            this.dorientation = "north";
        } else if (dorientation.equals("south")) {
            this.dorientation = "south";
        } else if (dorientation.equals("east")) {
            this.dorientation = "east";
        } else if (dorientation.equals("west")) {
            this.dorientation = "west";
        }
    }
    public void setdrunk2Orientation(String d2orientation){
        if (d2orientation.equals("north")) {
            this.d2orientation = "north";
        } else if (d2orientation.equals("south")) {
            this.d2orientation = "south";
        } else if (d2orientation.equals("east")) {
            this.d2orientation = "east";
        } else if (d2orientation.equals("west")) {
            this.d2orientation = "west";
        }
    }

    /**
     * Returns the current orientation of the moped, as a lowercase String.
     * E.g. "north", "south", "east", or "west".
     * @return The current orientation of the moped, as a lowercase String.
     */
    public String getOrientation() {
         
        return this.orientation.toLowerCase(); // placeholder only... delete this!        
    }

    /**
     * Prints the current location, by default exactly following the format:
     *      Now at 12th St. and 5th Ave, facing South.
     *
     * If the current location is associated with location-based advertising, this method should print exactly following format:
     *      Now at 12th St. and 4th Ave, facing West.  Did you know The Strand has 18 Miles of new, used and rare books, and has been in business since 1927?
     * 
     * Note that the suffixes for the numbers must be correct: i.e. the "st" in "1st", "nd" in "2nd", "rd" in "3rd", "th" in "4th", etc, must be correct.
     */
    public void printLocation() {
        String suffix;
        if (this.location[0] % 10 == 1 && this.location[0] != 11) {
            suffix = "st";
        } else if (this.location[0] % 10 == 2 && this.location[0] != 12) {
            suffix = "nd";
        } else if (this.location[0] % 10 == 3 && this.location[0] != 13) {
            suffix = "rd";
        } else {
            suffix = "th";
        }
        String message = "Now at " + this.location[0] + suffix + " St. and " + this.location[1] + "th Ave, facing " + this.orientation + ".";
        if (Arrays.equals(this.location, new int[] {12, 4})) {
            message += " Did you know The Strand has 18 Miles of new, used and rare books, and has been in business since 1927?";
        }
        else if(Arrays.equals(this.location, new int[] {56,3})){
            message += "At Tina's Cuban Cuisine, custoemrs can get 10% off their first online order! You'll get authentic cuban cuisine!";
        }
        else if(Arrays.equals(this.location, new int[]{74,1})){
            message += "Memorial Sloan Kettering is known for its understanding of cancer and development in diagnose and treatment.";
        }
        else if(Arrays.equals(this.location, new int[]{79,8})){
            message+="Don't you want to see some Dinosaurs at the American Museum of Natural History. It present a panorama of the world's cultures.";
        }
        System.out.println(message);
    }

    ///#1
    public void printdlocation(){
        String suffix;
        if (this.dlocation[0] % 10 == 1 && this.dlocation[0] != 11) {
            suffix = "st";
        } else if (this.dlocation[0] % 10 == 2 && this.dlocation[0] != 12) {
            suffix = "nd";
        } else if (this.dlocation[0] % 10 == 3 && this.dlocation[0] != 13) {
            suffix = "rd";
        } else {
            suffix = "th";
        }
        String message = "Drunk Moped#1 is now at " + this.dlocation[0] + suffix + " St. and " + this.dlocation[1] + "th Ave, facing " + this.dorientation + ".";
        System.out.println(message);
    }
    //#2
    public void printd2location(){
        String suffix;
        if (this.d2location[0] % 10 == 1 && this.d2location[0] != 11) {
            suffix = "st";
        } else if (this.d2location[0] % 10 == 2 && this.d2location[0] != 12) {
            suffix = "nd";
        } else if (this.d2location[0] % 10 == 3 && this.d2location[0] != 13) {
            suffix = "rd";
        } else {
            suffix = "th";
        }
        String message = "Drunk Moped#2 is now at " + this.d2location[0] + suffix + " St. and " + this.d2location[1] + "th Ave, facing " + this.d2orientation + ".";
        System.out.println(message);
    }
    

    /**
     * Handles the command, `go left`.
     * Moves the moped one block to the left, and causes the moped to face the appropriate new cardinal direction.
     * Consumes gas with each block moved, and doesn't move or turn unless there is sufficient gas, as according to the instructions.
     * If attempting to drive off the map, the moped will turn but not move a block.  Turns-only consume no gas.
     * This method must not print anything.
     */
    public void goLeft() {
        if(this.gasLevel >= 5 && this.location[0] <= 200 && this.location[1]<= 10){
            if (this.orientation.equals("east")){
                this.orientation = "north";
                if (this.location[0] < 200){
                    this.location[0]++;
                    this.gasLevel-=5;
                }
            }else if(this.orientation.equals("west")){
                this.orientation = "south";
                this.location[0]--;
                this.gasLevel-=5;
            }else if (this.orientation.equals("south")){
                this.orientation = "east";
                if(location[1] > 1){
                    this.location[1]--;
                    this.gasLevel-=5;
                }
            }else if(this.orientation.equals("north")){
                this.orientation = "west";
                if (this.location[1] <10){
                    this.location[1]++;
                    this.gasLevel-=5;
                }
                
            }
        }
        else{
            System.out.println("Oops! Not enough gas is left. Refill.");
        }
    }
    //#1
    public void dleft(){
        if(this.drunkgasLevel<5){
            this.drunkgasLevel = 100;
        }
        if(this.drunkgasLevel >= 5 && this.dlocation[0] <= 200 && this.dlocation[1]<= 10){
            if (this.dorientation.equals("east")){
                this.dorientation = "north";
                if (this.dlocation[0] < 200){
                    this.dlocation[0]++;
                    this.drunkgasLevel-=5;
                }
            }else if(this.dorientation.equals("west")){
                this.dorientation = "south";
                this.dlocation[0]--;
                this.drunkgasLevel-=5;
            }else if (this.dorientation.equals("south")){
                this.dorientation = "east";
                if(dlocation[1] > 1){
                    this.dlocation[1]--;
                    this.drunkgasLevel-=5;
                }
            }else if(this.dorientation.equals("north")){
                this.dorientation = "west";
                if (this.dlocation[1] <10){
                    this.dlocation[1]++;
                    this.drunkgasLevel-=5;
                }
                
            }
        }
    }
    //#2
    public void d2left(){
        if(this.drunk2gasLevel<5){
            this.drunk2gasLevel = 100;
        }
        if(this.drunk2gasLevel >= 5 && this.d2location[0] <= 200 && this.d2location[1]<= 10){
            if (this.d2orientation.equals("east")){
                this.d2orientation = "north";
                if (this.d2location[0] < 200){
                    this.d2location[0]++;
                    this.drunk2gasLevel-=5;
                }
            }else if(this.d2orientation.equals("west")){
                this.d2orientation = "south";
                this.d2location[0]--;
                this.drunk2gasLevel-=5;
            }else if (this.d2orientation.equals("south")){
                this.d2orientation = "east";
                if(d2location[1] > 1){
                    this.d2location[1]--;
                    this.drunk2gasLevel-=5;
                }
            }else if(this.d2orientation.equals("north")){
                this.d2orientation = "west";
                if (this.d2location[1] <10){
                    this.d2location[1]++;
                    this.drunk2gasLevel-=5;
                }
                
            }
        }
    }
    /**
     * Handles the command, `go right`.
     * Moves the moped one block to the right, and causes the moped to face the appropriate new cardinal direction.
     * Consumes gas with each block moved, and doesn't move or turn unless there is sufficient gas, as according to the instructions.
     * If attempting to drive off the map, the moped will turn but not move a block.  Turns-only consume no gas.
     * This method must not print anything.
     */
    public void goRight() {
        if(this.gasLevel >= 5 && this.location[0] <= 200 && this.location[1]<= 10){
            if (this.orientation.equals("east")){
                this.orientation = "south";
                this.location[0]--;
                this.gasLevel-=5;
            }else if(this.orientation.equals("west")){
                this.orientation = "north";
                if (this.location[0] < 200){
                    this.location[0]++;
                    this.gasLevel-=5;
                }
            }else if (this.orientation.equals("south")){
                this.orientation = "west";
                if (this.location[1] <10){
                    this.location[1]++;
                    this.gasLevel-=5;
                }
            }else if(this.orientation.equals("north")){
                this.orientation= "east";
                if(location[1] > 1){
                    this.location[1]--;
                    this.gasLevel-=5;
                }
            }
        }else{
            System.out.println("Oops! Not enough gas is left. Refill.");
        }
        
        }
    //#1
    public void godRight() {
        if(this.drunkgasLevel<5){
            this.drunkgasLevel = 100;
        }
        if(this.drunkgasLevel >= 5 && this.dlocation[0] <= 200 && this.dlocation[1]<= 10){
            if (this.dorientation.equals("east")){
                this.dorientation = "south";
                this.dlocation[0]--;
                this.drunkgasLevel-=5;
            }else if(this.dorientation.equals("west")){
                this.dorientation = "north";
                if (this.dlocation[0] < 200){
                    this.dlocation[0]++;
                    this.drunkgasLevel-=5;
                }
            }else if (this.dorientation.equals("south")){
                this.dorientation = "west";
                if (this.dlocation[1] <10){
                    this.dlocation[1]++;
                    this.drunkgasLevel-=5;
                }
            }else if(this.dorientation.equals("north")){
                this.dorientation= "east";
                if(dlocation[1] > 1){
                    this.dlocation[1]--;
                    this.drunkgasLevel-=5;
                }
            }
        }
    }
    //#2
    public void god2Right() {
        if(this.drunk2gasLevel<5){
            this.drunk2gasLevel = 100;
        }
        if(this.drunk2gasLevel >= 5 && this.d2location[0] <= 200 && this.d2location[1]<= 10){
            if (this.d2orientation.equals("east")){
                this.d2orientation = "south";
                this.d2location[0]--;
                this.drunk2gasLevel-=5;
            }else if(this.d2orientation.equals("west")){
                this.d2orientation = "north";
                if (this.d2location[0] < 200){
                    this.d2location[0]++;
                    this.drunk2gasLevel-=5;
                }
            }else if (this.d2orientation.equals("south")){
                this.d2orientation = "west";
                if (this.d2location[1] <10){
                    this.d2location[1]++;
                    this.drunk2gasLevel-=5;
                }
            }else if(this.d2orientation.equals("north")){
                this.d2orientation= "east";
                if(d2location[1] > 1){
                    this.d2location[1]--;
                    this.drunk2gasLevel-=5;
                }
            }
        }
    }
    /**
     * Handles the command,`straight on`.
     * Moves the moped one block straight ahead.
     * Consumes gas with each block moved, and doesn't move unless there is sufficient gas, as according to the instructions.
     * This method must not print anything.
     */
    public void goStraight() {
        if(this.gasLevel >=5 && this.location[0] <=200 && this.location[1]<=10){
            if(this.orientation.equals("east")){
                if(location[1]>1){
                    this.location[1]--;
                    this.gasLevel-=5;
                }
            }
            else if(this.orientation.equals("west")){
                if (this.location[1]<10){
                    this.location[1]++;
                    this.gasLevel-=5;
                }
            }
            else if(this.orientation.equals("south")){
                this.location[0]--;
                this.gasLevel-=5;
            }
            else if(this.orientation.equals("north")){
                if (location[0]<200){
                    this.location[0]++;
                    this.gasLevel-=5;
                }
                
            }
           
        }
        else{
            System.out.println("Oops! Not enough gas is left. Refill.");}
    }
    //#1
    public void godStraight() {
        if(this.drunkgasLevel<5){
            this.drunkgasLevel = 100;
        }
        if(this.drunkgasLevel >=5 && this.dlocation[0] <=200 && this.dlocation[1]<=10){
            if(this.dorientation.equals("east")){
                if(dlocation[1]>1){
                    this.dlocation[1]--;
                    this.drunkgasLevel-=5;
                }
            }
            else if(this.dorientation.equals("west")){
                if (this.dlocation[1]<10){
                    this.dlocation[1]++;
                    this.drunkgasLevel-=5;
                }
            }
            else if(this.dorientation.equals("south")){
                this.dlocation[0]--;
                this.drunkgasLevel-=5;
            }
            else if(this.dorientation.equals("north")){
                if (dlocation[0]<200){
                    this.dlocation[0]++;
                    this.drunkgasLevel-=5;
                } 
            }
        }
    }
    //#2
    public void god2Straight() {
        if(this.drunk2gasLevel<5){
            this.drunk2gasLevel = 100;
        }
        if(this.drunk2gasLevel >=5 && this.d2location[0] <=200 && this.d2location[1]<=10){
            if(this.d2orientation.equals("east")){
                if(d2location[1]>1){
                    this.d2location[1]--;
                    this.drunk2gasLevel-=5;
                }
            }
            else if(this.d2orientation.equals("west")){
                if (this.d2location[1]<10){
                    this.d2location[1]++;
                    this.drunk2gasLevel-=5;
                }
            }
            else if(this.d2orientation.equals("south")){
                this.d2location[0]--;
                this.drunk2gasLevel-=5;
            }
            else if(this.d2orientation.equals("north")){
                if (d2location[0]<200){
                    this.d2location[0]++;
                    this.drunk2gasLevel-=5;
                } 
            }
        }
    }
    /**
     * Handles the command,`back up`.
     * Moves the moped one block backwards, but does not change the cardinal direction the moped is facing.
     * Consumes gas with each block moved, and doesn't move unless there is sufficient gas, as according to the instructions.
     * This method must not print anything.
     */
    public void goBackwards() {
        if(this.gasLevel >= 5 && this.location[0] <= 200 && this.location[1] <= 10){
            if (this.orientation.equals("east")){
                if (this.location[1]<10){
                    this.location[1]++;
                    this.gasLevel-=5;
                }
            }else if(this.orientation.equals("west")){
                if(location[1] > 1){
                    this.location[1]--;
                    this.gasLevel-=5;
                }
            }else if (this.orientation.equals("south")){
                if (this.location[0] < 200){
                    this.location[0]++;
                    this.gasLevel-=5;
                }
            }else if(this.orientation.equals("north")){
                this.location[0]--;
                this.gasLevel-=5;
            }
        }else{
            System.out.println("Oops! Not enough gas is left. Refill.");
        }
        
        
    }
    //#!
    public void godBackwards() {
        if(this.drunkgasLevel<5){
            this.drunkgasLevel = 100;
        }
        if(this.drunkgasLevel >= 5 && this.dlocation[0] <= 200 && this.dlocation[1] <= 10){
            if (this.dorientation.equals("east")){
                if (this.dlocation[1]<10){
                    this.dlocation[1]++;
                    this.drunkgasLevel-=5;
                }
            }else if(this.dorientation.equals("west")){
                if(dlocation[1] > 1){
                    this.dlocation[1]--;
                    this.drunkgasLevel-=5;
                }
            }else if (this.dorientation.equals("south")){
                if (this.dlocation[0] < 200){
                    this.dlocation[0]++;
                    this.drunkgasLevel-=5;
                }
            }else if(this.dorientation.equals("north")){
                this.dlocation[0]--;
                this.drunkgasLevel-=5;
            }
        }
    }
    //#2
    public void god2Backwards() {
        if(this.drunk2gasLevel<5){
            this.drunk2gasLevel = 100;
        }
        if(this.drunk2gasLevel >= 5 && this.d2location[0] <= 200 && this.d2location[1] <= 10){
            if (this.d2orientation.equals("east")){
                if (this.d2location[1]<10){
                    this.d2location[1]++;
                    this.drunk2gasLevel-=5;
                }
            }else if(this.d2orientation.equals("west")){
                if(d2location[1] > 1){
                    this.d2location[1]--;
                    this.drunk2gasLevel-=5;
                }
            }else if (this.d2orientation.equals("south")){
                if (this.d2location[0] < 200){
                    this.d2location[0]++;
                    this.drunk2gasLevel-=5;
                }
            }else if(this.d2orientation.equals("north")){
                this.d2location[0]--;
                this.drunk2gasLevel-=5;
            }
        }
    }
    public void runMoped1() {
        Random rand = new Random();
        int n = rand.nextInt(4);
        switch(n) {
            case 0:
                dleft();
                break;
            case 1:
                godRight();
                break;
            case 2:
                godBackwards();
                break;
            case 3:
                godStraight();
                break;
        }
    }
    public void runMoped2() {
        Random rand = new Random();
        int n = rand.nextInt(4);
        switch(n) {
            case 0:
                d2left();
                break;
            case 1:
                god2Right();
                break;
            case 2:
                god2Backwards();
                break;
            case 3:
                god2Straight();
                break;
        }
    }

    /**
     * Handles the command,`how we doin'?`.
     * This method must not print anything.
     * @return The current gas level, as an integer from 0 to 100.
     */
    public int getGasLevel() {
        return this.gasLevel; // placeholder only... delete this!
    }

    /**
     * Prints the current gas level, by default exactly following the format:
     *      The gas tank is currently 85% full.
     *
     * If the moped is out of gas, this method should print exactly following format:
     *      We have run out of gas.  Bye bye!
     */
    public void printGasLevel() {
        if (this.gasLevel >= 5) {
            System.out.println("The gas tank is currently " + this.gasLevel +"% full");
        } else if(this.gasLevel == 0){
            System.out.println("We have run out of gas. Bye bye!");
        }
    }

    /**
     * Handles the command, `fill it up`.
     * This method must not print anything.
     * Fills the gas level to the maximum.
     */
    public void fillGas() {
        this.gasLevel = 100;
    }


    /**
     * Handles the command, `park`.
     * This causes the program to quit.  
     * You can use System.exit(0); to cause a program to quit with status code 0, which indicates a normal graceful exit. 
     * (In case you were wondering, status code 1 represents quitting as a result of an error of some kind).
     */
    public void park() {
        System.out.println("You have parked your moped. Goodbye!");
        System.exit(0);
    }

    
    /**
     * Handles the command, `go to Xi'an Famous Foods`
     * Causes the moped to self-drive, block-by-block, to 8th Ave. and 15th St.
     * Consumes gas with each block, and doesn't move unless there is sufficient gas, as according to the instructions.
     */
    public void goToXianFamousFoods(){
        //store everything 
        int[] thelocation = getLocation(); //get the location of the user at the moment
        int street = thelocation[0];
        int avenue = thelocation[1]; 
        int foodst = 15;
        int foodave = 8;
        String theorientation = this.orientation;

        int streetcalculation = 0;
        if (street > foodst){
            streetcalculation = street - foodst;
            this.orientation = "south";
            for (int i =0; i<streetcalculation;i++){
                int[] location = getLocation();
                this.location = location;
                printLocation();
                goStraight();
                int gas = getGasLevel();
                if (gas < 5){
                    fillGas();
                } 
            }
            int avecalculation = 0;
            if (avenue > foodave){
                avecalculation = avenue - foodave;
                this.orientation = "east";
                for (int i =0; i<avecalculation;i++){
                    int[] location = getLocation();
                    this.location = location;
                    printLocation();
                    goStraight();
                    int gas = getGasLevel();
                    if (gas < 5){
                        fillGas();
                    } 
                }
            }
            else if(avenue < foodave){
                avecalculation = foodave - avenue;
                this.orientation = "west";
                for (int i =0; i<avecalculation;i++){
                    int[] location = getLocation();
                    this.location = location;
                    printLocation();
                    goStraight();
                    int gas = getGasLevel();
                    if (gas < 5){
                        fillGas();
                    } 
                }
            }
        }
        else if(street< foodst){
            streetcalculation = foodst - street;
            this.orientation = "north";
            for (int i =0; i<streetcalculation;i++){
                int[] location = getLocation();
                this.location = location;
                printLocation();
                goStraight();
                int gas = getGasLevel();
                if (gas < 5){
                    fillGas();
                } 
            }
            int avecalculation = 0;
            if (avenue > foodave){
                avecalculation = avenue - foodave;
                this.orientation = "east";
                for (int i =0; i<avecalculation;i++){
                    int[] location = getLocation();
                    this.location = location;
                    printLocation();
                    goStraight();
                    int gas = getGasLevel();
                    if (gas < 5){
                        fillGas();
                    } 
                }
            }
            else if(avenue < foodave){
                avecalculation = foodave - avenue;
                this.orientation = "west";
                for (int i =0; i<avecalculation;i++){
                    int[] location = getLocation();
                    this.location = location;
                    printLocation();
                    goStraight();
                    int gas = getGasLevel();
                    if (gas < 5){
                        fillGas();
                    } 
                }
            }
        }
        System.out.println("Now at 15th St. and 8th Ave, facing North. We have reached Xi'an Famous Foods. Enjoy your noodles.");
    }
        

        
            
        
        

        
        


    

    /**
     * Generates a string, containing a list of all the user commands that the program understands.
     * @return String containing commands that the user can type to control the moped.
     */
    public String getHelp() {
        return "List of available commands:\n" +
           "--------------------------\n" +
           "help - displays this help message\n" +
           "print gas - prints the current gas level\n" +
           "add gas <amount> - adds the specified amount of gas to the tank\n" +
           "go <number of blocks> - drives the moped the specified number of blocks\n" +
           "go to Xi'an Famous Foods - self-drives the moped to 8th Ave. and 15th St.\n" +
           "park - exits the program\n";
            // placeholder only... delete this!        
    }

    /**
     * Sets the current location of the moped.
     * @param location an int array containing the new location at which to place the moped, in the order {street, avenue}.
     */
    public void setLocation(int[] location) {
        //System.out.println("Moped is now at street " + this.location[0] + " and avenue " + this.location[1]);
        int currSt = location[0];
        int currAve = location[1];

        this.location[0] = currSt;
        this.location[1] = currAve;
    }

    /**
     * Gets the current location of the moped.
     * @return The current location of the moped, as an int array in the order {street, avenue}.
     */
    public int[] getLocation() {
        // the following two lines are placeholder... delete them and return this moped's correct coordinates.
        int[] location = {this.location[0],this.location[1]};
        return this.location;
    }
    public int[] getdLocation(){
        return this.dlocation;
    }
    public int[] get2dLocation(){
        return this.d2location;
    }
}
