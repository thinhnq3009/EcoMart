

package eco.app.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThinhNQ 
 */
public class DateHeper {
    
    public static SimpleDateFormat formator = new SimpleDateFormat(SaveData.PATTENT);
    
    public static String dateToString(Date date) {
        return formator.format(date);
    }
    
    public static Date plusDate(Date date, int field, int amount) {
        Calendar calendar = Calendar.getInstance();
        
        calendar.setTime(date);
        
        calendar.add(field, amount);
        
        return calendar.getTime();
        
    }
    
    public static Date today() {
        return new Date();
    }
    
    public static String todayString() {
        return dateToString(today());
    }
    
    public static Date stringToDate(String str) throws Exception {
        try {
            return formator.parse(str);
        } catch (ParseException ex) {
            throw new Exception("This string can't convert to Date");
        }
    }
}
