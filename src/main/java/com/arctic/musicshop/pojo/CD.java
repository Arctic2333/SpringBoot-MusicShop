package com.arctic.musicshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CD {
    private String album;
    private String artist;
    private String country;
    private double price;
    private String img;
}
