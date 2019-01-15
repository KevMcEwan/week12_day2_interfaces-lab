import Components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Panasonic", "XB123");
    }

    @Test
    public void radioHasMake() {
        assertEquals("Panasonic", radio.getMake());
    }

    @Test
    public void radioHasModel() {
        assertEquals("XB123", radio.getModel());
    }

    @Test
    public void radioCanBeTuned() {
        radio.tuneRadio("Radio One");
        assertEquals("Radio One", radio.getStation());
    }

    @Test
    public void radioCanPlay() {
        radio.tuneRadio("Radio One");
        assertEquals("Radio One", radio.getStation());
        assertEquals("Radio One is playing", radio.play());
    }

    @Test
    public void radioCanStop() {
    radio.tuneRadio("Radio One");
    assertEquals("Radio One",radio.getStation());
    assertEquals("Radio One is playing",radio.play());
    assertEquals("The music has stopped. A leaden silence descends.", radio.stop());
    }

}
