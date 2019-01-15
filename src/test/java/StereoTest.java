import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    Stereo stereo;

    @Before
    public void before(){
        stereo = new Stereo("My Stereo");
    }

    @Test
    public void stereoHasName(){
        assertEquals("My Stereo", stereo.getName());
    }

    @Test
    public void stereoHasVolume(){
        assertEquals(50, stereo.getVolume());
    }

    @Test
    public void canSetVolume(){
        stereo.setVolume(75);
        assertEquals(75, stereo.getVolume());
    }

    @Test
    public void cannotSetVolumeBelowZero(){
        stereo.setVolume(-1);
        assertEquals(0, stereo.getVolume());
    }

    @Test
    public void cannotSetVolumeAboveHundred(){
        stereo.setVolume(110);
        assertEquals(100, stereo.getVolume());
    }

    @Test
    public void canTuneRadio(){
        stereo.tuneRadio("Forth One");
        assertEquals("Forth One is playing",  stereo.playRadio());
    }

    @Test
    public void canLoadRecord(){
        stereo.loadRecord("Hungry Like The Wolf");
        assertEquals("Hungry Like The Wolf is playing", stereo.playRecord());
    }

    @Test
    public void canUnloadRecord(){
        stereo.loadRecord("Hungry Like The Wolf");
        assertEquals("Hungry Like The Wolf is playing", stereo.playRecord());
        stereo.unloadRecord();
        assertEquals(" is playing", stereo.playRecord());
    }

    @Test
    public void canStopRadio(){
        stereo.tuneRadio("Forth One");
        assertEquals("Forth One is playing",  stereo.playRadio());
        assertEquals("The music has stopped. A leaden silence descends.", stereo.stopRadio());
    }

    @Test
    public void canStopRecord(){
        stereo.loadRecord("Hungry Like The Wolf");
        assertEquals("Hungry Like The Wolf is playing", stereo.playRecord());
        assertEquals("The music has stopped. A leaden silence descends.", stereo.stopRecord());

    }
}
