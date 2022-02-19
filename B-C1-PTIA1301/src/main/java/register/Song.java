package register;

public class Song {
    private String band;
    private String title;
    private double lengthInMinutes;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(double length) {
        this.lengthInMinutes = lengthInMinutes;
    }
}
