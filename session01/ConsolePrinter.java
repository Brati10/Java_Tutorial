public class ConsolePrinter implements DataHandler {
    @Override
    public void handle(SensorReading data) {
        if(data == null) {
            System.err.println("Keine Daten zum Verarbeiten.");
        }

        System.out.println("temp: " + data.getTemperatureC() + "°C, humidity: " + data.getHumidityPct() + "%");
        System.out.println("sensorId: " + data.getSensorId() + ", seq: " + data.getSeq());
    }

    @Override
    public void close() {
        System.out.println("Closing ConsolePrinter");
    }
}