import Components.RecordDeck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {
    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Panasonic", "XYZ123");
    }

    @Test
    public void recordDeckHasMake(){
        assertEquals("Panasonic", recordDeck.getMake());
    }

    @Test
    public void recordDeckHasModel(){
        assertEquals("XYZ123", recordDeck.getModel());
    }

    @Test
    public void recordDeckCanLoadRecord(){
        recordDeck.loadRecord("Sultans of Swing");
        assertEquals("Sultans of Swing", recordDeck.getRecord());
    }

    @Test
    public void recordDeckCanPlayRecord(){
        recordDeck.loadRecord("Sultans of Swing");
        assertEquals("Sultans of Swing", recordDeck.getRecord());
        assertEquals("Sultans of Swing is playing", recordDeck.play());
    }

    @Test
    public void recordDeckCanUnloadRecord(){
        recordDeck.loadRecord("Sultans of Swing");
        assertEquals("Sultans of Swing", recordDeck.getRecord());
        recordDeck.unload();
        assertEquals("", recordDeck.getRecord());
    }

    @Test
    public void recordDeckCanSetPlaySpeed(){
        recordDeck.setPlaySpeed("33 1/3");
        assertEquals("33 1/3", recordDeck.getPlaySpeed());
    }
}
