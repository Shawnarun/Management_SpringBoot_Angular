package com.shawn.cafe.Rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping(path = "api/v1/user")
public interface UserController {

    @PostMapping(path =  "/signUp")
    public ResponseEntity<String> singUp(@RequestBody(required = true) Map<String,String> requestMap);
}
