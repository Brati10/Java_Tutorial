public abstract class AbstractLogger {

    private String name;

    private int count;

    public AbstractLogger(String name) {
        this.name = name;
        this.count = 0;
    }

    public abstract void writeLog(String message);

    public void log(String message) {
        if (message == null) {
            System.err.println(this.name + ": null ignoriert");
            return;
        }

        this.count++;
        writeLog(message);
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }
}
