package Components;

public class RecordDeck extends Component{
    private String record;
    private String playSpeed;

    public RecordDeck(String make, String model) {
    super(make, model);
    }

    public String getRecord() {
        return record;
    }

    public String getPlaySpeed() {
        return playSpeed;
    }

    public void loadRecord(String record) {
        this.record = record;
    }

    public void setPlaySpeed(String playSpeed) {
        this.playSpeed = playSpeed;
    }

    public String play(){
        return record + " is playing";
    }

    public void unload(){
        this.record = "";
    }
}
