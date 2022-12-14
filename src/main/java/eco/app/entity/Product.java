/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eco.app.entity;

import eco.app.dao.BrandDao;
import eco.app.dao.CategoryDao;
import eco.app.helper.ShareData;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Product extends Entity {

    protected int categoryId;
    protected int employeeId;
    protected int brandId;
    protected String name;
    protected byte[] image;
    protected int price;
    protected int quantity;
    protected int sold;
    protected double discount;
    protected Date timeAdd;
    protected Date expiry;
    protected String description;
    protected String discountText;
    protected String note;

    public Category getCategory() {
        return (Category) EntityHelper.find(ShareData.CATEGORIES, categoryId);

    }

    public Brand getBrand() {
        return (Brand) EntityHelper.find(ShareData.BRANDS, brandId);

    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
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
        return (int) (discount < 1 ? discount * price : discount);
    }

    public void setDiscount(double discount) {
        this.discount = discount;

        if (discount < 1) {
            setDiscountText((discount * 100) + "%");
        } else {
            setDiscountText(discount + "");
        }

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public void setDiscountText(String discountText) {
        this.discountText = discountText;
    }

    public String getDiscountText() {
        return discountText;
    }

    @Override
    public void readResultSet(ResultSet rs) throws Exception {

        /*
         * id
         * categoryId
         * employee_id
         * brandId
         * name
         * image
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
        this.employeeId = rs.getInt("employee_id");
        this.brandId = rs.getInt("brand_id");
        this.image = rs.getBytes("image");
        this.name = rs.getString("name");
        this.price = rs.getInt("price");
        this.quantity = rs.getInt("quantity");
        this.sold = rs.getInt("sold");
        setDiscount(rs.getDouble("discount"));
        this.timeAdd = rs.getDate("time_add");
        this.expiry = rs.getDate("expiry");
        this.description = rs.getNString("description");

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Product product) {
            return product.getId() == this.getId();
        }
        return super.equals(obj);

    }

    public static class BillItem {

        private Product product;
        private int quantity;

        public BillItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public int getTotal() {
            return getProduct().getPrice() * getQuantity();
        }

        public void append(int quantity) {
            this.setQuantity(this.getQuantity() + quantity);
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}
