package eco.app.helper;

import eco.app.dao.EmployeeDao;
import eco.app.entity.Employee;
import eco.app.entity.Manage;
import eco.app.event.ValidateActionAdapter;
import eco.app.swing.TextFieldCustom;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThinhNQ
 */
public class ShareData {

    // Hành động kiểm tra dữ liệu chung cho các text field
    public static ValidateActionAdapter validateAction = new ValidateActionAdapter() {
        @Override
        public void invalidAction(TextFieldCustom t) {
            t.setBackground(Color.red);
        }

        @Override
        public void validAction(TextFieldCustom t) {
            t.setBackground(Color.WHITE);
        }

    };

    public static Employee USER_LOGIN;
    public static Manage MANAGE_LOGIN;

//    static {
//        try {
//            USER_LOGIN = new EmployeeDao().findById(1).get(0);
//        } catch (Exception ex) {
//            Logger.getLogger(ShareData.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
