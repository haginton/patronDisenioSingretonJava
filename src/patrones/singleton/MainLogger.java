package patrones.singleton;

public class MainLogger {
    public static void main(String[] args) {
        LoggerClass usuario1 = LoggerClass.getInstance(); // instanciar objeto

        usuario1.writeLogs("Inicio log del objeto usuario1");
        usuario1.writeLogs("final log del objeto usuario1");

        usuario1.showLogs();

        LoggerClass usuario2 = LoggerClass.getInstance();

        usuario2.writeLogs("Inicio log del objeto usuario2");
        usuario2.writeLogs("final log del objeto usuario2");

        usuario2.showLogs();

        System.out.println(usuario1 == usuario2);
    }
}
