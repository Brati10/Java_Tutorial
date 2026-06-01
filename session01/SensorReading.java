public class SensorReading {

    public int seq;

    public String sensorId;

    public double temperatureC;

    public double humidityPct;

    public SensorReading(int seq, String sensorId, double temperatureC, double humidityPct) {
        this.seq = seq;

        if (sensorId == null || sensorId == "") {
            System.err.println("Ungueltige Sensor-ID: null or empty");
            this.sensorId = "unknown";
        } else {
            this.sensorId = sensorId;
        }

        if (temperatureC < -273.15) {
            System.err.println("Ungueltige Temperatur: " + temperatureC);
            this.temperatureC = -273.15;
        } else {
            this.temperatureC = temperatureC;
        }

        if (humidityPct < 0.0) {
            System.err.println("Ungueltige Luftfeuchtigkeit: " + humidityPct);
            this.humidityPct = 0.0;
        } else if (humidityPct > 100.0) {
            System.err.println("Ungueltige Luftfeuchtigkeit: " + humidityPct);
            this.humidityPct = 100.0;
        } else {
            this.humidityPct = humidityPct;
        }
    }

    public void print() {
        System.out.println("Seq: " + this.seq);
        System.out.println("Sensor-ID: " + this.sensorId);
        System.out.println("Temperatur: " + this.temperatureC);
        System.out.println("Luftfeuchtigkeit: " + this.humidityPct);
    }
}