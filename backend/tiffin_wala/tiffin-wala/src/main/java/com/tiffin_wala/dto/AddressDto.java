package com.tiffin_wala.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

	@NotBlank
	@Length(max=256 ,message="Address should not be more than 256 charachter")
	private String Line1;

	@NotBlank
	@Length(max=256 ,message="Address should not be more than 256 charachter")
	private String Line2;
	
	@NotBlank
	private String city;
	
	@NotBlank
	@Length(max=6 ,message = "pincode should not exceeds than 6")
	private Integer pincode;
	
	@NotBlank
	private String state;
}
