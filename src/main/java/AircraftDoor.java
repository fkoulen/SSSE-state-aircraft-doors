public class AircraftDoor {
    private final State openState = new OpenState(this);
    private final State closedState = new ClosedState(this);
    private final State lockedState = new LockedState(this);
    private final State armedState = new ArmedState(this);
    private final State deployedState = new SlideDeployedState();

    String id;
    private State state;

    public AircraftDoor(String id) {
        this.id = id;
        setState(openState);
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

    public State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }

    public State getOpenState() {
        return openState;
    }

    public State getClosedState() {
        return closedState;
    }

    public State getLockedState() {
        return lockedState;
    }

    public State getArmedState() {
        return armedState;
    }

    public State getDeployedState() {
        return deployedState;
    }

    public String toString() {
        String status = "\nAircraft Door: " + id +
                "\n" +
                "State is " + state + "\n";
        return status;
    }


}
