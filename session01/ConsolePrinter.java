public class ConsolePrinter implements DataHandler {

    @Override
    public void handle(SensorReading data) {
        if (data == null) {
            System.err.println("Keine Daten zum Verarbeiten.");
        }

        System.out.println("SensorID: " + data.getSensorId() + " | SequenzID: " + data.getSeq() + " | Temperatur: "
                + data.getTemperatureC() + " Grad Celsius | Luftfeuchtigkeit: " + data.getHumidityPct() + "%");
    }

    @Override
    public void close() {
        System.out.println("Closing ConsolePrinter");
    }
}