package com.navid.onlinestoreclient.model;

import lombok.*;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    private Long id;
    private String name;
    private String email;
    private Integer age;
    private String gender;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String country;
    private String registerDate;

}
