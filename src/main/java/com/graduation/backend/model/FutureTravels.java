package com.graduation.backend.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.*;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class FutureTravels {

    @Id
    @GeneratedValue
    private Long id;

    private String country;
    private String area;
    private String category;
    private int duration;
    private int costs;

    @OneToOne
    TravelTips travelTips;

//    @ManyToOne
//    @JsonBackReference(value = "users-tip")
//    @JoinColumn(name = "users_id")
//    private List<Users> users;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public int getCosts() { return costs; }
    public void setCosts(int costs) { this.costs = costs; }

}
