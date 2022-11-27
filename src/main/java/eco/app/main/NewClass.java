package eco.app.main;

import eco.app.dao.CustomerDao;
import eco.app.entity.Customer;
import eco.app.entity.EntityHelper;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ThinhNQ
 */
public class NewClass {
    
    public static void main(String[] args) throws Exception {
        try {
            CustomerDao dao = new CustomerDao();
            
            List<Customer> list = dao.getAll();
            
            for (Customer c : list) {
                System.out.println(Arrays.toString(EntityHelper.getData(c, "all")));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
