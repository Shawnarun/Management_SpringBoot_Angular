package com.shawn.cafe.Rest.RestImpl;

import com.shawn.cafe.Rest.UserController;
import com.shawn.cafe.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserControllerImpl implements UserController {
    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<String> singUp(Map<String, String> requestMap) {
        try{
            return userService.signUp(requestMap);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;//
    }
}
