import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3Test {

    Stereo stereo;
    MP3 MP3;

    @Before
    public void before(){
        stereo = new Stereo("My Stereo");
        MP3 = new MP3("My MP3");
    }

    @Test
    public void MP3HasName(){
        assertEquals("My MP3", MP3.getName());
    }

    @Test
    public void canConnect(){
        assertEquals("Now connected to My Stereo", MP3.connect(stereo));
    }
}
