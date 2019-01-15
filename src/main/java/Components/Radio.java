package Components;

public class Radio extends Component {
    private String station;

    public Radio(String make, String model) {
        super(make, model);
//        this.station = station;
    }

    public void tuneRadio(String station) {
        this.station = station;
    }

    public String getStation() {
        return station;
    }

    public String play(){
        return this.station + " is playing";
    }

}
