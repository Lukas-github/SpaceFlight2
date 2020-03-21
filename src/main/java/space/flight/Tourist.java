package space.flight;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tourist {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String sex;
    private String country;
    private String notes;
    private LocalDate dateOfBirth;
    //private List<String> listOfFlights; - something wrong
    @ManyToOne
    @JoinColumn(name = "flight_id")
    Flight flight;

    public Tourist() {
    }

    public Tourist(String name, Flight flight, String surname, String sex, String country, String notes, LocalDate dateOfBirth){
        this.name = name;
        this.flight = flight;
        this.surname = surname;
        this.sex = sex;
        this. country = country;
        this.notes = notes;
        this.dateOfBirth=dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public Flight getFlight(){
        return flight;
    }

    public void setFlight(Flight flight){
        this.flight = flight;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
