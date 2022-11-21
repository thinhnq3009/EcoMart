/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package eco.app.dao;

import eco.app.entity.Entity;
import eco.app.entity.Manage;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public abstract class EntityDao {
    
    protected abstract void validate(Entity e) throws Exception;

    public abstract boolean update(Entity e) throws Exception;

    public abstract boolean delete(Entity e) throws Exception;

    public abstract boolean insert(Entity e) throws Exception;

}
