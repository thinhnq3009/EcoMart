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
public class Convertor {

    public static SimpleDateFormat formator = new SimpleDateFormat(SaveData.PATTENT);
    public static SimpleDateFormat formatorDateTime = new SimpleDateFormat(SaveData.PATTENT_DATETIME);

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

    public static String dateTimeToString(Date date) {
        return formatorDateTime.format(date);
    }

    /**
     * FORMAT STRING
     *
     * @param str 1 chuỗi các số
     * @return
     */
    public static String formatCurrency(String str) {
        return str.replaceAll("(\\d)(?=(\\d{3})+(?!\\d))", "$1.");
    }

    public static String formatCurrency(int c) {
        String str = c + "";
        return str.replaceAll("(\\d)(?=(\\d{3})+(?!\\d))", "$1.");
    }

}
