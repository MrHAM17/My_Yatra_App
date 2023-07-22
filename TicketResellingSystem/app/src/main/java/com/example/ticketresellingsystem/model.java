package com.example.ticketresellingsystem;

public class model
{
    String name,source, destination, date, prize, email;

    public model( String name, String source, String destination, String date, String prize, String email )
    {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.prize = prize;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {return destination;}
    public void setDestination(String destination) {this.destination = destination;}

    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}

    public String getPrize() {return prize;}
    public void setPrize(String prize) {this.prize = prize;}

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {this.email = email;}
}

