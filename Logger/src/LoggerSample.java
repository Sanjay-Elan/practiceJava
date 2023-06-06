import java.io.File;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;

public class LoggerSample {
    private static Logger logger = Logger.getLogger("Logs");

    static {
        FileHandler fh;

        try {
//            fh = new FileHandler("C:/Work/Docs/Logs.log",true);
              fh = new FileHandler(System.getProperty("user.dir")+System.getProperty("file.separator")+"Logs.log",true);
            logger.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);

            logger.info("Logger Init");

        } catch (Exception e) {
            logger.log(Level.WARNING,"Exception :", e);
        }
    }

    public static void main(String args[]) {
//        init();  // called only if line 10 looks like this "public static void init()"
        try {
            int a = 10/0;
        } catch (Exception e) {
            logger.log(Level.WARNING,"Exception :", e);
        }
    }
}