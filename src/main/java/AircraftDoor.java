public class AircraftDoor {

    //TODO add fields as necessary

    String id;

    public AircraftDoor(String id) {
        this.id = id;
        //TODO initialise fields as necessary

    }

    public String openDoor(){
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

    void setState(State state) {
        this.state = state;
    }
    //TODO implement methods correctly
    public State getState() {
        return null;
    }
    public State getOpenState(){return null;}
    public State getClosedState(){ return null; }
    public State getLockedState(){ return null; }
    public State getArmedState() { return null; }
    public State getDeployedState() { return null; }

    public String toString() {
        StringBuilder status = new StringBuilder();
        status.append("\nAircraft Door: "+id);
        status.append("\n");
        status.append("State is " + state + "\n");
        return status.toString();
    }


}
