package org.example.apartments.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    private Long PersonalAccount;

    private String fio;

    private String password;

    private String phone;

    public User(Long personalAccount, String fio, String password, String phone, Apartment apartment) {
        PersonalAccount = personalAccount;
        this.fio = fio;
        this.password = password;
        this.phone = phone;
        this.apartment = apartment;
    }

    public User() {

    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    @OneToOne
    @JoinColumn(name = "apartment_number", referencedColumnName = "number")
    private Apartment apartment;

    @OneToMany(mappedBy = "user")
    public List<Bill> bills = new ArrayList<>();


    public Long getPersonalAccount() {
        return PersonalAccount;
    }

    public void setPersonalAccount(Long personalAccount) {
        PersonalAccount = personalAccount;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
