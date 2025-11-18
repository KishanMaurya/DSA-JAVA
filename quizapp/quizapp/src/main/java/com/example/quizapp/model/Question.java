package com.example.quizapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity()
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @JsonProperty("QuestionTitle")
    private String QuestionTitle;
    @JsonProperty("Option1")
    private String Option1;
    @JsonProperty("Option2")
    private String Option2;
    @JsonProperty("Option3")
    private String Option3;
    @JsonProperty("Option4")
    private String Option4;

    private String rightAnswer;
    private String difficultyLevel;
    private String category;
}
