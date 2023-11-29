package com.project.myimdb.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class MovieRating {

    private Integer ratingCounter;
    private Integer ratingSum;

}
