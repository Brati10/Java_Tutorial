public class SensorReading {
    public int sensorId;
    public String timestamp;
    public float temperature;
    public float humidity;

    public SensorReading(int sensorId, String timestamp, float temperature, float humidity) {
        this.sensorId = sensorId;
        this.timestamp = timestamp;
        if (temperature < -273.15) {
            System.err.println("Ungueltige Temperatur: " + temperature);
            this.temperature = -273.15;
        } else {
            this.temperature = temperature;
        }
        this.humidity = humidity;
    }
}