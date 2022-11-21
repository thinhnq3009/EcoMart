/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eco.app.helper;

import javax.swing.ImageIcon;

/**
 *
 * @author Lenovo
 */
public class ImageHelper {
    public ImageIcon openImage(String uri) {
        return new ImageIcon(getClass().getResource("/eco/app/icon/" + uri));
    }
}
