package dev.selena.olympicssite.models;

import javax.persistence.*;

@Entity
@IdClass(GameId.class)
@Table(name = "games")
public class Game {

    @Id
    @Column(name = "year")
    private int year;

    @Id
    @Column(name = "season")
    private String season;

    @Column(name = "city")
    private String city;

    public Game() {

    }

    public Game(int year, String season, String city) {
        this.year = year;
        this.season = season;
        this.city = city;
    }

    public int getYear() { return year; }

    public String getSeason() { return season; }

    public String getCity() { return city; }

    @Override
    public String toString() {
        return "Game{" +
                "year=" + year +
                ", season='" + season + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

}
