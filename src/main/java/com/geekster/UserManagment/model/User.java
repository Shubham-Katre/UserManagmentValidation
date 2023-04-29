package com.geekster.UserManagment.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;


@Data
@AllArgsConstructor
public class User {
@NotNull
    private int userId;
@NotNull
@NotBlank
@Pattern(regexp = "^[a-zA-Z0-9]+([._]?[a-zA-Z0-9]+)*$")
    private String userName;
@Pattern(regexp = "[0-9]{2}[-|\\/]{1}[0-9]{2}[-|\\/]{1}[0-9]{4}")

    private String  dateOfBirth;
@Email
@NotEmpty(message = "Email Id should not be Empty")
    private String emailId;
@Size(min = 10, max = 12)
@Pattern(regexp = "[0-9]+")
    private String phoneNumber;
@Pattern(regexp = "[0-9]{2}[-|\\/]{1}[0-9]{2}[-|\\/]{1}[0-9]{4}")
    private String  date;
@Pattern(regexp = "^[0-2][0-3]:[0-5][0-9]$")
    private String time;





}
