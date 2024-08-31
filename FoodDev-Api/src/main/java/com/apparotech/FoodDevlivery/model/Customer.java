package com.apparotech.FoodDevlivery.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;
    private String fullName;
	private Integer age;
	private String gender;
	private String mobileNumber;
	private String email;

   @OneToOne(cascade=CascadeType.ALL)
   private Address address;

   @OneToOne(cascade=CascadeType.ALL)
   @JsonIgnore
   private  FoodCart foodCart;

   
}
