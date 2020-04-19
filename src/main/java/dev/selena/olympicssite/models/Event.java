package dev.selena.olympicssite.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "sport")
    private String sport;

    @Column(name = "year")
    private int year;

    public Event() {

    }

    public Event(int id, String name, String sport, int year) {
        this.id = id;
        this.name = name;
        this.sport = sport;
        this.year = year;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public String getSport() { return sport; }

    public int getYear() { return year; }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                ", year=" + year +
                '}';
    }

}
