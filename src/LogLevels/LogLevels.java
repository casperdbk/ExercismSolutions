package LogLevels;

public class LogLevels {

    public static String message(String logLine) {
        return logLine.split("]: ")[1].trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        String fixed = logLine.substring(start+1,end);
        return fixed.toLowerCase();
    }

    public static String reformat(String logLine) {
        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        String level = logLine.substring(start+1,end).toLowerCase();
        String message = logLine.split("]: ")[1].trim();

        String all = String.format("%s (%s)",message,level);
        return all;

    }
}