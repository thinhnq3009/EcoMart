

package eco.app.helper;

import eco.app.event.ValidateActionAdapter;
import eco.app.swing.TextFieldCustom;
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
}
