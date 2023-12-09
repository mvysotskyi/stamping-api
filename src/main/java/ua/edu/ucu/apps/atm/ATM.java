package ua.edu.ucu.apps.atm;

public class ATM {
    public static void main(String [] args) {
        Tray handler50 = new Tray50();
        Tray handler20 = new Tray20();
        Tray handler5 = new Tray5();

        handler50.setNext(handler20);
        handler20.setNext(handler5);
        handler50.process(125);
        handler50.process(126);
    }
}
