package com.example.java_board.domain.post;

import lombok.Getter;

@Getter
public enum Category {

    NONE("전체");

    private final String value;

    Category(String value) {
        this.value = value;
    }
}
