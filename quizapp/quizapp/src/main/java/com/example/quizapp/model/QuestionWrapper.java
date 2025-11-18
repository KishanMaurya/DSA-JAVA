package com.example.quizapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class QuestionWrapper {

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

    public QuestionWrapper(Integer id, String questionTitle, String option1, String option2, String option3, String option4) {
        this.id = id;
        QuestionTitle = questionTitle;
        Option1 = option1;
        Option2 = option2;
        Option3 = option3;
        Option4 = option4;
    }
}
