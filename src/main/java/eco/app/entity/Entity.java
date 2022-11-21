/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package eco.app.entity;

import java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public interface Entity {
    public void readResultSet(ResultSet rs) throws Exception;
}
