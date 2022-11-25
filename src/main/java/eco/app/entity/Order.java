/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eco.app.entity;

import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Order extends Entity {

    
    protected int employeeId;
    protected int voucherId;
    protected int customerId;
    protected Date timeCreate;

  

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(int voucherId) {
        this.voucherId = voucherId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    @Override
    public void readResultSet(ResultSet rs) throws Exception {
        /*
         * id
         * employee_id
         * voucher_id
         * customer_id
         * time_create
         */
        if (rs == null) {
            throw new IllegalAccessException("ResultSet is null");
        }

        this.id = rs.getInt("id");
        this.employeeId = rs.getInt("employee_id");
        this.voucherId = rs.getInt("voucher_id");
        this.customerId = rs.getInt("customer_id");
        this.timeCreate = rs.getDate("time_create");

    }

}
