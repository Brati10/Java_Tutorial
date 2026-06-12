import java.io.Writer;
import java.io.FileWriter;

public class CsvWriter implements DataHandler {

    private String filename;
    private Writer fw;

    public CsvWriter(String filename) {
        this.filename = filename;
        try {
            this.fw = new FileWriter(this.filename, true);
        } catch (Exception e) {
            System.err.println("File konnte nicht geoeffnet werden.");
        }
    }
    
    @Override
    public void handle(SensorReading data) {
        try {
            fw.write(data.getSeq() + "," + data.getSensorId() + "," + data.getTemperatureC() + "," + data.getHumidityPct() + "\n");
            fw.flush();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public void close() {
        try {
            this.fw.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
