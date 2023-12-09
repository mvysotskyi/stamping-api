import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.atm.Tray;
import ua.edu.ucu.apps.atm.Tray20;
import ua.edu.ucu.apps.atm.Tray5;
import ua.edu.ucu.apps.atm.Tray50;

import org.junit.jupiter.api.Assertions;
public class Tests {
    @Test
    public void testChainATM() {
        Tray tray50 = new Tray50();
        Tray tray20 = new Tray20();
        Tray tray5 = new Tray5();

        tray50.setNext(tray20);
        tray20.setNext(tray5);

        tray50.process(125);
        Assertions.assertThrows(IllegalArgumentException.class,
            () ->  tray50.process(126));
    }
}