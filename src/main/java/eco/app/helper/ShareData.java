package eco.app.helper;

import eco.app.entity.Employee;
import eco.app.event.ValidateActionAdapter;
import eco.app.myswing.TextFieldCustom;
import java.awt.Color;

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

//    static {
//        try {
//            USER_LOGIN = new EmployeeDao().findById(1).get(0);
//        } catch (Exception ex) {
//            Logger.getLogger(ShareData.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
