/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eco.app.entity;

import eco.app.dao.CustomerDao;
import eco.app.helper.SaveData;
import java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public class Customer extends Entity {
    
    protected String fullname;
    protected String email;
    protected String phone;
    protected String address;
    protected boolean gender;
    protected int coin;
    protected String note;
    
    protected String rank;
    protected int spent;
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getNote() {
        return note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    
    public String getFullname() {
        return fullname;
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getRank() {
        return rank;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getCoin() {
        return coin;
    }
    
    public void setCoin(int coin) {
        this.coin = coin;
    }
    
    public boolean isGender() {
        return gender;
    }
    
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
    @Override
    public void readResultSet(ResultSet rs) throws Exception {
        /*
         * id
         * fullname
         * gender
         * email
         * phone
         * address
         * coin
         * note
         */
        
        if (rs == null) {
            throw new IllegalAccessException("ResultSet is null");
        }
        
        this.id = rs.getInt("id");
        this.fullname = rs.getNString("fullname");
        this.gender = rs.getBoolean("gender");
        this.email = rs.getNString("email");
        this.phone = rs.getNString("phone");
        this.address = rs.getNString("address");
        this.coin = rs.getInt("coin");
        this.note = rs.getNString("note");
        
        setRank();
        
    }
    
    public void setSpent(int spent) {
        this.spent = spent;
    }
    
    public void setRank() {
        try {
            CustomerDao dao = new CustomerDao();
            dao.getSpent(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (spent < SaveData.RANK_BRONZE) {
            rank = "Bronze";
        } else if (spent < SaveData.RANK_SILVER) {
            rank = "Silver";
        } else if (spent < SaveData.RANK_GOLD) {
            rank = "Gold";
        } else {
            rank = "Diamond";
        }
    }
}
