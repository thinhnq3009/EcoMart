package eco.app.helper;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author ThinhNQ
 */
public class NavigationHelper {

    private JButton btnNew;
    private JButton btnInsert;
    private JButton btnUpdate;
    private JButton btnDelete;


    public NavigationHelper() {
    }

    public NavigationHelper(JButton btnNew, JButton btnInsert, JButton btnUpdate, JButton btnDelete) {
        this.btnNew = btnNew;
        this.btnInsert = btnInsert;
        this.btnUpdate = btnUpdate;
        this.btnDelete = btnDelete;
        init();
    }

    private void init() {
        btnNew.setEnabled(true);
        btnInsert.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);

        btnNew.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isCreateMode();
            }
        });
    }

    public void isCreateMode() {
        btnNew.setEnabled(true);
        btnInsert.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }

    public void isEditMode() {
        btnInsert.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }

}
