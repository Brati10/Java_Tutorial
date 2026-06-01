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

        SensorReading r1 = new SensorReading(1, "S1", 19.3, 64.2);
        r1.print();
        SensorReading r2 = new SensorReading(2, null, -300.0, -78.0);
        r2.print();
        SensorReading r3 = new SensorReading(3, "S2", 25.0, 1200.3);
        r3.print();
    }
}