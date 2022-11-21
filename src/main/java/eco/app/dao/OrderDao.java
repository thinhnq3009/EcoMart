package eco.app.dao;

import eco.app.entity.Entity;
import eco.app.entity.EntityHelper;
import eco.app.entity.Order;
import eco.app.helper.DatabaseHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThinhNQ
 */
public class OrderDao extends EntityDao {

    private List<Order> readResultSet(ResultSet rs) throws Exception {
        List<Order> orders = new ArrayList<>();

        while (rs.next()) {
            Order order = new Order();

            order.readResultSet(rs);

            orders.add(order);
        }

        return orders;
    }

    @Override
    public boolean update(Entity e) throws Exception {
        /*
         * UPDATE [dbo].[Order]
         * SET [employee_id] = <employee_id, int,>
         * ,[voucher_id] = <voucher_id, int,>
         * ,[customer_id] = <customer_id, int,>
         * ,[time_create] = <time_create, datetime,>
         * WHERE <Search Conditions,,>
         */

        String sql = "UPDATE [dbo].[Order]"
                + " SET "
                + " employee_id = ?,"
                + " voucher_id = ?,"
                + " customer_id = ?,"
                + " time_create = ?"
                + " WHERE id = ?";
        Object[] obj = EntityHelper.getData(e,
                "employeeId",
                "voucherId",
                "customerId",
                "timeCreate",
                "id");

        return DatabaseHelper.excuteUpdate(sql, obj);

    }

    @Override
    public boolean delete(Entity e) throws Exception {
        String sql = "DELETE FROM [dbo].[Order] WHERE id = ?";
        Object[] obj = EntityHelper.getData(e, "id");
        return DatabaseHelper.excuteUpdate(sql, obj);
    }

    @Override
    public boolean insert(Entity e) throws Exception {
        String sql = "INSERT INTO [dbo].[Order] (employee_id, voucher_id, customer_id, time_create) VALUES (?,?,?,?)";
        Object[] obj = EntityHelper.getData(e,
                "employeeId",
                "voucherId",
                "customerId",
                "timeCreate");
        return DatabaseHelper.excuteUpdate(sql, obj);
    }

    @Override
    protected void validate(Entity e) throws Exception {
        if (e == null) {
            throw new Exception("Entity is null");
        }

        if (!(e instanceof Order)) {
            throw new Exception("Entity is not Order");
        }
    }

}
