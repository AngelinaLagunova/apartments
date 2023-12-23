package org.example.apartments.models;

import jakarta.persistence.*;

@Entity
public class Apartment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer number;

    private Float square;

    public Apartment(Integer number, Float square) {
        this.number = number;
        this.square = square;
    }

    @OneToOne(mappedBy = "apartment")
    private User user;

    public Apartment() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getSquare() {
        return square;
    }

    public void setSquare(Float square) {
        this.square = square;
    }
}
