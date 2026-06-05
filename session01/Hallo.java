import java.util.List;
import java.util.ArrayList;

public class Hallo {

    public static void main(String[] args) {
        SensorReading r1 = new SensorReading(1, "S1", 19.3, 64.2);
        SensorReading r2 = new SensorReading(2, "S2", 21.2, 56.7);
        DataHandler ims = new InMemoryStore();
        DataHandler cp = new ConsolePrinter();

        List<SensorReading> readings = new ArrayList<>();
        readings.add(r1);
        readings.add(r2);
        processAll(readings, ims);
        processAll(readings, cp);
    }

    public static void processAll(List<SensorReading> readings, DataHandler handler) {
        for (SensorReading r : readings) {
            handler.processReading(r);
        }
    }
}