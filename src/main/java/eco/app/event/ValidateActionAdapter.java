package eco.app.event;

import eco.app.swing.TextFieldCustom;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThinhNQ
 */
public class ValidateActionAdapter implements Cloneable {

    private TextFieldCustom parentField;

    public void setParentField(TextFieldCustom parentField) {
        if (this.parentField == null) {
            this.parentField = parentField;
        }
    }

    public TextFieldCustom getParentField() {
        return parentField;
    }

    public ValidateActionAdapter cloneAdapter(TextFieldCustom parentField) {
        try {
            this.parentField = parentField;
            return (ValidateActionAdapter) this.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    public void validAction() {

    }

    public void invalidAction() {

    }
}
