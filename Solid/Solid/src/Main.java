public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger("test.txt");

        consoleLogger.log("test");
        fileLogger.log("test");
    }
}