package com.xworkz.mavjan17.dto;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class TerroristsDTO extends AbstractAuditDTO{
	
	@NonNull
	@NotNull(message="Terrorist name cannot be null")
	@Size(min=3,max=20,message="name is invalid should be more than 3")
	private String name;
	
	@NonNull
	@Min(value=5,message="Age should be greather than 5")
	@Max(value=100,message="Age should be lesser than 100")
	private int age;
	
	@NonNull
	@NotNull(message="Terrorist Country cannot be null")
	@Size(min=5,max=30,message="Terrorist Country more than 5 or less than 30")
	private String country;
	private boolean alive;
	private boolean prison;
	
	@NonNull
	@NotNull(message="Terrorist organization cannot be null")
	@Size(min=5,max=30,message="Terrorist organization more than 5 or less than 30")
	private String organization;
	
	@NonNull
	@NotNull(message="Terrorist specialization cannot be null")
	@Size(min=5,max=30,message="Terrorist specialization more than 5 or less than 30")
	private String specialization;

}
