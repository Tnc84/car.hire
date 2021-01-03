package ro.agilehub.javacourse.car.hire.user.service;

import lombok.Getter;

public enum ErrorCode {

    DUPLICATE_USERNAME(1000),
    DUPLICATE_EMAIL(1001);

    @Getter
    private Integer code;

    ErrorCode(Integer code) {
        this.code = code;
    }
}
