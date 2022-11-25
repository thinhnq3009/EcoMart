package eco.app.main;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ThinhNQ
 */
public class NewClass {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
        Date date1 = format.parse("20/11/2022");
        Date date2 = format.parse("21/11/2022");

        System.out.println("1: " + (long)date1.getTime());
        System.out.println("2: " + (long)date2.getTime());

    }
}
