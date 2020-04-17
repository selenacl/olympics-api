package dev.selena.olympicssite.models;

import javax.persistence.*;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @Column(name = "noc")
    private String noc;

    @Column(name = "name")
    private String name;

    public Country() {

    }

    public Country(String noc, String name) {
        this.noc = noc;
        this.name = name;
    }

    public String getNoc() {
        return noc;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "noc='" + noc + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
