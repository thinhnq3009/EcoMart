

package eco.app.event;

import eco.app.entity.Product;
import javax.swing.JTextField;

/**
 *
 * @author ThinhNQ 
 */
public interface ProductItemLisener {
    public void onClick(Product product, JTextField quantity);
}
