public class AircraftDoor {

    //TODO add fields as necessary

    String id;
    private State state;

    public AircraftDoor(String id) {
        this.id = id;
        //TODO initialise fields as necessary

    }

    public String openDoor() {
        return null;
    }

    public String closeDoor() {
        return null;
    }

    public String armDoor() {
        return null;
    }

    public String lockDoor() {
        return null;
    }

    //TODO implement methods correctly
    public State getState() {
        return null;
    }

    void setState(State state) {
        this.state = state;
    }

    public State getOpenState() {
        return null;
    }

    public State getClosedState() {
        return null;
    }

    public State getLockedState() {
        return null;
    }

    public State getArmedState() {
        return null;
    }

    public State getDeployedState() {
        return null;
    }

    public String toString() {
        String status = "\nAircraft Door: " + id +
                "\n" +
                "State is " + state + "\n";
        return status;
    }


}
