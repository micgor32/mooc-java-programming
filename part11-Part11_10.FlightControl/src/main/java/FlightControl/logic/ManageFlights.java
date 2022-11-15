package FlightControl.logic;

import java.util.HashMap;
import FlightControl.domain.Flight;
import FlightControl.domain.Plane;
import FlightControl.domain.Place;

public class ManageFlights {
    private HashMap<String, Flight> flights;
    private HashMap<String, Plane> planes;
    private HashMap<String, Place> places;

    public ManageFlights() {
        this.flights = new HashMap<>();
        this.planes = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addPlane(String id, int capacity) {
        this.planes.put(id, new Plane(id, capacity));
    }

    public void addFlight(Plane id, String departureID, String targetID) {
        // add departure and targer id's to the places list
        this.places.put(departureID, new Place(departureID));
        this.places.put(targetID, new Place(targetID));

        // create an instance of Flight object which will be added to flights list later on
        Flight flight = new Flight(id, this.places.get(departureID), this.places.get(targetID));
        this.flights.put(flight.toString(), flight);
    }

    public void printPlanes() {
        for (Plane plane : this.planes.values()) {
            System.out.println(plane);
        }
    }

    public void printFlights() {
        for (Flight flight : this.flights.values()) {
            System.out.println(flight);
        }
    }

    // this method duplicate functionality of printPlaneDetails, so it will be also used in UI FlightControl method to print plane details
    public Plane findPlane(String id) {
        if(this.planes.containsKey(id)) {
            return this.planes.get(id);
        }

        return null;
    }
}
