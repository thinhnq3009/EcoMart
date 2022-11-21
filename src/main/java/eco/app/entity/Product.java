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
public class Product implements Entity {

    protected int id;
    protected int categoryId;
    protected int manageId;
    protected int brandId;
    protected String name;
    protected byte image;
    protected int quantity;
    protected int sold;
    protected double discount;
    protected Date timeAdd;
    protected Date expiry;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getManageId() {
        return manageId;
    }

    public void setManageId(int manageId) {
        this.manageId = manageId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getImage() {
        return image;
    }

    public void setImage(byte image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Date getTimeAdd() {
        return timeAdd;
    }

    public void setTimeAdd(Date timeAdd) {
        this.timeAdd = timeAdd;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    @Override
    public void readResultSet(ResultSet rs) throws Exception {

        /*
         * id
         * categoryId
         * employee_id
         * brandId
         * name
         * quantity
         * sold
         * discount
         * timeAdd
         * expiry
         */
        if (rs == null) {
            throw new IllegalArgumentException("ResultSet is null");
        }

        this.id = rs.getInt("id");
        this.categoryId = rs.getInt("category_id");
        this.manageId = rs.getInt("employee_id");
        this.brandId = rs.getInt("brand_id");
        this.name = rs.getString("name");
        this.quantity = rs.getInt("quantity");
        this.sold = rs.getInt("sold");
        this.discount = rs.getDouble("discount");
        this.timeAdd = rs.getDate("time_add");
        this.expiry = rs.getDate("expiry");

    }

}
