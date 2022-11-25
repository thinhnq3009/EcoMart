/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eco.app.entity;

import java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public class Customer extends Entity {

    
    protected String fullname;
    protected String email;
    protected int rank;
    protected int spent;
    protected int coin;

  

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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSpent() {
        return spent;
    }

    public void setSpent(int spent) {
        this.spent = spent;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    @Override
    public void readResultSet(ResultSet rs) throws Exception {
        /*
         * id
         * fullname
         * email
         * rank
         * spent
         * coin
         */

        if (rs == null) {
            throw new IllegalAccessException("ResultSet is null");
        }

        this.id = rs.getInt("id");
        this.fullname = rs.getString("fullname");
        this.email = rs.getString("email");
        this.rank = rs.getInt("rank");
        this.spent = rs.getInt("spent");
        this.coin = rs.getInt("coin");

    }

}
