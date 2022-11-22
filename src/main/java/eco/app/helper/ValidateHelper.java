

package eco.app.helper;

import eco.app.swing.TextFieldCustom;

/**
 *
 * @author ThinhNQ 
 */
public class ValidateHelper {
    // Phương thức giúp setValidateaction ngắn gọn hơn
    public static void setValidateAction(TextFieldCustom... fields) {
        for (TextFieldCustom field : fields) {
            field.setValidateAction(ShareData.validateAction.cloneAdapter(field));
        }
        
    }
}
