package dev.selena.olympicssite.models;

import javax.persistence.*;

@Entity
@Table(name = "athletes")
public class Athlete {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private String age;

    @Column(name = "height")
    private String height;

    @Column(name = "weight")
    private String weight;

    @Column(name = "country")
    private String country;

    public Athlete() {

    }

    public Athlete(int id, String name, String gender, String age, String height, String weight, String country) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.country = country;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public String getGender() { return gender; }

    public String getAge() { return age; }

    public String getHeight() { return height; }

    public String getWeight() { return weight; }

    public String getCountry() { return country; }

    @Override
    public String toString() {
        return "Athlete{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}
