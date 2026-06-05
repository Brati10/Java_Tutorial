public class Station {
    private String name;
    private String location;

    public Station(String name, String location) {
        this.name = name;
        this.location = location;
    }
    
    public String print() {
        return "Station: " + this.name + " | Standort: " + this.location;
    }
}
