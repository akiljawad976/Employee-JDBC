package com.akil.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
	@NonNull
	public int e_id;
	@NonNull
	public String e_name;
	@NonNull
	public String e_salary;
	@NonNull
	public String e_country;
	@NonNull
	public String e_city;
	@NonNull
	public String e_zipcode;

}
