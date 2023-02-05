package Java_Basics.String;

public class CorruptedData {
    public static String getValue(String dataFromDatabase) {
        dataFromDatabase = dataFromDatabase.substring(dataFromDatabase.indexOf("=") + 1);
        if (dataFromDatabase.indexOf("=") > 0) ;
        dataFromDatabase = dataFromDatabase = dataFromDatabase.toLowerCase();
        return dataFromDatabase;
    }
}