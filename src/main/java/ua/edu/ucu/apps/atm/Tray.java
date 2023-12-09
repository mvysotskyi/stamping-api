package ua.edu.ucu.apps.atm;

public abstract class Tray {
    private int quintity;
    private Tray next;

    public Tray(int quintity) {
        this.quintity = quintity;
    }

    public void setNext(Tray nextTray) {
        this.next = nextTray;
    }

    public void process(int amount) throws IllegalArgumentException {
        if (next != null) {
            next.process(amount % quintity);
        } else if (amount % quintity > 0) {
            throw new IllegalArgumentException();
        }

        System.out.println(quintity + " * " + amount / quintity);
    }
}
