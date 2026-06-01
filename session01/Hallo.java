public class Hallo {
    public static void main(String[] args) {
        System.out.println("Hallo, Java!");
        int zahl = 42;
        System.out.println("Die Zahl ist: " + zahl);
        double temp = 19.3;
        System.out.println("Die Temperatur ist: " + temp);
        System.err.println("Dies ist eine Fehlermeldung.");
        char buchstabe = 'A';
        System.out.println("Der Buchstabe ist: " + buchstabe);
        String text = "Java ist " + buchstabe + " Plus!";
        System.out.println(text);

        SensorReading r1 = new SensorReading(1, "2024-06-01T12:00:00Z", 19.3, 64.2);
        System.out.println("Temperatur: " + r1.temperature);
        SensorReading r2 = new SensorReading(1, "2024-06-01T12:05:00Z", -300.0, 64.2);
        System.out.println("Temperatur: " + r2.temperature);
    }
}