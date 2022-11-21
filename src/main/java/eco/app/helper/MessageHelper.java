/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eco.app.helper;

import eco.app.dialog.MessageDialog;
import eco.app.dialog.MessageDialog.MessageType;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class MessageHelper {
    
    public static MessageType showConfirm(JFrame frame, String message) {
        MessageDialog dialog = new MessageDialog(frame);
        dialog.setText(message);
        dialog.setVisible(true);
        return dialog.getMessageType();
    }
    
    public static MessageType showMessage(JFrame frame, String message) {
        MessageDialog dialog = new MessageDialog(frame);
        dialog.setText(message);
        dialog.hidenButton(1, 2);
        dialog.setIcon(new ImageHelper().openImage("message.png"));
        dialog.setVisible(true);
        return dialog.getMessageType();
    }
}
