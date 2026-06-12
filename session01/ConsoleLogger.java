public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(String name) {
        super(name);
    }

    @Override
    public void writeLog(String message) {
        System.out.println("[" + getName() + "] " + message);
    }
}
