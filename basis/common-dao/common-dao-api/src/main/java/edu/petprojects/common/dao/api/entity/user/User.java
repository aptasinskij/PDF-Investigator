package edu.petprojects.common.dao.api.entity.user;

import edu.petprojects.common.dao.api.entity.BaseEntity;

import javax.persistence.Entity;

@Entity
public class User extends BaseEntity {

    protected String name;
    protected String login;
    protected String pass;
    protected Double balance;
    protected Double rate;

    //region set-get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
    //endregion
}
