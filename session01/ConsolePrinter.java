public class ConsolePrinter implements DataHandler {
    @Override
    public String processReading(SensorReading data) {
        if(data == null) {
            return "Keine Daten zum Verarbeiten.";
        }

        System.out.println("temp: " + data.getTemperatureC() + "°C, humidity: " + data.getHumidityPct() + "%");
        System.out.println("sensorId: " + data.getSensorId() + ", seq: " + data.getSeq());
        return "Daten in der Console ausgegeben.";
    }
}