package dev.selena.olympicssite.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sports")
public class Sport {

    @Id
    @Column(name = "name")
    private String name;

    public Sport() {

    }

    public Sport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                '}';
    }

}
