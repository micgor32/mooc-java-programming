package FlightControl.domain;

public class Flight {
    private Plane id;
    private Place departureID;
    private Place targetID;

    public Flight(Plane id, Place departure, Place target) {
        this.id = id;
        this.departureID = departure;
        this.targetID = target;
    }

    public Plane getID() {
        return this.id;
    }

    public Place getDepartureID() {
        return this.departureID;
    }

    public Place getTargetID() {
        return this.targetID;
    }

    @Override
    public String toString() {
        return getID() + " (" + getDepartureID() + "-" + getTargetID()+ ")";
    }
}
