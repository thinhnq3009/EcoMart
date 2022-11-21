/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eco.app.dao;

import eco.app.entity.Entity;
import eco.app.entity.EntityHelper;
import eco.app.entity.Manage;
import eco.app.helper.DatabaseHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ManageDao extends EntityDao {

    private List<Manage> readResultSet(ResultSet rs) throws Exception {
        List<Manage> manages = new ArrayList<>();

        while (rs.next()) {
            Manage manage = new Manage();

            manage.readResultSet(rs);

            manages.add(manage);
        }

        return manages;
    }

    public List<Manage> getAll() throws Exception {

        String sql = "SELECT * FROM Manage ";

        ResultSet rs = DatabaseHelper.excuteQuery(sql);

        return readResultSet(rs);
    }

    public List<Manage> findById(int id) throws Exception {

        String sql = "SELECT * FROM Manage WHERE id = ?,";

        ResultSet rs = DatabaseHelper.excuteQuery(sql, id);

        return readResultSet(rs);
    }

    @Override

    public boolean update(Entity e) throws Exception {

        validate(e);

        String sql = "UPDATE Manage"
                + " SET "
                + " username = ?,"
                + " password = ?,"
                + " fullname = ?,"
                + " email = ?,"
                + " phone = ?"
                + " WHERE id = ?";

        Object obj = EntityHelper.getData(e,
                "username",
                "password",
                "fullname",
                "email",
                "phone",
                "id");

        return DatabaseHelper.excuteUpdate(sql, obj);
    }

    @Override
    public boolean delete(Entity e) throws Exception {

        validate(e);

        String sql = "DELETE FROM Manage WHERE id = ?";

        Object obj = EntityHelper.getData(e, "id");

        return DatabaseHelper.excuteUpdate(sql, obj);
    }

    @Override
    public boolean insert(Entity e) throws Exception {

        validate(e);

        String sql = "INSERT INTO Manage (username, password, fullname, email, phone) VALUES (?,?,?,?,?)";

        Object[] obj = EntityHelper.getData(e, "username", "password", "fullname", "email", "phone");

        return DatabaseHelper.excuteUpdate(sql, obj);
    }

    @Override
    protected void validate(Entity e) throws Exception {
        if (e == null) {
            throw new Exception("Entity is null");
        }

        if (!(e instanceof Manage)) {
            throw new Exception("Entity is not Manage");
        }
    }

}
