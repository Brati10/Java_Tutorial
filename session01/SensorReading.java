public class SensorReading {

    private int seq;

    private String sensorId;

    private double temperatureC;

    private double humidityPct;

    public SensorReading(int seq, String sensorId, double temperatureC, double humidityPct) {
        this.seq = seq;
        this.sensorId = validateSensorId(sensorId);
        this.temperatureC = validateTemp(temperatureC);
        this.humidityPct = validateHumidity(humidityPct);
    }

    public String print() {
        return "Seq: " + this.seq +" | Sensor-ID: " + this.sensorId + " | Temperatur: " + this.temperatureC + " | Luftfeuchtigkeit: " + this.humidityPct;
    }

    public int getSeq() {
        return this.seq;
    }

    public String getSensorId() {
        return this.sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = validateSensorId(sensorId);
    }

    public double getTemperatureC() {
        return this.temperatureC;
    }

    public void setTemperatureC(double temperatureC) {
        this.temperatureC = validateTemp(temperatureC);
    }

    public double getHumidityPct() {
        return this.humidityPct;
    }

    public void setHumidityPct(double humidityPct) {
        this.humidityPct = validateHumidity(humidityPct);
    }

    private double validateTemp(double temperatureC) {
        if (temperatureC < -273.15) {
            System.err.println("Ungueltige Temperatur: " + temperatureC);
            return -273.15;
        } else {
            return temperatureC;
        }
    }

    private String validateSensorId(String sensorId) {
        if (sensorId == null || sensorId == "") {
            System.err.println("Ungueltige Sensor-ID: null or empty");
            return "unknown";
        } else {
            return sensorId;
        }
    }

    private double validateHumidity(double humidityPct) {
        if (humidityPct < 0.0) {
            System.err.println("Ungueltige Luftfeuchtigkeit: " + humidityPct);
            return 0.0;
        } else if (humidityPct > 100.0) {
            System.err.println("Ungueltige Luftfeuchtigkeit: " + humidityPct);
            return 100.0;
        } else {
            return humidityPct;
        }
    }
}