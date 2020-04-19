package dev.selena.olympicssite.models;

import java.io.Serializable;
import java.util.Objects;

public class AthleteEventId implements Serializable {

    private int athleteId;

    private int eventId;

    public AthleteEventId() {

    }

    public AthleteEventId(int athleteId, int eventId) {
        this.athleteId = athleteId;
        this.eventId = eventId;
    }

    @Override
    public String toString() {
        return "AthleteEventId{" +
                "athleteId=" + athleteId +
                ", eventId=" + eventId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AthleteEventId that = (AthleteEventId) o;
        return athleteId == that.athleteId &&
                eventId == that.eventId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(athleteId, eventId);
    }

}
