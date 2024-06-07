package patrones.singleton;

import java.util.ArrayList;
import java.util.List;

public class LoggerClass {
    private static LoggerClass instance;
    private List<String> logs;
    //private String[] arrayString = new String[10];

    private LoggerClass(){
        logs = new ArrayList<>();
    }

    public static LoggerClass getInstance(){
        if (instance == null){
            instance = new LoggerClass();
        }
        return instance;
    }

    public void writeLogs(String message){
        logs.add(message);
    }

    public void showLogs(){
        /*for (int i = 0; i < logs.size(); i++) {
            System.out.println(logs.get(i));
        }*/
        for (String log : logs){
            System.out.println(log);
        }
    }
}
