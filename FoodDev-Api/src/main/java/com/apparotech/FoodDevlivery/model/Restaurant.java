package com.apparotech.FoodDevlivery.model;

import java.util.ArrayList;
import java.util.List;

//import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer restaurantId;
    private String restaurantName;
    private String  managerName;
    private String contactNumber;

    @JsonIgnore
    @OneToMany(targetEntity=Item.class, cascade = CascadeType.ALL)
    private List<Item> itemList = new ArrayList<>();
    
}
