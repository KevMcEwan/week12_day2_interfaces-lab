import Components.Radio;
import Components.RecordDeck;

public class Stereo {
    private String name;
    private Radio radio;
    private RecordDeck recordDeck;
    private int volume;

    public Stereo(String name) {
        this.name = name;
        radio = new Radio("Panasonic", "XYZ123");
        recordDeck = new RecordDeck("Panasonic", "XYZ123");
        this.volume = 50;
    }

    public String getName() {
        return name;
    }

    public Radio getRadio() {
        return radio;
    }

    public RecordDeck getRecordDeck() {
        return recordDeck;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 100) {volume = 100;}
        if (volume < 0) {volume = 0;}
        this.volume = volume;
    }

    public void tuneRadio(String station){
        this.radio.tuneRadio(station);
    }

    public String playRadio(){
        return this.radio.play();
    }

    public void loadRecord(String record){
        this.recordDeck.loadRecord(record);
    }

    public void unloadRecord(){
        this.recordDeck.unload();
    }

    public String playRecord(){
        return this.recordDeck.play();
    }

    public String stopRecord(){
        return this.recordDeck.stop();
    }

    public String stopRadio(){
        return this.radio.stop();
    }
}
