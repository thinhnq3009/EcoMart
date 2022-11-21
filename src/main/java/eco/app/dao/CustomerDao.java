package eco.app.dao;

import eco.app.entity.Customer;
import eco.app.entity.Employee;
import eco.app.entity.Entity;
import eco.app.entity.EntityHelper;
import eco.app.helper.DatabaseHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThinhNQ
 */
public class CustomerDao extends EntityDao {

    private List<Customer> readResultSet(ResultSet rs) throws Exception {
        List<Customer> customers = new ArrayList<>();

        while (rs.next()) {
            Customer customer = new Customer();

            customer.readResultSet(rs);

            customers.add(customer);
        }

        return customers;
    }

    @Override
    protected void validate(Entity e) throws Exception {
        if (e == null) {
            throw new Exception("Entity is null");
        }

        if (!(e instanceof Customer)) {
            throw new Exception("Entity is not Customer");
        }
    }

    public List<Customer> getAll() throws Exception {

        String sql = "SELECT * FROM Customer";

        ResultSet rs = DatabaseHelper.excuteQuery(sql);

        return readResultSet(rs);

    }

    public List<Customer> fingById(int id) throws Exception {

        String sql = "SELECT * FROM Customer WHERE id = ?";

        ResultSet rs = DatabaseHelper.excuteQuery(sql, id);

        return readResultSet(rs);

    }

    public List<Customer> findByName(String fullname) throws Exception {

        String sql = "SELECT * FROM Customer WHERE fullname = ?";

        ResultSet rs = DatabaseHelper.excuteQuery(sql, fullname);

        return readResultSet(rs);

    }

    public List<Customer> find(String key) throws Exception {

        String sql = "SELECT * FROM Customer WHERE fullname = ? OR id = ?";

        ResultSet rs = DatabaseHelper.excuteQuery(sql, key, key);

        return readResultSet(rs);

    }

    @Override
    public boolean update(Entity e) throws Exception {

        validate(e);

        String sql = "UPDATE Customer"
                + " SET "
                + " fullname = ?,"
                + " email = ?,"
                + " rank = ?,"
                + " spent = ?,"
                + " coin = ?"
                + " WHERE id = ?";
        Object[] obj = EntityHelper.getData(e,
                "fullname",
                "email",
                "rank",
                "spent",
                "coin",
                "id");
        return DatabaseHelper.excuteUpdate(sql, obj);
    }

    @Override
    public boolean delete(Entity e) throws Exception {

        validate(e);

        String sql = "DELETE FROM Customer WHERE id = ?";
        Object[] obj = EntityHelper.getData(e, "id");
        return DatabaseHelper.excuteUpdate(sql, obj);
    }

    @Override
    public boolean insert(Entity e) throws Exception {

        validate(e);

        String sql = "INSERT INTO Customer (fullname, email, rank, spent, coin) VALUES (?,?,?,?,?)";
        Object[] obj = EntityHelper.getData(e,
                "fullname",
                "email",
                "rank",
                "spent",
                "coin");
        return DatabaseHelper.excuteUpdate(sql, obj);
    }

}
