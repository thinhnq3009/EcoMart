
package eco.app.dao;

import eco.app.entity.Category;
import eco.app.entity.Entity;
import eco.app.entity.EntityHelper;
import eco.app.helper.DatabaseHelper;

/**
 *
 * @author ThinhNQ
 */
public class CategoryDao extends EntityDao {

    @Override
    protected void validate(Entity e) throws Exception {
        if (e == null) {
            throw new Exception("Entity is null");
        }
        if (!(e instanceof Category)) {
            throw new Exception("Entity is not Category");
        }
    }

    @Override
    public boolean update(Entity e) throws Exception {

        validate(e);

        String sql = "UPDATE [dbo].[Category]"
                + " SET "
                + " name = ?,"
                + " image = ?"
                + " WHERE id = ?";
        Object[] obj = EntityHelper.getData(e,
                "name",
                "image",
                "id");
        return DatabaseHelper.excuteUpdate(sql, obj);

    }

    @Override
    public boolean delete(Entity e) throws Exception {
        validate(e);
        String sql = "DELETE FROM [dbo].[Category] WHERE id = ?";
        Object[] obj = EntityHelper.getData(e, "id");
        return DatabaseHelper.excuteUpdate(sql, obj);
    }

    @Override
    public boolean insert(Entity e) throws Exception {
        validate(e);
        String sql = "INSERT INTO [dbo].[Category] (name, image)"
                + " VALUES (?,?)";
        Object[] obj = EntityHelper.getData(e,
                "name",
                "image");
        return DatabaseHelper.excuteUpdate(sql, obj);
    }

}
