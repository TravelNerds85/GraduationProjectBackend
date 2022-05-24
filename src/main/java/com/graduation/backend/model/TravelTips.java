package com.graduation.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TravelTips {

    @Id
    @GeneratedValue
    Long id;
    String name;
    String country;
    String city;
    String description;


    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    FutureTravels futureTravels;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    Users users;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    Flyer flyer;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public FutureTravels getFutureTravels() {
        return futureTravels;
    }
    public void setFutureTravels(FutureTravels futureTravels) {
        this.futureTravels = futureTravels;
    }

    public Users getUsers() { return users; }
    public void setUsers(Users users) { this.users = users; }

    public Flyer getFlyer() { return flyer; }
    public void setFlyer(Flyer flyer) { this.flyer = flyer; }
}
