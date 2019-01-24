package com.akil.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class EmployeeInfo {
	@NonNull
	public int e_id;
	@NonNull
	public String e_email;
	@NonNull
	public String e_phone; 
}
