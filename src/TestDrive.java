

import java.util.Scanner;

public class TestDrive {

  /**
   * The main function is automatically called first in a Java program.
   * It should instantiate a Moped and contain the main logic of the program, following the instructions.
   * 
   * @param args An array of any command-line arguments.
   */
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    Moped m = new Moped();
    Moped d = new Moped(true);
    Moped d2 = new Moped(true,100);
    // solution
    System.out.println("Thanks for jumping on the moped.  We're currently parked outside Dr. Rossinsky DDS's office at 10th St. and 5th Ave, facing South.  May I say your teeth look very clean.");
    System.out.println("What would you like to do?  At any time, say \"help\" for assistance.");
    
    String response = "";
    
    while (!response.equals("park")) {
      response = scn.nextLine();
        switch (response) {
            case "go left":
                m.goLeft();
                m.printLocation();
                d.runMoped1();
                d.printdlocation();
                d2.runMoped2();
                d2.printd2location();
                if(d2.getdLocation()==(m.getLocation())||(d.getdLocation()==(m.getLocation()))){
                    System.out.print("Moped crashed into your moped. Game over.");
                    System.exit(0);
                }
                //drunkMoped1.rundrunk1();
               // drunkMoped1.printLocationdrunk();
                break;
            case "go right":
                m.goRight();
                m.printLocation();
                d.runMoped1();
                d.printdlocation();
                d2.runMoped2();
                d2.printd2location();
                if(d2.getdLocation()==(m.getLocation())||(d.getdLocation()==(m.getLocation()))){
                    System.out.print("Moped crashed into your moped. Game over.");
                    System.exit(0);
                }

                //drunkMoped1.printLocationdrunk();
                break;
            case "straight on":
                m.goStraight();
                m.printLocation();
                d.runMoped1();
                d.printdlocation();
                d2.runMoped2();
                d2.printd2location();
                if(d2.getdLocation()==(m.getLocation())||(d.getdLocation()==(m.getLocation()))){
                    System.out.print("Moped crashed into your moped. Game over.");
                    System.exit(0);
                }
               // drunkMoped1.printLocationdrunk();
                break;
            case "back up":
                m.goBackwards();
                m.printLocation();
                d.runMoped1();
                d.printdlocation();
                d2.runMoped2();
                d2.printd2location();
                if(d2.getdLocation()==(m.getLocation())||(d.getdLocation()==(m.getLocation()))){
                    System.out.print("Moped crashed into your moped. Game over.");
                    System.exit(0);
                }
               // drunkMoped1.printLocationdrunk();
                break;
            case "fill it up":
                m.fillGas();
                break;
            case "how we doin?":
                m.printGasLevel();
                break;
            case "park":
                m.park();
                break;
            case "help":
                String[] help = new String[]{"`go left`",
                "`go right`",
                "`straight on`",
                "`back up`",
                "`how we doin'?`",
                "`fill it up`",
                "`park`",
                "`go to Xi'an Famous Foods`",
                "`help`"};
                for(String i:help){
                    System.out.print(i);
                    System.out.print('\n');
                }
                break;
            case "go to Xi'an Famous Foods":
                m.goToXianFamousFoods();
                d.runMoped1();
                d.printdlocation();
                d2.runMoped2();
                d2.printd2location();
                if(d2.getdLocation()==(m.getLocation())||(d.getdLocation()==(m.getLocation()))){
                    System.out.print("Moped crashed into your moped. Game over.");
                    System.exit(0);
                }
                
                break;
            default:
                System.out.println("I'm sorry, I don't understand that command. Type 'help' for a list of commands");
        }      
    }
    
    
    
}
}
    
  