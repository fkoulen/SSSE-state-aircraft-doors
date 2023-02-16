public class LockedState implements State {
    @Override
    public String lockDoor() {
        return null;
    }

    @Override
    public String closeDoor() {
        return null;
    }

    @Override
    public String openDoor() {
        return null;
    }

    @Override
    public String armDoor() {
        return null;
    }

    @Override
    public String toString() {
        return Messages.LOCKED_STATE_MESSAGE;
    }
}
