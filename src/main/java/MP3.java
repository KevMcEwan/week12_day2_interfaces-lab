public class MP3 implements IConnect {

    private String name;

    public MP3(String name) {
        this.name = name;
    }

    public String connect(Stereo stereo){
        return "Now connected to " + stereo.getName();
    }

    public String getName() {
        return name;
    }
}
