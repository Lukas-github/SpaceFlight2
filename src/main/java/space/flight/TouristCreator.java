package space.flight;

import java.time.LocalDate;

public class TouristCreator {
    private String name;
    private String surname;
    private String sex;
    private String country;
    private String notes;
    private LocalDate dateOfBirth;
    //private List<String> listOfFlights; - something wrong


    public TouristCreator(String name, String surname, String sex, String country, String notes, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.country = country;
        this.notes = notes;
        this.dateOfBirth = dateOfBirth;
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
