package space.flight;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Flight {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDateTime timeOfDeparture;
    private LocalDateTime timeOfArrival;
    private int numberOfPlaces;
    private int numberOfTourists;
    private double ticketPrice;


    public Flight() {
    }
    public Flight(String name, LocalDateTime timeOfDeparture, LocalDateTime timeOfArrival, int numberOfPlaces, int numberOfTourists, double ticketPrice){
        this.name=name;
        this.timeOfDeparture=timeOfDeparture;
        this.timeOfArrival=timeOfArrival;
        this.numberOfPlaces=numberOfPlaces;
        this.numberOfTourists=numberOfTourists;
        this.ticketPrice=ticketPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(LocalDateTime timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public LocalDateTime getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(LocalDateTime timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public int getNumberOfTourists() {
        return numberOfTourists;
    }

    public void setNumberOfTourists(int numberOfTourists) {
        this.numberOfTourists = numberOfTourists;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
