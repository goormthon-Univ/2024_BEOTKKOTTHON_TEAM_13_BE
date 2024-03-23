package com.team13.n1.dto;


import lombok.Data;

import java.util.List;

@Data
public class PostCreateRequest {
    private String userId;
    private String title;
    private String price;
    private int type;
    private int status;
    private String images;
    private String url;
    private String contents;
    private String locationBcode;
    private String locationAddress;
    private String locationLongitude;
    private String locationLatitude;
    private int groupSize;
    private int curGroupSize;
    private String chatId;
    private List<PostIngredientDto> ingredients;
}