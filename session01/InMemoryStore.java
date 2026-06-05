import java.util.ArrayList;
import java.util.List;

public class InMemoryStore implements DataHandler {
    private List<SensorReading> readData = new ArrayList<>();
    @Override
    public String processReading(SensorReading data) {
        if  (data == null) {
            return "Ungueltige Daten";
        }
        readData.add(data);
        printData();
        return "Daten zur Liste hinzugefuegt.";
    }

    private void printData() {
        for (SensorReading r : readData) {
            System.out.println(r.describe());
        }
    }
}
