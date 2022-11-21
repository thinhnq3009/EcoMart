/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eco.app.entity;

import eco.app.dao.ManageDao;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class EntityHelper {

    /**
     * Trả về Object[] chứa các dữ liệu của các <code>fieldName</code> đã nhân vào
     * @param e
     * @param fieldName
     * @return
     */
    public static Object[] getData(Entity e, String... fieldName) {

        if (fieldName == null || fieldName.length == 0) {
            return null;
        }

        Object[] value = new Object[fieldName.length];
        int counter = 0;

        Field[] fields = e.getClass().getDeclaredFields();

        for (String name : fieldName) {
            for (Field field : fields) {
                if (field.getName().equals(name)) {
                    try {
                        value[counter] = field.get(e);
                    } catch (IllegalAccessException | IllegalArgumentException er) {
                        value[counter] = "Can't get";
                    } finally {
                        counter++;
                    }
                    break;
                }

            }
        }

        return value;
    }


}
