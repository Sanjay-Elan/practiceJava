import java.io.File;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;

public class LoggerSample {
    private static Logger logger = Logger.getLogger("Logs");

    public static void init() {
        FileHandler fh;

        try {
            fh = new FileHandler("C:/Work/Docs/Logs.log");

            logger.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);

//            logger.info("Logger Init");

        } catch (Exception e) {
            logger.log(Level.WARNING,"Exception :", e);
        }
    }

    public static void main(String args[]) {
        init();
        try {
            int a = 5/1;
        } catch (Exception e) {
            logger.log(Level.WARNING,"Exception :", e);
        }
    }
}