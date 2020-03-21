package space.flight;

import java.time.LocalDateTime;

public class FlightCreator {

    private Long id;
    private String name;
    private LocalDateTime timeOfDeparture;
    private LocalDateTime timeOfArrival;
    private int numberOfSeats;
    private int numberOfTourists;
    private double ticketPrice;


    public FlightCreator(String name, LocalDateTime timeOfDeparture, LocalDateTime timeOfArrival, int numberOfSeats, int numberOfTourists, double ticketPrice) {
        this.name = name;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
        this.numberOfSeats = numberOfSeats;
        this.numberOfTourists = numberOfTourists;
        this.ticketPrice = ticketPrice;
    }

    public Long getId() {
        return id;
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

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
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
