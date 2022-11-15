package FlightControl.ui;

import java.util.Scanner;

import FlightControl.logic.ManageFlights;

public class UserInterface {
    private Scanner userInput;
    private ManageFlights manageFlights;
    
    public UserInterface(Scanner userInput) {
        // import scanner object to get input from user
        this.userInput = userInput;
        // initialize an instance of FlightControl object
        this.manageFlights = new ManageFlights();
    }

    // this method will initialize user interface 
    public void start() { 
        airportAssetControl();
        flightControl();
    }

    private void airportAssetControl() {
        // ask for input till user input equals "x"
        System.out.println("Airport Asset Control");
        while (true) {
            showAssetControlMenu();
            // get input and place data in string
            String input = this.userInput.nextLine();

            // check if input fulfills required criteria
            if (input.equals("1")) {
                addPlane();
            }
            else if (input.equals("2")) {
                // add a flight
                addFlight();

            }
            else if (input.equals("x")) {
                // exit 
                break;
            }
        }
    }

    private void showAssetControlMenu() {
        System.out.println("Choose an action:");
        System.out.println("[1] Add an airplane");
        System.out.println("[2] Add a flight");
        System.out.println("[x] Exit Airport Asset Control"); 
    }

    private void addPlane() {
        System.out.println("Give the airplane id:");

        // get plane id and store it in string
        String id = this.userInput.nextLine();
        
        System.out.println("Give the airplane capacity:");
        // get plane capacity and store it as integer
        int capacity = Integer.valueOf(this.userInput.nextLine());

        // add plane to the list of planes 
        this.manageFlights.addPlane(id, capacity);
    }

    private void addFlight() {
        System.out.println("Give the airplane id:");

        // get plane id and store it
        String id = this.userInput.nextLine();
        
        System.out.println("Give the departure airport id:");
        // get departure id and store it in string
        String departureId = this.userInput.nextLine();

        System.out.println("Give the target airport id: ");
        // get target id and store it in string
        String targetId = this.userInput.nextLine();

        // add flight to flights list
        this.manageFlights.addFlight(this.manageFlights.findPlane(id), departureId, targetId);
    }

    private void flightControl() {
        // ask for user input till input equals "x"
        System.out.println("Flight Control");
        while(true) {
            showFlightControlMenu();
            // get input and put it in string
            String input = this.userInput.nextLine();

            // check if input fulfills required criteria
            if (input.equals("1")) {
                // use printPlanes() method from ManageFlights to print all planes that are stored on the planes list
                this.manageFlights.printPlanes();
            } 
            else if (input.equals("2")) {
                // use printFlights() method from ManageFlights to print all flights that are stored on the flights list
                this.manageFlights.printFlights();
            }
            else if (input.equals("3")) {
                System.out.println("Give the airplane id:");
                // use findPlane() method from ManageFlights to print details of the plane
                System.out.println(this.manageFlights.findPlane(this.userInput.nextLine()));
            }
            else if (input.equals("x")) {
                break; // finishes the execution of program
            }
        }
    } 

    private void showFlightControlMenu() {
        System.out.println("[1] Print airplanes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print airplane details");
        System.out.println("[x] Quit");
    }
}
