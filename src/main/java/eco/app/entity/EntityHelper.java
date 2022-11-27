/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eco.app.entity;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class EntityHelper {

    /**
     * Trả về Object[] chứa các dữ liệu của các <code>fieldName</code> đã nhân
     * vào
     *
     * @param e
     * @param fieldName
     * @return
     */
    public static Object[] getData(Entity e, String... fieldName) {

        if (fieldName == null || fieldName.length == 0) {
            return null;
        }

        Field[] fields = e.getClass().getDeclaredFields();

        if (fieldName[0].equals("all")) {
            Object value[] = new Object[fields.length + 1];
            value[0] = e.getId();
            int counter = 1;
            for (Field field : fields) {
                try {
                    value[counter] = field.get(e);
                    System.out.println(field.getName() + " " + field.get(e));
                } catch (IllegalAccessException | IllegalArgumentException er) {
                    value[counter] = "Can't get";
                } finally {
                    counter++;
                }
            }

            return value;
        }

        int indexId = Arrays.asList(fieldName).indexOf("id");
        int len = fieldName.length;
//        len += indexId != -1 ? 1 : 0;

        Object[] value = new Object[len];
        int counter = 0;

        //Set ID
        if (indexId != -1) {
            value[indexId] = e.getId();
        }

        for (String name : fieldName) {

            counter += indexId == counter ? 1 : 0;

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

    public static Entity find(List list, int id) {
        for (Object o : list) {
            if (o instanceof Entity e) {
                if (e.getId() == id) {
                    return e;
                }
            }
        }
        return null;
    }

}
