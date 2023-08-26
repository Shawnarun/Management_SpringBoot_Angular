package com.shawn.cafe.Utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CafeUtils {
    public CafeUtils() {
    }

    public static ResponseEntity<String> getResponseEntity(String message, HttpStatus httpStatus){
        return new ResponseEntity<>("{\"message\":\""+message+"\"}",httpStatus);
    }
}
