public interface DataHandler {
    void handle(SensorReading data);
    void close();
}
