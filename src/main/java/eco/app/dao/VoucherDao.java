
package eco.app.dao;

import eco.app.entity.Entity;
import eco.app.entity.EntityHelper;
import eco.app.entity.Product;
import eco.app.entity.Voucher;
import eco.app.helper.DatabaseHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThinhNQ
 */
public class VoucherDao extends EntityDao {

    private List<Voucher> readResultSet(ResultSet rs) throws Exception {
        List<Voucher> vouchers = new ArrayList<>();

        while (rs.next()) {
            Voucher voucher = new Voucher();

            voucher.readResultSet(rs);

            vouchers.add(voucher);
        }

        return vouchers;
    }

    public List<Voucher> getAll() throws Exception {

        String sql = "SELECT * FROM Voucher";

        ResultSet rs = DatabaseHelper.excuteQuery(sql);

        return readResultSet(rs);

    }

    public List<Voucher> findById(int id) throws Exception {

        String sql = "SELECT * FROM Voucher WHERE id = ?";

        ResultSet rs = DatabaseHelper.excuteQuery(sql, id);

        return readResultSet(rs);

    }

    public List<Voucher> findByCode(String code) throws Exception {

        String sql = "SELECT * FROM Voucher WHERE code = ?";

        ResultSet rs = DatabaseHelper.excuteQuery(sql, code);

        return readResultSet(rs);

    }

    @Override
    public boolean update(Entity e) throws Exception {
        validate(e);

        String sql = "UPDATE Voucher"
                + " SET "
                + " manage_id = ?,"
                + " code = ?,"
                + " max_discount = ?,"
                + " min_apply = ?,"
                + " discount = ?,"
                + " description = ?,"
                + " is_used = ?,"
                + " expiry = ?"
                + " WHERE id = ?";
        Object[] obj = EntityHelper.getData(e,
                "manage_id",
                "code",
                "maxDiscount",
                "minApply",
                "discount",
                "description",
                "isUsed",
                "expiry",
                "id");
        return DatabaseHelper.excuteUpdate(sql, obj);

    }

    @Override
    public boolean delete(Entity e) throws Exception {

        validate(e);

        String sql = "DELETE FROM Voucher WHERE id = ?";
        Object[] obj = EntityHelper.getData(e, "id");
        return DatabaseHelper.excuteUpdate(sql, obj);
    }

    @Override
    public boolean insert(Entity e) throws Exception {

        validate(e);

        String sql = "INSERT INTO Voucher"
                + " (manage_id, code, max_discount, min_apply, discount, description, is_used, expiry)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Object[] obj = EntityHelper.getData(e,
                "manageId",
                "code",
                "maxDiscount",
                "minApply",
                "discount",
                "description",
                "isUsed",
                "expiry");

        return DatabaseHelper.excuteUpdate(sql, obj);
    }

    @Override
    protected void validate(Entity e) throws Exception {
        if (e == null) {
            throw new Exception("Entity is null");
        }

        if (!(e instanceof Voucher)) {
            throw new Exception("Entity is not Voucher");
        }
    }

}
