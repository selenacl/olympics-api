package dev.selena.olympicssite.models;

import javax.persistence.*;

@Entity
@IdClass(AthleteEventId.class)
@Table(name = "athlete_events")
public class AthleteEvent {

    @Id
    @Column(name = "athlete_id")
    private int athleteId;

    @Id
    @Column(name = "event_id")
    private int eventId;

    @Column(name = "medal")
    private String medal;

    public AthleteEvent() {

    }

    public AthleteEvent(int athleteId, int eventId, String medal) {
        this.athleteId = athleteId;
        this.eventId = eventId;
        this.medal = medal;
    }

    public int getAthleteId() {
        return athleteId;
    }

    public int getEventId() {
        return eventId;
    }

    public String getMedal() {
        return medal;
    }

    @Override
    public String toString() {
        return "AthleteEvent{" +
                "athleteId=" + athleteId +
                ", eventId=" + eventId +
                ", medal='" + medal + '\'' +
                '}';
    }

}
