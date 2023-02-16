public class AircraftDoor {

    //TODO add fields as necessary

    String id;
    private State state;

    public AircraftDoor(String id) {
        this.id = id;
        //TODO initialise fields as necessary
        setState(new OpenState());
    }

    public String openDoor() {
        return state.openDoor();
    }

    public String closeDoor() {
        return state.closeDoor();
    }

    public String armDoor() {
        return state.armDoor();
    }

    public String lockDoor() {
        return state.lockDoor();
    }

    //TODO implement methods correctly
    public State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }

    public State getOpenState() {
        return new OpenState();
    }

    public State getClosedState() {
        return new ClosedState();
    }

    public State getLockedState() {
        return new LockedState();
    }

    public State getArmedState() {
        return new ArmedState();
    }

    public State getDeployedState() {
        return new SlideDeployedState();
    }

    public String toString() {
        String status = "\nAircraft Door: " + id +
                "\n" +
                "State is " + state + "\n";
        return status;
    }


}
