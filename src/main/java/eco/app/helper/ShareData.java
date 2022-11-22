

package eco.app.helper;

import eco.app.event.ValidateActionAdapter;
import java.awt.Color;

/**
 *
 * @author ThinhNQ 
 */
public class ShareData {
    
    // Hành động kiểm tra dữ liệu chung cho các text field
    public static ValidateActionAdapter validateAction = new ValidateActionAdapter() {
        @Override
        public void invalidAction() {
            getParentField().setBackground(Color.red);
        }

        @Override
        public void validAction() {
            getParentField().setBackground(Color.WHITE);
        }
        
    };
}
