package com.shawn.cafe.Service.Impl;

import com.shawn.cafe.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        log.info("Inside SignUp {}",requestMap);
        return null;
    }

    public boolean validateSignUpMap(Map<String,String> requestMap){
        if(requestMap.containsKey("name") && requestMap.containsKey("contactNumber")
        && requestMap.containsKey("email") && requestMap.containsKey("password")){
            return true;
        }
        return false;
    }
}
