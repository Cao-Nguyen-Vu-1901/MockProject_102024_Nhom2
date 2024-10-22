package com.mock_project_102024_nhom02.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import lombok.Getter;

@Getter
public enum ErrorCode {

    INVALID_PASSWORD(1004, "Password must be at least {min} characters", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED(1005, "User is not existed", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1006, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1007, "You do not have permission", HttpStatus.FORBIDDEN),

    STAFF_NOT_EXISTED(1005, "Staff is not existed", HttpStatus.NOT_FOUND),
    STAFF_EXISTED(1105, "Staff not existed", HttpStatus.BAD_REQUEST),
    ROLE_NOT_EXISTED(1006, "Role is not existed", HttpStatus.NOT_FOUND),
    ROLE_EXISTED(1106, "Role not existed", HttpStatus.BAD_REQUEST),
    ;

    ErrorCode(int code, String message, HttpStatusCode status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }

    private final int code;
    private final String message;
    private final HttpStatusCode status;
}
