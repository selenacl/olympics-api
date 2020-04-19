package dev.selena.olympicssite.models;

import java.io.Serializable;
import java.util.Objects;

public class GameId implements Serializable {

    private int year;

    private String season;

    public GameId() {

    }

    public GameId(int year, String season) {
        this.year = year;
        this.season = season;
    }

    @Override
    public String toString() {
        return "GameId{" +
                "year=" + year +
                ", season='" + season + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameId gameId = (GameId) o;
        return year == gameId.year &&
                Objects.equals(season, gameId.season);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, season);
    }
}
