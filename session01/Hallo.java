import java.util.List;
import java.util.ArrayList;

public class Hallo {

    public static void main(String[] args) {
        SensorReading r1 = new SensorReading(1, "S1", 19.3, 64.2);
        SensorReading r2 = new SensorReading(2, "S2", 21.2, 56.7);
        DataHandler cp = new ConsolePrinter();
        DataHandler csv = new CsvWriter("test.csv");

        List<SensorReading> readings = new ArrayList<>();
        readings.add(r1);
        readings.add(r2);
        processAll(readings, cp);
        processAll(readings, csv);

        AbstractLogger a = new ConsoleLogger("CONSOLE");
        a.log("Sensor online");
        a.log(null);
        a.log("Temperatur: 19.3");
        System.out.println(a.getName() + ": " + a.getCount() + " Nachrichten");

        AbstractLogger b = new TimestampLogger("TIMER");
        b.log("Sensor online");
        b.log(null);
        System.out.println(b.getName() + ": " + b.getCount() + " Nachrichten");
    }

    public static void processAll(List<SensorReading> readings, DataHandler handler) {
        for (SensorReading reading : readings) {
            handler.handle(reading);
        }

        handler.close();
    }
}