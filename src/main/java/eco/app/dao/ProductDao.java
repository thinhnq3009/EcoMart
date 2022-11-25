package eco.app.dao;

import eco.app.entity.Entity;
import eco.app.entity.EntityHelper;
import eco.app.entity.Product;
import eco.app.helper.DatabaseHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ThinhNQ
 */
public class ProductDao extends EntityDao {

    private List<Product> readResultSet(ResultSet rs) throws Exception {
        List<Product> products = new ArrayList<>();

        while (rs.next()) {
            Product product = new Product();

            product.readResultSet(rs);

            products.add(product);
        }

        return products;
    }

    public List<Product> getAll() throws Exception {

        String sql = "SELECT * FROM Product";

        ResultSet rs = DatabaseHelper.excuteQuery(sql);

        return readResultSet(rs);

    }

    public List<Product> findById(int id) throws Exception {

        String sql = "SELECT * FROM Product WHERE id = ?";

        ResultSet rs = DatabaseHelper.excuteQuery(sql, id);

        return readResultSet(rs);

    }

    public List<Product> findByName(String name) throws Exception {

        String sql = "SELECT * FROM Product WHERE name = ?";

        ResultSet rs = DatabaseHelper.excuteQuery(sql, name);

        return readResultSet(rs);

    }

    public List<Product> findByPrice(double price) throws Exception {

        String sql = "SELECT * FROM Product WHERE price = ?";

        ResultSet rs = DatabaseHelper.excuteQuery(sql, price);

        return readResultSet(rs);

    }

    public List<Product> find(String key) throws Exception {

        String sql = "SELECT * FROM Product WHERE id = ? OR name = ?";

        ResultSet rs = DatabaseHelper.excuteQuery(sql, key, key);

        return readResultSet(rs);

    }

    @Override
    public boolean update(Entity e) throws Exception {
        String sql = "UPDATE Product"
                + " SET "
                + " category_id = ?,"
                + " employee_id = ?,"
                + " brand_id = ?,"
                + " name = ?,"
                + " quantity = ?,"
                + " sold = ?,"
                + " discount = ?,"
                + " time_add = ?,"
                + " expiry = ?"
                + " WHERE id = ?";
        Object[] obj = EntityHelper.getData(e,
                "categoryId",
                "employeeId",
                "brandId",
                "name",
                "quantity",
                "sold",
                "discount",
                "timeAdd",
                "expiry",
                "id");
        return DatabaseHelper.excuteUpdate(sql, obj);
    }

    @Override
    public boolean delete(Entity e) throws Exception {
        String sql = "DELETE FROM Product WHERE id = ?";
        Object[] obj = EntityHelper.getData(e, "id");
        return DatabaseHelper.excuteUpdate(sql, obj);
    }

    @Override
    public boolean insert(Entity e) throws Exception {
        String sql = "INSERT INTO Product"
                + " (category_id, employee_id, brand_id, name, quantity, sold, discount, time_add, expiry,price, image, description, note)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?)";
        Object[] obj = EntityHelper.getData(e,
                "categoryId",
                "employeeId",
                "brandId",
                "name",
                "quantity",
                "sold",
                "discount",
                "timeAdd",
                "expiry",
                "price",
                "image",
                "description",
                "note");
        System.out.println(Arrays.toString(obj));
        return DatabaseHelper.excuteUpdate(sql, obj);
    }

    @Override
    protected void validate(Entity e) throws Exception {
        if (e == null) {
            throw new Exception("Entity is null");
        }

        if (!(e instanceof Product)) {
            throw new Exception("Entity is not Product");
        }
    }

}
