package org.example.apartments.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Boolean paid;
    private Float spent;

    private java.sql.Date date;

    public Bill(Float spent, Date date, User user, Utility utility) {
        this.paid = false;
        this.spent = spent;
        this.date = date;
        this.user = user;
        this.utility = utility;
    }

    public Bill() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Float getSpent() {
        return spent;
    }

    public void setSpent(Float spent) {
        this.spent = spent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Utility getUtility() {
        return utility;
    }

    public void setUtility(Utility utility) {
        this.utility = utility;
    }

    @ManyToOne
    @JoinColumn(name = "user_acc", referencedColumnName = "PersonalAccount")
    private User user;

    @ManyToOne
    @JoinColumn(name = "utility_id", referencedColumnName = "id")
    private Utility utility;

    public float get_payment(){
        return getSpent() * utility.getTariff();
    }

}
